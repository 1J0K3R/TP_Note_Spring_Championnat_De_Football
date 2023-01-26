package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.JourneeDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.MatchDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Journee;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Matchs;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.JourneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JourneeServiceImpl implements JourneeService {
    @Autowired
    JourneeDao journeeDao;
    @Autowired
    MatchDao matchDao;

    @Override
    public Journee ajouterJournee(Journee journee){return journeeDao.save(journee);}
    @Override
    public Journee recupererJournee(Long idJournee){return journeeDao.findById(idJournee).orElse(null);}
    @Override
    public Journee recupererJournee(Integer numero){return journeeDao.findJourneeByNumero(numero);}
    @Override
    public Journee recupererJournee(Integer numero, Championnat championnat){return journeeDao.findJourneeByNumeroAndChampionnat(numero, championnat);}
    @Override
    public List<Journee> recupererJournees(){return journeeDao.findAll();}
    @Override
    public List<Matchs> recupererMatchs(Journee journee){return matchDao.findMatchesByJournee(journee);}
}
