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
}
