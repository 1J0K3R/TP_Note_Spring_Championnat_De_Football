package giroud.okorokoff.tp_note_spring_championnat_de_football.dao;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JourneeDao extends JpaRepository<Journee, Long> {
    List<Journee> findJourneesByChampionnat(Championnat championnat);
    Journee findJourneeByNumero(Integer numero);
    Journee findJourneeByNumeroAndChampionnat(Integer numero,Championnat championnat);

}
