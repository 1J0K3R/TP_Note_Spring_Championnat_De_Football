package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Matchs;

import java.util.List;

public interface MatchService {

    Matchs ajouterMatch(Matchs match);
    Matchs recupererMatch(Long idMatch);
    List<Matchs> recupererMatchs();
}
