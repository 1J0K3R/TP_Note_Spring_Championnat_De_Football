package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Championnat> Championnat;
    @ManyToOne
    private Stade Stade;
    @OneToMany
    private List<Match> Match;
    private String nom;
    private Date DateCreation;
    private Long IdStade;
    private String Logo;
    private String NomEntraineur;
    private String President;
    private String Status;
    private String Siege;
    private String Telephone;
    private String SiteWeb;
}
