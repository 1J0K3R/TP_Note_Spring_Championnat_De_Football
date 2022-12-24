package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany // un stade a plusieurs équipe
    private List<Equipe> Equipe;
    @OneToMany // un stade a plusieurs Match
    private List<Match> Match;
    private String Nom;
    private String Adresse;
    private Integer Capacite;
    private String Telephone;

    public Stade(List<Equipe> equipe, List<Match> match, String nom, String adresse, Integer capacite, String telephone) {
        Equipe = equipe;
        Match = match;
        Nom = nom;
        Adresse = adresse;
        Capacite = capacite;
        Telephone = telephone;
    }

    public Stade() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe> getEquipe() {
        return Equipe;
    }

    public void setEquipe(List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe> equipe) {
        Equipe = equipe;
    }

    public List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match> getMatch() {
        return Match;
    }

    public void setMatch(List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match> match) {
        Match = match;
    }

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
}
