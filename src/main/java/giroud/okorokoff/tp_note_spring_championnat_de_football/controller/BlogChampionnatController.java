package giroud.okorokoff.tp_note_spring_championnat_de_football.controller;

import giroud.okorokoff.tp_note_spring_championnat_de_football.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping({"/", "index"})
    public String index(){
        return "index";
    }
}
