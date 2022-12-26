package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Prenom;
    private String Login;
    private String Mdp;
    private String Pseudo;
    private String Email;


    public User(String nom, String prenom, String login, String mdp, String pseudo, String email) {
        Nom = nom;
        Prenom = prenom;
        Login = login;
        Mdp = mdp;
        Pseudo = pseudo;
        Email = email;
    }
    public User() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getLogin() {
        return Login;
    }
    public void setLogin(String login) {
        Login = login;
    }

    public String getMdp() {
        return Mdp;
    }
    public void setMdp(String mdp) {
        this.Mdp = mdp;
    }

    public String getPseudo() {
        return Pseudo;
    }
    public void setPseudo(String pseudo) {
        Pseudo = pseudo;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
}
