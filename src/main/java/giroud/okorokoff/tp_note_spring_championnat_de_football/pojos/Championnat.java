package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Pays Pays;
    @OneToMany
    private List<Equipe> Equipe;
    @OneToMany
    private List<Journee> Journee;
    private String nom;
    private String logo;
    private Date dateDebut;
    private Date dateFin;
    private Integer pointGagner;
    private Integer pointPerdu;
    private Integer pointNul;
    private String typeClassement;
}
