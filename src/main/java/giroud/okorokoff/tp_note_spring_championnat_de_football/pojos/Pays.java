package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

import java.util.List;

@Entity
public class Pays {
    // Propriétées
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String logo;

    // Constructeur
    public Pays( String nom, String logo) {
        this.nom = nom;
        this.logo = logo;
    }
    public Pays() {

    }

    // Getter et Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Championnat> getChampionnat() {
        return Championnat;
    }

    public void setChampionnat(List<Championnat> championnat) {
        Championnat = championnat;
    }

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

    // Relation exterieurs
    @OneToMany
    private List<Championnat> Championnat;
}
