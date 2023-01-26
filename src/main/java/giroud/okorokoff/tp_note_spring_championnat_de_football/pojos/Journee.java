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
    private Championnat championnat;
    @OneToMany(mappedBy="Journee")
    private List<Matchs> match;

    // Getter et Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Championnat getChampionnat() { return championnat; }
    public void setChampionnat(Championnat championnat) { this.championnat = championnat; }

    public List<Matchs> getMatch() {
        return match;
    }
    public void setMatch(List<Matchs> match) { this.match = match; }

    public Integer getNumero() {
        return Numero;
    }
    public void setNumero(Integer numero) {
        Numero = numero;
    }
}
