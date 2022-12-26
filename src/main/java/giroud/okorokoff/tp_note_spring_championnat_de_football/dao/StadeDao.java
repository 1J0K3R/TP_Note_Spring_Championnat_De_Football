package giroud.okorokoff.tp_note_spring_championnat_de_football.dao;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadeDao extends JpaRepository<Stade, Long> {
    Stade findStadeByEquipe(Equipe equipe);
    Stade findByNom(String nom);
}
