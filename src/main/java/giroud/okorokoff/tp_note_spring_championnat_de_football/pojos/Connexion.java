package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.validation.constraints.NotBlank;

public class Connexion {

    @NotBlank(message = "Le champ pseudo est obligatoire")
    private String pseudo;
    @NotBlank(message = "Le champ mot de passe est obligatoire")
    private String mdp;
    public Connexion() {
    }

    public Connexion(String pseudo, String mdp) {
        this.pseudo = pseudo;
        this.mdp = mdp;
    }

    // Getter et Setter
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
