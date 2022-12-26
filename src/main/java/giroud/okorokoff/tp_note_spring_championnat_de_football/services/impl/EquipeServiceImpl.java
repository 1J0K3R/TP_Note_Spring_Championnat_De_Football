package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.EquipeDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.MatchDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.StadeDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeService {
    @Autowired
    EquipeDao equipeDao;
    @Autowired
    StadeDao stadeDao;

    @Override
    public Equipe ajouterEquipe(Equipe equipe){return equipeDao.save(equipe);}
    @Override
    public Equipe recupererEquipe(Long idEquipe){return equipeDao.findById(idEquipe).orElse(null);}
    @Override
    public Equipe recupererEquipe(String nom){return equipeDao.findEquipeByNom(nom);}
    @Override
    public Stade recupererStade(Equipe equipe){return stadeDao.findStadeByEquipe(equipe);}
    @Override
    public List<Equipe> recupererEquipes(){return  equipeDao.findAll();}
}
