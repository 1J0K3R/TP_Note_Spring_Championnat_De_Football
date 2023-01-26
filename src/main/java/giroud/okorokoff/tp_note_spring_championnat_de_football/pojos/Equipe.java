package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipe {
    // Propriétés
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCreation;
    private String Logo;
    private String nomEntraineur;
    private String president;
    private String status;
    private String siege;
    private String telephone;
    private String siteWeb;
    private String nom;

    public Equipe(String nom, Date dateCreation, String logo, String nomEntraineur, String president, String status, String siege, String telephone, String siteWeb) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        Logo = logo;
        this.nomEntraineur = nomEntraineur;
        this.president = president;
        this.status = status;
        this.siege = siege;
        this.telephone = telephone;
        this.siteWeb = siteWeb;
    }

    public Equipe() {

    }

    // Relation exterieurs
    @ManyToMany
    private List<Championnat> championnat;
    @ManyToOne
    private Stade stade;
    @OneToMany(mappedBy="equipe1")
    private List<Matchs> match;

    // Getter et Setter
    public List<Championnat> getChampionnat() { return championnat; }
    public void setChampionnat(List<Championnat> championnat) { this.championnat = championnat; }

    public Stade getStade() {
        return stade;
    }
    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public List<Matchs> getMatch() {
        return match;
    }
    public void setMatch(List<Matchs> match) { this.match = match; }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getLogo() {
        return Logo;
    }
    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getNomEntraineur() {
        return nomEntraineur;
    }
    public void setNomEntraineur(String nomEntraineur) {
        this.nomEntraineur = nomEntraineur;
    }

    public String getPresident() {
        return president;
    }
    public void setPresident(String president) {
        this.president = president;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSiege() {
        return siege;
    }
    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSiteWeb() {
        return siteWeb;
    }
    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }
}
