package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.ChampionnatDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.PaysDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Pays;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaysServiceImpl implements PaysService {
    @Autowired
    PaysDao paysDao;
    @Autowired
    ChampionnatDao championnatDao;

    @Override
    public Pays ajouterPays(Pays pays){return paysDao.save(pays);}
    @Override
    public Pays recupererPays(Long idPays){return paysDao.findById(idPays).orElse(null);}
    @Override
    public Pays recupererPays(String nom){return paysDao.findByNom(nom);}
    @Override
    public List<Pays> recupererLesPays(){return paysDao.findAll();}
    @Override
    public List<Championnat> recupererChampionnats(Pays pays){return championnatDao.findChampionnatsByPays(pays);}

}
