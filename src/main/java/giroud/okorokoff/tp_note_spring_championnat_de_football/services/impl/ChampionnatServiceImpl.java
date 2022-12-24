package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.ChampionnatDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.EquipeDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {
    @Autowired
    private ChampionnatDao championnatDao;
    @Autowired
    private EquipeDao equipeDao;
    @Override
    public Championnat ajouterChampionnat(Championnat championnat){return championnatDao.save(championnat);}
    @Override
    public Championnat recupererChampionnat(Long idChampionnat){return championnatDao.findById(idChampionnat).orElse(null);}
    @Override
    public Championnat recupererChampionnat(String nom){return championnatDao.findChampionnatsByNom(nom);}
    @Override
    public List<Championnat> recupererChampionnats(){return championnatDao.findAll();}
    @Override
    public List<Equipe> recupererEquipes(Championnat championnat){return equipeDao.findEquipesByChampionnat(championnat);}

}
