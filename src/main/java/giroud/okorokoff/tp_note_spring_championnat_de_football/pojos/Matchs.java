package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;
import java.util.List;

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

    public List<Equipe> getEquipe() {
        return equipe;
    }
    public void setEquipe(List<Equipe> equipe) { this.equipe = equipe; }

    public Journee getJournee() { return journee; }

    public void setJournee(Journee journee) { this.journee = journee; }

    public Integer getPointsEquipe1() { return pointsEquipe1; }

    public void setPointsEquipe1(Integer pointsEquipe1) { this.pointsEquipe1 = pointsEquipe1; }

    public Integer getPointsEquipe2() { return pointsEquipe2; }

    public void setPointsEquipe2(Integer pointsEquipe2) { this.pointsEquipe2 = pointsEquipe2; }

    // Relations exterieurs
    @ManyToOne
    private Stade stade;
    @ManyToMany//(mappedBy="match")
    @JoinTable(
            name = "match_equipe",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "equipe_id")
    )
    private List<Equipe> equipe;
    @ManyToOne
    private Journee journee;
}
