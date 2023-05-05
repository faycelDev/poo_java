package ExoRepertoire;

import java.util.ArrayList;

public class Repertoire {

    public ArrayList<Contact> lesContacts;

    public Repertoire() {
        this.lesContacts = new ArrayList<>();
    }

    public void addContact(Contact c)
    {
        lesContacts.add(c);
    }

    public Contact rechercher(String nom, String prenom)
    {
        for(Contact c : lesContacts)
        {
            if(c.getNom().equals(nom) && c.getPrenom().equals(prenom))
            {
                return c;
            }
        }
        return null;
    }
    public void afficherContact(String nom, String prenom)
    {

        Contact c = rechercher(nom, prenom);
        if (c!= null)
        {
            c.afficher();
        }else{
            System.out.println("Contact pas trouvé !");
        }
    }
}
