package giroud.okorokoff.tp_note_spring_championnat_de_football.controller;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.*;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Controller
public class ChampionnatController {
    private ChampionnatService championnatService;
    private EquipeService equipeService;
    private JourneeService journeeService;
    private MatchService matchService;
    private PaysService paysService;
    private StadeService stadeService;
    private UserService userService;

    public ChampionnatController(ChampionnatService championnatService, EquipeService equipeService, JourneeService journeeService, MatchService matchService, PaysService paysService, StadeService stadeService, UserService userService) {
        super();
        this.championnatService = championnatService;
        this.equipeService = equipeService;
        this.journeeService = journeeService;
        this.matchService = matchService;
        this.paysService = paysService;
        this.stadeService = stadeService;
        this.userService = userService;
    }

    @PostConstruct
    private void init(){
        if(userService.recupererUsers().isEmpty()){
            User user = new User("Guillet","Jean", "jean.guillet", "jeanGuiGui2", "Gui", "JeanGui@test.com");
            userService.ajouterUser(user);
            user = new User("Villard","Luc", "Luc.Villard", "Vivi123", "Lulu", "Luc.villlard@test.com");
            userService.ajouterUser(user);
        }

        if(paysService.recupererLesPays().isEmpty()){
            Pays pays = new Pays("France", "Drapeau_France.png");
            paysService.ajouterPays(pays);
            pays = new Pays("Italie", "Drapeau_Italie.png");
            paysService.ajouterPays(pays);
            pays = new Pays("Espagne", "Drapeau_Espagne.png");
            paysService.ajouterPays(pays);
        }

        if(stadeService.recupererStades().isEmpty()){
                // FRANCE
            Stade stade = new Stade("Groupama Stadium", "10 Av. Simone Veil, 69150 Décines-Charpieu", 59186, "+33 892 69 69 69");
            stadeService.ajouterStade(stade);
            stade = new Stade("Parc des Princes", "24 Rue du Commandant Guilbaud, 75016 Paris", 47929, "+33 XXX XX XX XX");
            stadeService.ajouterStade(stade);
            stade = new Stade("Orange Vélodrome", "3 Bd Michelet, 13008 Marseille", 67394, "+33 413 64 64 64");
            stadeService.ajouterStade(stade);

                // ESPAGNE
            stade = new Stade("Santiago-Bernabéu", "Av. de Concha Espina, 1, 28036 Madrid, Espagne", 81044, "+34 913 98 43 00");
            stadeService.ajouterStade(stade);
            stade = new Stade("Camp Nou", "C. d'Arístides Maillol, 12, 08028 Barcelona, Espagne", 99354, "+34 902 18 99 00");
            stadeService.ajouterStade(stade);
            stade = new Stade("Wanda Metropolitano", "Av. de Luis Aragonés, 4, 28022 Madrid, Espagne", 68456, "+34 917 26 04 03");
            stadeService.ajouterStade(stade);

                // ITALIE
            stade = new Stade("San Siro", "Piazzale Angelo Moratti, 20151 Milano MI, Italie", 80018, "+39 02 4879 8201");
            stadeService.ajouterStade(stade);
            stade = new Stade("Juventus Stadium", "Corso Gaetano Scirea, 50, 10151 Torino TO, Italie", 41507, "+39 011 453 0486");
            stadeService.ajouterStade(stade);
            stade = new Stade("Diego Armando Maradona Stadium", "Piazzale Vincenzo Tecchio, 80125 Napoli NA, Italie", 54726, "+39 081 509 5344");
            stadeService.ajouterStade(stade);

        }

        if(championnatService.recupererChampionnats().isEmpty()){
                // FRANCE
            Championnat championnat = new Championnat("Ligue 1", "ligue1.png", Date.valueOf("2022-08-06"), Date.valueOf("2023-05-21"), 3, 0, 1, "Par points");
            championnat.setPays(paysService.recupererPays("France"));
            championnat.setEquipe(Arrays.asList());
            championnatService.ajouterChampionnat(championnat);
            championnat = new Championnat("Ligue 2", "ligue2.png", Date.valueOf("2022-08-06"), Date.valueOf("2023-05-21"), 3, 0, 1, "Par points");
            championnat.setPays(paysService.recupererPays("France"));
            championnatService.ajouterChampionnat(championnat);

                // ESPAGNE
            championnat = new Championnat("La Liga", "LaLiga.png", Date.valueOf("2022-08-06"), Date.valueOf("2023-05-21"), 3, 0, 1, "Par points");
            championnat.setPays(paysService.recupererPays("Espagne"));
            championnatService.ajouterChampionnat(championnat);
            championnat = new Championnat("La Liga 2", "LaLiga2.png", Date.valueOf("2022-08-06"), Date.valueOf("2023-05-21"), 3, 0, 1, "Par points");
            championnat.setPays(paysService.recupererPays("Espagne"));
            championnatService.ajouterChampionnat(championnat);

                // ITALIE
            championnat = new Championnat("Serie A", "SerieA.png", Date.valueOf("2022-08-06"), Date.valueOf("2023-05-21"), 3, 0, 1, "Par points");
            championnat.setPays(paysService.recupererPays("Italie"));
            championnatService.ajouterChampionnat(championnat);
            championnat = new Championnat("Serie B", "SerieB.png", Date.valueOf("2022-08-06"), Date.valueOf("2023-05-21"), 3, 0, 1, "Par points");
            championnat.setPays(paysService.recupererPays("Italie"));
            championnatService.ajouterChampionnat(championnat);
        }

        if(equipeService.recupererEquipes().isEmpty()){
            // France Ligue 1
            Equipe equipe = new Equipe("Olympique lyonnais", Date.valueOf("1950"), "OL.png", "Laurent Blanc", "Jean-Michel Aulas", "SASU", "10 AV SIMONE VEIL, 69150 DECINES-CHARPIEU", "+33 892 69 69 69", "https://www.ol.fr");
            equipe.setStade(stadeService.recupererStade("Groupama Stadium"));
            List<Championnat> championnats = Arrays.asList(championnatService.recupererChampionnat("Ligue 1"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Olympique de Marseille", Date.valueOf("1899"), "OM.png", "Igor Tudor", "Pablo Longoria", "SA", "33 TRA DE LA MARTINE 13012 MARSEILLE", "+33 484 45 38 00", "https://www.om.fr");
            equipe.setStade(stadeService.recupererStade("Orange Vélodrome"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("Ligue 1"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Paris Saint-Germain", Date.valueOf("1970"), "PSG.png", "Christophe Galtier", "Nasser al-Khelaïfi", "SAS", "24 rue du Commandant-Guilbaud 75016 PARIS", "+33 892 69 69 69", "https://www.psg.fr/");
            equipe.setStade(stadeService.recupererStade("Parc des Princes"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("Ligue 1"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            // France Ligue 2
            equipe = new Equipe("Association Sportive de Saint-Étienne", Date.valueOf("1919"), "ASSE.png", "Laurent Batlles", "Roland Romeyer", "ASS", "14 Rue Paul et Pierre Guichard - 42000 Saint-Étienne ", "+33 477 92 31 70", "https://www.asse.fr/");
            championnats = Arrays.asList(championnatService.recupererChampionnat("Ligue 2"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Football Club des Girondins de Bordeaux", Date.valueOf("1920"), "FCBordeaux.png", "David Guion", "Gérard Lopez", "SA", "Rue Joliot Curie CS10033 33187 Le Haillan RCS B 383 872 892.", "+33 XXX XX XX XX", "https://www.om.fr");
            championnats = Arrays.asList(championnatService.recupererChampionnat("Ligue 2"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            // ESPAGNE La Liga
            equipe = new Equipe("Real Madrid", Date.valueOf("1902"), "RealMadrid.png", "Carlo Ancelotti", "Florentino Pérez", "Association ", "CITÉ REAL MADRID Camino Sintra s/n 28055 Madrid", "+34 902 32 18 09", "https://www.realmadrid.com");
            equipe.setStade(stadeService.recupererStade("Santiago-Bernabéu"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("La Liga"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("FC Barcelone", Date.valueOf("1899"), "FCB.png", "Xavi", "Joan Laporta", "Association", "Palau Blaugrana 2", "+33 XXX XX XX XX", "https://www.fcbarcelona.com/");
            equipe.setStade(stadeService.recupererStade("Camp Nou"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("La Liga"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Atlético de Madrid", Date.valueOf("1903"), "AtleticoMadrid.png", "Diego Simeone", "Enrique Cerezo", "Association", "Avenida Luis Aragonés n°4 28 022 Madrid", "++34 91 726 04 03", "https://en.atleticodemadrid.com/");
            equipe.setStade(stadeService.recupererStade("Wanda Metropolitano"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("La Liga"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            // ESPAGNE La Liga 2
            equipe = new Equipe("Levante U.D.", Date.valueOf("1909"), "Levante.png", "Javier Calleja", "Francisco Catalán", "Association", "34, Paseo Alameda; 46023 Valence", "+33 963 37 95 30", "https://www.levanteud.com");
            championnats = Arrays.asList(championnatService.recupererChampionnat("La Liga 2"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Málaga C.F.", Date.valueOf("1904"), "Malaga.png", "Pepe Mel", "Abdullah bin Nasser bin Abdullah Al Ahmed Al Thani", "Association", "Paseo de Martiricos s/n 29011, Málaga", "+33 952 10 44 88", "https://www.malagacf.com/");
            championnats = Arrays.asList(championnatService.recupererChampionnat("La Liga 2"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            // ITALIE Série A
            equipe = new Equipe("AC Milan", Date.valueOf("1899"), "Milan.png", "Stefano Pioli", "Paolo Scaroni", "Association ", "Via Aldo Rossi, 8 20149 Milan", "+39 02 6228 4545", "https://www.acmilan.com/");
            equipe.setStade(stadeService.recupererStade("San Siro"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("Serie A"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Juventus", Date.valueOf("1897"), "Juventus.png", "Massimiliano Allegri", "Andrea Agnelli", "Association ", "Via Druento 175, 10151 Turin, Italie", "+39 899 999 897", "https://www.juventus.com");
            equipe.setStade(stadeService.recupererStade("Juventus Stadium"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("Serie A"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Naples", Date.valueOf(""), "Naples.png", "Luciano Spalletti", "Aurelio De Laurentiis", "Association ", "Via Alcide De Gasperi, 33 80100 Naples", "+39 812 39 56 23", "https://sscnapoli.it");
            equipe.setStade(stadeService.recupererStade("Diego Armando Maradona Stadium"));
            championnats = Arrays.asList(championnatService.recupererChampionnat("Serie A"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            //Italie Série B
            equipe = new Equipe("Frosinone Calcio", Date.valueOf("1928"), "Frosinone.png", "Fabio Grosso", "Maurizio Stirpe", "Association ", "Viale Olimpia, 03100 Frosinone ,Italie", "+39 775 82 20 13", "https://www.frosinonecalcio.com/");
            championnats = Arrays.asList(championnatService.recupererChampionnat("Serie B"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);

            equipe = new Equipe("Reggina 1914", Date.valueOf("1914"), "Reggina.png", "Filippo Inzaghi", "Marcello Cardona", "Association ", "Via T. Gulli, 1 89127 Reggio de Calabre", "+39 289 65 10 83", "https://www.reggina1914.it/");
            championnats = Arrays.asList(championnatService.recupererChampionnat("Serie B"));
            equipe.setChampionnat(championnats);
            equipeService.ajouterEquipe(equipe);
        }

        if(journeeService.recupererJournees().isEmpty()){
            Journee journee = new Journee(1);
            journee.setChampionnat(championnatService.recupererChampionnat("Ligue 1"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(1);
            journee.setChampionnat(championnatService.recupererChampionnat("Ligue 2"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(1);
            journee.setChampionnat(championnatService.recupererChampionnat("La Liga"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(1);
            journee.setChampionnat(championnatService.recupererChampionnat("La Liga 2"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(1);
            journee.setChampionnat(championnatService.recupererChampionnat("Serie A"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(1);
            journee.setChampionnat(championnatService.recupererChampionnat("Serie B"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(2);
            journee.setChampionnat(championnatService.recupererChampionnat("Ligue 1"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(2);
            journee.setChampionnat(championnatService.recupererChampionnat("Ligue 2"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(2);
            journee.setChampionnat(championnatService.recupererChampionnat("La Liga"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(2);
            journee.setChampionnat(championnatService.recupererChampionnat("La Liga 2"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(2);
            journee.setChampionnat(championnatService.recupererChampionnat("Serie A"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(2);
            journee.setChampionnat(championnatService.recupererChampionnat("Serie B"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(3);
            journee.setChampionnat(championnatService.recupererChampionnat("Ligue 1"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(3);
            journee.setChampionnat(championnatService.recupererChampionnat("Ligue 2"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(3);
            journee.setChampionnat(championnatService.recupererChampionnat("La Liga"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(3);
            journee.setChampionnat(championnatService.recupererChampionnat("La Liga 2"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(3);
            journee.setChampionnat(championnatService.recupererChampionnat("Serie A"));
            journeeService.ajouterJournee(journee);

            journee = new Journee(3);
            journee.setChampionnat(championnatService.recupererChampionnat("Serie B"));
            journeeService.ajouterJournee(journee);
        }

        if(matchService.recupererMatchs().isEmpty()){
            Match match = new Match(2, 0);
            match.setEquipe1(equipeService.recupererEquipe("Olympique lyonnais"));
            match.setEquipe2(equipeService.recupererEquipe("Olympique de Marseille"));
            match.setJournee(journeeService.recupererJournee(1,championnatService.recupererChampionnat("Ligue 1")));
            match.setStade(stadeService.recupererStade("Groupama Stadium"));
            matchService.ajouterMatch(match);

            match = new Match(2, 2);
            match.setEquipe1(equipeService.recupererEquipe("Real Madrid"));
            match.setEquipe2(equipeService.recupererEquipe("FC Barcelone"));
            match.setJournee(journeeService.recupererJournee(1,championnatService.recupererChampionnat("La Liga")));
            match.setStade(stadeService.recupererStade("Camp Nou"));
            matchService.ajouterMatch(match);

            match = new Match(2, 4);
            match.setEquipe1(equipeService.recupererEquipe("AC Milan"));
            match.setEquipe2(equipeService.recupererEquipe("Juventus"));
            match.setJournee(journeeService.recupererJournee(1,championnatService.recupererChampionnat("Serie A")));
            match.setStade(stadeService.recupererStade("San Siro"));
            matchService.ajouterMatch(match);
        }
    }
}
