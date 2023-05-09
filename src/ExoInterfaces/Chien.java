package ExoInterfaces;

public class Chien implements Animal{

    public String nom;
    public void marcher()
    {
        System.out.println("le chien marche a 3 km/h");
    }
   public void crier()

    {
        System.out.println("le chien aboie");
    }

    public Chien(String N)
    {
        this.nom = N;
    }

}
