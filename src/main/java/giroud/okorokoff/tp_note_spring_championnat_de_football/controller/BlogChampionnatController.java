package giroud.okorokoff.tp_note_spring_championnat_de_football.controller;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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

    public BlogChampionnatController(ChampionnatService championnatService,
                                     EquipeService equipeService,
                                     JourneeService journeeService,
                                     MatchService matchService,
                                     PaysService paysService,
                                     StadeService stadeService,
                                     UserService userService) {

        this.championnatService = championnatService;
        this.equipeService = equipeService;
        this.journeeService = journeeService;
        this.matchService = matchService;
        this.paysService = paysService;
        this.stadeService = stadeService;
        this.userService = userService;
    }

    @GetMapping({"/", "index", "index.html"})
    public String index(Model model){
        // récupere la liste des championnats
        List<Championnat> championnats = championnatService.recupererChampionnats();

        // envoie les données à la vue
        model.addAttribute("championnats", championnats);

        return "index";
    }

    @GetMapping({"championnat.html"})
    public String championnat(){
        return "championnat";
    }

    @GetMapping({"create_champ.html"})
    public String create_champ(){
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
