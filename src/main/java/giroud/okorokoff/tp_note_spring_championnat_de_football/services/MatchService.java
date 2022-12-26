package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match;

import java.util.List;

public interface MatchService {

    Match ajouterMatch(Match match);
    Match recupererMatch(Long idMatch);
    List<Match> recupererMatchs();
}
