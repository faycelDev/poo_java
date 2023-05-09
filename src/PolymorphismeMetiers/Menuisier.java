package PolymorphismeMetiers;

public class Menuisier extends Personne {

    public Menuisier(String paul)
    {
        super(paul);
    }

    public void affiche()
    {
        System.out.println("le menuisier est : " + nom);
    }
}
