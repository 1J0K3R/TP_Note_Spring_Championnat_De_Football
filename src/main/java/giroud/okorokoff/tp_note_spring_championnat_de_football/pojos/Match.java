package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
