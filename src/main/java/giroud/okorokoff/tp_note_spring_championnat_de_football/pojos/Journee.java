package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Journee {
    // Propriétées
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer Numero;

    public Journee(Integer numero) {
        Numero = numero;
    }

    public Journee() {

    }

    // Relations Exterieurs
    @ManyToOne
    private Championnat Championnat;
    @OneToMany
    private List<Match> Match;

    // Getter et Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Championnat getChampionnat() { return Championnat; }
    public void setChampionnat(Championnat championnat) { Championnat = championnat; }

    public List<Match> getMatch() {
        return Match;
    }
    public void setMatch(List<Match> match) { Match = match; }

    public Integer getNumero() {
        return Numero;
    }
    public void setNumero(Integer numero) {
        Numero = numero;
    }
}
