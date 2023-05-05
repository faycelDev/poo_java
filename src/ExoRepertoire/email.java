package ExoRepertoire;

public class email extends Coordonnee{
    public String email;

    public email(String t, String mail) {
        super(t);
        this.email = mail;
    }

    @Override
    public String getTexte() {

        return this.email;
    }

    @Override
    public String toString() {
        return titre  +
                  email + '\'';

    }
}
