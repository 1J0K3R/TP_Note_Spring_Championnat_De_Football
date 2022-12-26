package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match;

import java.util.List;

public interface JourneeService {
    Journee ajouterJournee(Journee journee);
    Journee recupererJournee(Long idJournee);
    Journee recupererJournee(Integer numero);
    Journee recupererJournee(Integer numero, Championnat championnat);
    List<Journee> recupererJournees();
    List<Match> recupererMatchs(Journee journee);
}
