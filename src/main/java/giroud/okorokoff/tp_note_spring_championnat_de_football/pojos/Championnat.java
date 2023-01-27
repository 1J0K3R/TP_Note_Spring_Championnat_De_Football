package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Championnat {
    // Propriétés
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
    private String typeClassement;

    // Constructeurs

    public Championnat(String nom, String logo, Date dateDebut, Date dateFin, Integer pointGagner, Integer pointPerdu, Integer pointNul, String typeClassement) {
        this.nom = nom;
        this.logo = logo;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.pointGagner = pointGagner;
        this.pointPerdu = pointPerdu;
        this.pointNul = pointNul;
        this.typeClassement = typeClassement;
    }

    public Championnat() {

    }

    // Relations exterieurs
    @ManyToOne
    private Pays pays;
    @ManyToMany//(mappedBy = "championnat")
    @JoinTable(
            name = "championnat_equipe",
            joinColumns = @JoinColumn(name = "championnat_id"),
            inverseJoinColumns = @JoinColumn(name = "equipe_id")
    )
    private List<Equipe> equipe;
    @OneToMany(mappedBy="championnat")
    private List<Journee> journee;

    // Getter et Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Pays getPays() {
        return pays;
    }
    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<Equipe> getEquipe() {
        return equipe;
    }
    public void setEquipe(List<Equipe> equipe) { this.equipe = equipe; }

    public List<Journee> getJournee() {
        return journee;
    }
    public void setJournee(List<Journee> journee) { this.journee = journee; }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getPointGagner() {
        return pointGagner;
    }
    public void setPointGagner(Integer pointGagner) {
        this.pointGagner = pointGagner;
    }

    public Integer getPointPerdu() {
        return pointPerdu;
    }
    public void setPointPerdu(Integer pointPerdu) {
        this.pointPerdu = pointPerdu;
    }

    public Integer getPointNul() {
        return pointNul;
    }
    public void setPointNul(Integer pointNul) {
        this.pointNul = pointNul;
    }

    public String getTypeClassement() {
        return typeClassement;
    }
    public void setTypeClassement(String typeClassement) {
        this.typeClassement = typeClassement;
    }
}
