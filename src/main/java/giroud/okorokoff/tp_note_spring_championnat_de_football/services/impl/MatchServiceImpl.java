package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.MatchDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Match;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchDao matchDao;

    @Override
    public Match ajouterMatch(Match match){return matchDao.save(match);}
    @Override
    public Match recupererMatch(Long idMatch){return matchDao.findById(idMatch).orElse(null);}
    @Override
    public List<Match> recupererMatchs(){return matchDao.findAll();}
}
