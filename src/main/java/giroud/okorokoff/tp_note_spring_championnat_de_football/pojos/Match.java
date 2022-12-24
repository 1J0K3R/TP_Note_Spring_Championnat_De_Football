package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Match(giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade stade, Equipe equipe1, Equipe equipe2, giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee journee, Integer pointsEquipe1, Integer pointsEquipe2, Long idStade, Long idEquipe1, Long idEquipe2, Long idJournee) {
        Stade = stade;
        Equipe1 = equipe1;
        Equipe2 = equipe2;
        Journee = journee;
        PointsEquipe1 = pointsEquipe1;
        PointsEquipe2 = pointsEquipe2;
        IdStade = idStade;
        IdEquipe1 = idEquipe1;
        IdEquipe2 = idEquipe2;
        IdJournee = idJournee;
    }

    public Match() {

    }

    public giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade getStade() {
        return Stade;
    }

    public void setStade(giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade stade) {
        Stade = stade;
    }

    public Equipe getEquipe1() {
        return Equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        Equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return Equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        Equipe2 = equipe2;
    }

    public giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee getJournee() {
        return Journee;
    }

    public void setJournee(giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee journee) {
        Journee = journee;
    }

    public Integer getPointsEquipe1() {
        return PointsEquipe1;
    }

    public void setPointsEquipe1(Integer pointsEquipe1) {
        PointsEquipe1 = pointsEquipe1;
    }

    public Integer getPointsEquipe2() {
        return PointsEquipe2;
    }

    public void setPointsEquipe2(Integer pointsEquipe2) {
        PointsEquipe2 = pointsEquipe2;
    }

    public Long getIdStade() {
        return IdStade;
    }

    public void setIdStade(Long idStade) {
        IdStade = idStade;
    }

    public Long getIdEquipe1() {
        return IdEquipe1;
    }

    public void setIdEquipe1(Long idEquipe1) {
        IdEquipe1 = idEquipe1;
    }

    public Long getIdEquipe2() {
        return IdEquipe2;
    }

    public void setIdEquipe2(Long idEquipe2) {
        IdEquipe2 = idEquipe2;
    }

    public Long getIdJournee() {
        return IdJournee;
    }

    public void setIdJournee(Long idJournee) {
        IdJournee = idJournee;
    }

    @ManyToOne
    private Stade Stade;
    @ManyToOne
    private Equipe Equipe1;
    @ManyToOne
    private Equipe Equipe2;
    @ManyToOne
    private Journee Journee;
    private Integer PointsEquipe1;
    private Integer PointsEquipe2;

    //Foreignkey
    private Long IdStade;
    private Long IdEquipe1;
    private Long IdEquipe2;
    private Long IdJournee;

}
