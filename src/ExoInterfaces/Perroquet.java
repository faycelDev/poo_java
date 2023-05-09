package ExoInterfaces;

public class Perroquet extends Oiseaux{

    public String nom;

    public Perroquet(String N) {
        super(N);
    }

    public void parler()
    {
        System.out.println("le perroquet parle");
    }
    @Override
    void manger() {
        super.manger();
    }

    @Override
    void voler() {
        super.voler();
    }


}
