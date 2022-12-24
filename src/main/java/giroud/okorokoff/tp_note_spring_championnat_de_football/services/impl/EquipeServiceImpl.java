package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.EquipeDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Equipe;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeServiceImpl implements EquipeService {
    @Autowired
    EquipeDao equipeDao;

    @Override
    public Equipe ajouterEquipe(Equipe equipe){return equipeDao.save(equipe);}
   // @Override
   // public Equipe recupererEquipe(Long idEquipe){return equipeDao.findById(idEquipe);}

}
