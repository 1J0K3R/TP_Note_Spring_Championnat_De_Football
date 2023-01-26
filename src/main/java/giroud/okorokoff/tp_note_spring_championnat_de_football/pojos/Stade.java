package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

import java.util.List;


@Entity
public class Stade {
    // Propriétées
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Adresse;
    private Integer Capacite;
    private String Telephone;

    // Constructeurs
    public Stade(String nom, String adresse, Integer capacite, String telephone) {
        Nom = nom;
        Adresse = adresse;
        Capacite = capacite;
        Telephone = telephone;
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
        return Equipe;
    }
    public void setEquipe(List<Equipe> equipe) { Equipe = equipe; }

    public List<Matchs> getMatch() {
        return Match;
    }
    public void setMatch(List<Matchs> match) { Match = match; }

    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }
    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public Integer getCapacite() {
        return Capacite;
    }
    public void setCapacite(Integer capacite) {
        Capacite = capacite;
    }

    public String getTelephone() {
        return Telephone;
    }
    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    // Relation exterieur
    @OneToMany(mappedBy="Stade")
    private List<Equipe> Equipe;
    @OneToMany(mappedBy="Stade")
    private List<Matchs> Match;
}
