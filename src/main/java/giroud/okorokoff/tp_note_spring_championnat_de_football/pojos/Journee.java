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
    @OneToMany
    private List<Match> Match;
    private Integer Numero;

    // foreign key
    private Long IdChampionnat;
}
