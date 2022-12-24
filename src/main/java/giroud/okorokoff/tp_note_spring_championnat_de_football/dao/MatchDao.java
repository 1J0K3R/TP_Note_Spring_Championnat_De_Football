package giroud.okorokoff.tp_note_spring_championnat_de_football.dao;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchDao extends JpaRepository<Match, Long> {
    //  Championnat findChampionnatsByPays(Pays pays);
    List<Match> findMatchesByJournee(Journee journee);
}
