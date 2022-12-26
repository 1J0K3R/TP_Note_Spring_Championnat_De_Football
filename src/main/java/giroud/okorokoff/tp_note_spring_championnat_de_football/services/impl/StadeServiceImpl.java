package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.StadeDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Stade;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadeServiceImpl implements StadeService {
    @Autowired
    StadeDao stadeDao;

    @Override
    public Stade ajouterStade(Stade stade){return stadeDao.save(stade);}
    @Override
    public Stade recupererStade(Long idStade){return stadeDao.findById(idStade).orElse(null);}
    @Override
    public Stade recupererStade(String nom){return stadeDao.findByNom(nom);}
    @Override
    public List<Stade> recupererStades(){return stadeDao.findAll();}
}
