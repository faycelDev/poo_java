package ExoRepertoire;

import java.util.ArrayList;

public class Contact {

    public String nom;
    public String prenom;

    public  ArrayList<Coordonnee> lesCoordonnees;

    public Contact(String lastname, String firstname) {
        this.nom = lastname; /*en créant un nouvelle objet je devrais mettre lastname et
        firstname en parametre du construct; lastname vas être affecté au nom de l'objet c'est a dire (this) cela va permettre la généricitée*/
        this.prenom = firstname;
        this.lesCoordonnees = new ArrayList<Coordonnee>();
    }

    public void addCoordonne(Coordonnee c) {

        lesCoordonnees.add(c);
    }

    public ArrayList<adressPostal> getAdressPostal() {
        ArrayList<adressPostal> adresses = new ArrayList<>();
        for (Coordonnee coordonnee : this.lesCoordonnees) {
            if (coordonnee instanceof adressPostal) {
                adresses.add((adressPostal) coordonnee);
            }
        }
        return adresses;
    }

    public ArrayList<numTel> getNumTel() {
        ArrayList<numTel> num = new ArrayList<>();
        for (Coordonnee coordonnee : this.lesCoordonnees) {
            if (coordonnee instanceof numTel) {
                num.add((numTel) coordonnee);
            }
        }
        return num;
    }

    public ArrayList<email> getEmail() {
        ArrayList<email> mail = new ArrayList<>();
        for (Coordonnee coordonnee : lesCoordonnees) {
            if (coordonnee instanceof email) {
                mail.add((email) coordonnee);
            }
        }
        return mail;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void  afficher() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        ArrayList<numTel> num = getNumTel();

        for(numTel nt : num)
        {
            nt.afficher();
        }

        ArrayList<email> le = getEmail();

        for(email e : le)
        {
            e.afficher();
        }
        ArrayList<adressPostal> la = getAdressPostal();

        for(adressPostal a : la)
        {
            a.afficher();
        }
    }



    public  ArrayList<Coordonnee> getLesCoordonnees() {
        return lesCoordonnees;
    }

    public Coordonnee getCoordonnee(String t){

        for(Coordonnee c : lesCoordonnees)
        {

            if(c.getTitre().equals(t))
            {
                return c;
            }
        }
        return null;
    }





}
