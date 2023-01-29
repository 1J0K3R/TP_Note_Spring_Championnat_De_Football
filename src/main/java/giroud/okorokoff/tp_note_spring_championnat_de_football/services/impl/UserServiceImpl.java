package giroud.okorokoff.tp_note_spring_championnat_de_football.services.impl;

import giroud.okorokoff.tp_note_spring_championnat_de_football.dao.UserDao;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.User;
import giroud.okorokoff.tp_note_spring_championnat_de_football.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User ajouterUser(User user){return userDao.save(user);}
    @Override
    public User recupererUser(Long idUser){return userDao.findById(idUser).orElse(null);}

    @Override
    public User recupererUser(String pseudo) {
        return userDao.findByPseudo(pseudo);
    }
    @Override
    public List<User> recupererUsers(){return userDao.findAll();}
    @Override
    public Boolean userExist(String login, String mdp){return userDao.existsUserByLoginAndMdp(login, mdp);}
}
