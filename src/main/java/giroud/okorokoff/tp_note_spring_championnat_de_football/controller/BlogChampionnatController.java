package giroud.okorokoff.tp_note_spring_championnat_de_football.controller;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Connexion;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.User;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.*;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class BlogChampionnatController {
    private ChampionnatService championnatService;
    private EquipeService equipeService;
    private JourneeService journeeService;
    private MatchService matchService;
    private PaysService paysService;
    private StadeService stadeService;
    private UserService userService;

    private HttpSession httpSession;

    public BlogChampionnatController(ChampionnatService championnatService,
                                     EquipeService equipeService,
                                     JourneeService journeeService,
                                     MatchService matchService,
                                     PaysService paysService,
                                     StadeService stadeService,
                                     UserService userService,HttpSession httpSession) {

        this.championnatService = championnatService;
        this.equipeService = equipeService;
        this.journeeService = journeeService;
        this.matchService = matchService;
        this.paysService = paysService;
        this.stadeService = stadeService;
        this.userService = userService;
        this.httpSession = httpSession;
    }

    @GetMapping({ "index", "index.html"})
    public String index(Model model){
        return "index";
    }

    // Page de connexion
    @GetMapping({"/", "connexion"})
    public String connexionFrom(Model model, @ModelAttribute Connexion connexion) {
        // ...
        return "connexion";
    }

    @PostMapping("connexion")
    public String connexion(Model model,
                            @Validated @ModelAttribute Connexion connexion,
                            BindingResult bindingResult) {

        if (!bindingResult.hasErrors()) {

            User user = userService.recupererUser(connexion.getPseudo());
            // test si les mdp sont identique
            if (user.getMdp().equals(connexion.getMdp())) {
                // ajoute le membre dans la session
                httpSession.setAttribute("user", user);

                // redirige sur la page d'acceuil
                return "redirect:/index";
            }
        }

        return "connexion";
    }
    @GetMapping("deconnexion")
    public String connexionFrom() {

        httpSession.invalidate();

        // redirige sur la page d'acceuil
        return "redirect:/index";
    }

    @GetMapping({"championnat.html"})
    public String championnat(Model model){
        // récupere la liste des championnats
        List<Championnat> championnats = championnatService.recupererChampionnats();
        // envoie les données à la vue
        model.addAttribute("championnats", championnats);
        return "championnat";
    }

    @GetMapping({"create_champ"})
    public String create_champ(Model model, @ModelAttribute Championnat championnat){
        return "create_champ";
    }

    @PostMapping("create_champ")
    public String create_champ(Model model,
                              @Validated @ModelAttribute Championnat championnat,
                              BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            championnat.setDateDebut(new Date());
            championnatService.ajouterChampionnat(championnat);

            // redirige sur la page d'acceuil
            return "redirect:/index";
        }

        return "create_champ";
    }

    @GetMapping({"modif_champ.html"})
    public String modif_champ(){
        return "modif_champ";
    }

    @GetMapping({"creat_equipe.html"})
    public String creat_equipe(){
        return "creat_equipe";
    }

    @GetMapping({"modif_equipe.html"})
    public String modif_equipe(){
        return "modif_equipe";
    }
    @GetMapping({"resultat.html"})
    public String resultat(){
        return "resultat";
    }

    @GetMapping({"equipe.html"})
    public String equipe(){
        return "equipe";
    }

}
