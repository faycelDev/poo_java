package PolymorphismeMetiers;

public class Plombier extends Personne {
    public Plombier(String jean) {
        super(jean);
    }

    public void affiche()
    {
        System.out.println("le plombier est : " + nom);
    }
}
