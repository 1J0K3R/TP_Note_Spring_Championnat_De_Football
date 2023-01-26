package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

@Entity
public class Match {
    // Propriétées
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer PointsEquipe1;
    private Integer PointsEquipe2;

    // Constructeurs
    public Match(Integer pointsEquipe1, Integer pointsEquipe2) {
        PointsEquipe1 = pointsEquipe1;
        PointsEquipe2 = pointsEquipe2;
    }
    public Match() {

    }

    // Getter et Setter
    public Stade getStade() { return Stade; }

    public void setStade(Stade stade) { Stade = stade; }

    public Equipe getEquipe1() { return Equipe1; }

    public void setEquipe1(Equipe equipe1) { Equipe1 = equipe1; }

    public Equipe getEquipe2() { return Equipe2; }

    public void setEquipe2(Equipe equipe2) { Equipe2 = equipe2; }

    public Journee getJournee() { return Journee; }

    public void setJournee(Journee journee) { Journee = journee; }

    public Integer getPointsEquipe1() { return PointsEquipe1; }

    public void setPointsEquipe1(Integer pointsEquipe1) { PointsEquipe1 = pointsEquipe1; }

    public Integer getPointsEquipe2() { return PointsEquipe2; }

    public void setPointsEquipe2(Integer pointsEquipe2) { PointsEquipe2 = pointsEquipe2; }

    // Relations exterieurs
    @ManyToOne
    private Stade Stade;
    @ManyToOne
    private Equipe Equipe1;
    @ManyToOne
    private Equipe Equipe2;
    @ManyToOne
    private Journee Journee;
}
