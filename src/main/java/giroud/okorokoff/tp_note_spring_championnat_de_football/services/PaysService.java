package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Pays;

import java.util.List;

public interface PaysService {
    Pays ajouterPays(Pays pays);
    Pays recupererPays(Long idPays);
    Pays recupererPays(String nom);
    List<Pays> recupererLesPays();
    List<Championnat> recupererChampionnats(Pays pays);
}
