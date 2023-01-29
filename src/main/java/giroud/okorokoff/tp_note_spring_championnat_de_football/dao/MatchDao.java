package giroud.okorokoff.tp_note_spring_championnat_de_football.dao;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Matchs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchDao extends JpaRepository<Matchs, Long> {
    List<Matchs> findMatchesByJournee(Journee journee);
    List<Matchs> findMatchsByEquipe(Equipe equipe);
}
