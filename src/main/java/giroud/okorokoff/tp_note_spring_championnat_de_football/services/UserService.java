package giroud.okorokoff.tp_note_spring_championnat_de_football.services;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.User;

import java.util.List;

public interface UserService {

    User ajouterUser(User user);
    User recupererUser(Long idUser);
    List<User> recupererUsers();
    Boolean userExist(String login, String mdp);
}
