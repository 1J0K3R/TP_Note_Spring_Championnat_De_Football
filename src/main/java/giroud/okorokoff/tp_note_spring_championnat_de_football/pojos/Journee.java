package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

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
    @OneToMany(mappedBy="Journee")
    private List<Matchs> Match;

    // Getter et Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Championnat getChampionnat() { return Championnat; }
    public void setChampionnat(Championnat championnat) { Championnat = championnat; }

    public List<Matchs> getMatch() {
        return Match;
    }
    public void setMatch(List<Matchs> match) { Match = match; }

    public Integer getNumero() {
        return Numero;
    }
    public void setNumero(Integer numero) {
        Numero = numero;
    }
}
