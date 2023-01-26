package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.MatchDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Matchs;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchDao matchDao;

    @Override
    public Matchs ajouterMatch(Matchs match){return matchDao.save(match);}
    @Override
    public Matchs recupererMatch(Long idMatch){return matchDao.findById(idMatch).orElse(null);}
    @Override
    public List<Matchs> recupererMatchs(){return matchDao.findAll();}
}
