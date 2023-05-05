package ExoRepertoire;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        adressPostal ap = new adressPostal("a","24","rue jean jaures", "75007", "paris");
        numTel nt = new numTel("tel ","06.74.25.31.20");
        email e = new email("email ", "jeanclaude68@gmail.com");

        Contact ct= new Contact("DUPONT", "tartampion");
        ct.addCoordonne(e);
        ct.addCoordonne(ap);
        ct.addCoordonne(nt);

        ct.afficher();

        System.out.println(ct.getCoordonnee("a"));

        Repertoire rep  = new Repertoire();
        rep.afficherContact("DUPONT", "tartampion");

        rep.addContact(ct);
        rep.afficherContact("DUPONT", "tartampion");








    }
}
