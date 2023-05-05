package ExoRepertoire;

public abstract class Coordonnee {
    public abstract String getTexte();
    public String titre;

    public void afficher(){
        System.out.println(this.getTitre() + " : " + this.getTexte());
    }

    public Coordonnee(String t) {
        this.titre = t;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Coordonnee " +
                "titre : " + titre + '\'';

    }
}
