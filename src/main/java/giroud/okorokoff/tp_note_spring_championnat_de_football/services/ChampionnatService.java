package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee;

import java.util.List;

public interface ChampionnatService {
    Championnat ajouterChampionnat(Championnat championnat);
    Championnat recupererChampionnat(Long idChampionnat);
    Championnat recupererChampionnat(String nom);
    List<Championnat> recupererChampionnats();
    List<Equipe> recupererEquipes(Championnat championnat);
    List<Journee> recupererJournees(Championnat championnat);
}
