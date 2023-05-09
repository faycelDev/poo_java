package ExoInterfaces;

public class Chat implements Animal {

    public String nom;
    @Override
    public void crier() {
        System.out.println("le chat miaule");
    }

    public void marcher() {

        System.out.println("le chat marche a 6 km/h");
    }

    public void accelererMarche(int acceleration) {
        int deplacer = 6;
        acceleration += deplacer;
        System.out.println("la vitesse de marche initiale du chat est de 6 km/h et après acceleration elle est de : " + acceleration + " km/h");



    }

    public Chat(String N)
    {
        this.nom = N;
    }

}