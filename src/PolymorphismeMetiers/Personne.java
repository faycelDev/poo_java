package PolymorphismeMetiers;

public class Personne {
    public String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void affiche()
    {
        System.out.println(nom);
    }
}
