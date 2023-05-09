package ExoInterfaces;

public abstract class Oiseaux{
   void parler()
   {
       System.out.println("l'oiseaux siffle");
   }

    public String nom;
    void voler()
    {
        System.out.println("l'oiseaux vol");
    }
    void manger()
    {
        System.out.println("l'oiseaux mange");
    }

    public Oiseaux(String N) {
        this.nom = N;
    }
}
