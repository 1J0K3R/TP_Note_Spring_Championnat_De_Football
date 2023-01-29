package giroud.okorokoff.tp_note_spring_championnat_de_football;


import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Matchs;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.ChampionnatService;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.EquipeService;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.MatchService;

import java.util.Date;
import java.util.List;

/*
Cette classe était destiné à faire la liaison entre la table équipe et championnat afin de récupérer les matchs d'une équipe d'un championnat particulier et non tout les matchs d'une équipe
 */
public class EquipeChamp  {
    private ChampionnatService championnatService;
    private EquipeService equipeService;
    private MatchService matchService;
    private Equipe equipe;
    private Championnat championnat;
    private Integer numberJournee;
    private Integer pointsVictoire;
    private Integer pointsNul;
    private Integer pointsPerdu;
    private Integer butPour;
    private Integer butContre;
    private Integer goalAverage;
    private Integer points;

    public EquipeChamp(Equipe equipe, Championnat championnat) {
        this.equipe = equipe;
        this.championnat = championnat;
    }


    public Integer getNumberJournee() {
        // recupérer les match d'une équipe
        List<Matchs> matchs = matchService.recupererMatchs(equipe);

        //

        return numberJournee;
    }

    public void setNumberJournee(Integer numberJournee) {
        this.numberJournee = numberJournee;
    }

    public Integer getPointsVictoire() {
        return pointsVictoire;
    }

    public void setPointsVictoire(Integer pointsVictoire) {
        this.pointsVictoire = pointsVictoire;
    }

    public Integer getPointsNul() {
        return pointsNul;
    }

    public void setPointsNul(Integer pointsNul) {
        this.pointsNul = pointsNul;
    }

    public Integer getPointsPerdu() {
        return pointsPerdu;
    }

    public void setPointsPerdu(Integer pointsPerdu) {
        this.pointsPerdu = pointsPerdu;
    }

    public Integer getButPour() {
        return butPour;
    }

    public void setButPour(Integer butPour) {
        this.butPour = butPour;
    }

    public Integer getButContre() {
        return butContre;
    }

    public void setButContre(Integer butContre) {
        this.butContre = butContre;
    }

    public Integer getGoalAverage() {
        return goalAverage;
    }

    public void setGoalAverage(Integer goalAverage) {
        this.goalAverage = goalAverage;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
