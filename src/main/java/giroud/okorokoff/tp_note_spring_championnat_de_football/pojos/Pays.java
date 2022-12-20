package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

@Entity
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Championnat Championnat;
    private String nom;
    private String logo;

    public Pays(Championnat championnat, String nom, String logo) {
        Championnat = championnat;
        this.nom = nom;
        this.logo = logo;
    }

    public Pays() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Championnat getChampionnat() {
        return Championnat;
    }

    public void setChampionnat(Championnat championnat) {
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
}
