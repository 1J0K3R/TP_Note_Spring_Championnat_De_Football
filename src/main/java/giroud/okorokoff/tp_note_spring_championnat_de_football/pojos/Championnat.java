package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String logo;

    private Date dateDebut;
    private Date dateFin;
    private Integer pointGagner;
    private Integer pointPerdu;
    private Integer pointNul;
}
