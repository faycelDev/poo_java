package PolymorphismeMetiers;

public class Main {
    private static Menuisier[] Personnes;

    public static void main(String[] args) {

       Personne[] personnes = new Personne[3];
       personnes[0] = new Menuisier("paul");
       personnes[1] = new Plombier("jean");
       personnes[2] = new Menuisier("Adrien");


       for(int i = 0; i < personnes.length; i++)
       {
           personnes[i].affiche();
       }

    }
}
