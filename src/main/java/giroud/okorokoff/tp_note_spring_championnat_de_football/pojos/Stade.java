package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

import java.util.List;


@Entity
public class Stade {
    // Propriétées
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private Integer capacite;
    private String telephone;

    // Constructeurs
    public Stade(String nom, String adresse, Integer capacite, String telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.telephone = telephone;
    }
    public Stade() {

    }

    // Getter et Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Equipe> getEquipe() {
        return equipe;
    }
    public void setEquipe(List<Equipe> equipe) { this.equipe = equipe; }

    public List<Matchs> getMatch() {
        return match;
    }
    public void setMatch(List<Matchs> match) { this.match = match; }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getCapacite() {
        return capacite;
    }
    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Relation exterieur
    @OneToMany(mappedBy="stade")
    private List<Equipe> equipe;
    @OneToMany(mappedBy="stade")
    private List<Matchs> match;
}
