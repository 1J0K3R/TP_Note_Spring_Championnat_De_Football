package giroud.okorokoff.tp_note_spring_championnat_de_football.dao;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysDao extends JpaRepository<Pays, Long> {
    Pays findByNom(String nom);
}
