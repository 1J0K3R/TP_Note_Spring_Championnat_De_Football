package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

@Entity
public class Matchs {
    // Propriétées
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer pointsEquipe1;
    private Integer pointsEquipe2;

    // Constructeurs
    public Matchs(Integer pointsEquipe1, Integer pointsEquipe2) {
        this.pointsEquipe1 = pointsEquipe1;
        this.pointsEquipe2 = pointsEquipe2;
    }
    public Matchs() {

    }

    // Getter et Setter
    public Stade getStade() { return stade; }

    public void setStade(Stade stade) { this.stade = stade; }

    public Equipe getEquipe1() { return equipe1; }

    public void setEquipe1(Equipe equipe1) { this.equipe1 = equipe1; }

    public Equipe getEquipe2() { return equipe2; }

    public void setEquipe2(Equipe equipe2) { this.equipe2 = equipe2; }

    public Journee getJournee() { return journee; }

    public void setJournee(Journee journee) { this.journee = journee; }

    public Integer getPointsEquipe1() { return pointsEquipe1; }

    public void setPointsEquipe1(Integer pointsEquipe1) { this.pointsEquipe1 = pointsEquipe1; }

    public Integer getPointsEquipe2() { return pointsEquipe2; }

    public void setPointsEquipe2(Integer pointsEquipe2) { this.pointsEquipe2 = pointsEquipe2; }

    // Relations exterieurs
    @ManyToOne
    private Stade stade;
    @ManyToOne
    private Equipe equipe1;
    @ManyToOne
    private Equipe equipe2;
    @ManyToOne
    private Journee journee;
}
