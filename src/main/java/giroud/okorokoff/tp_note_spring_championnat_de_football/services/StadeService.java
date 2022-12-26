package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade;

import java.util.List;

public interface StadeService {

    Stade ajouterStade(Stade stade);
    Stade recupererStade(Long idStade);
    Stade recupererStade(String nom);
    List<Stade> recupererStades();

}
