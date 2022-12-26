package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade;

import java.util.List;

public interface EquipeService {

    Equipe ajouterEquipe(Equipe equipe);
    Equipe recupererEquipe(Long idEquipe);
    Equipe recupererEquipe(String nom);
    Stade recupererStade(Equipe equipe);
    List<Equipe> recupererEquipes();
}
