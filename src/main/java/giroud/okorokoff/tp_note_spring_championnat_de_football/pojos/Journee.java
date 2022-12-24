package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Journee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Championnat Championnat;

    public Journee(giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat championnat, List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match> match, Integer numero, Long idChampionnat) {
        Championnat = championnat;
        Match = match;
        Numero = numero;
        IdChampionnat = idChampionnat;
    }

    public Journee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat getChampionnat() {
        return Championnat;
    }

    public void setChampionnat(giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat championnat) {
        Championnat = championnat;
    }

    public List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match> getMatch() {
        return Match;
    }

    public void setMatch(List<giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match> match) {
        Match = match;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public Long getIdChampionnat() {
        return IdChampionnat;
    }

    public void setIdChampionnat(Long idChampionnat) {
        IdChampionnat = idChampionnat;
    }

    @OneToMany
    private List<Match> Match;
    private Integer Numero;

    // foreign key
    private Long IdChampionnat;
}
