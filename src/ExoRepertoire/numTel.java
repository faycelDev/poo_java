package ExoRepertoire;

public class numTel extends Coordonnee{
    public String numero;

    public numTel(String t, String num) {
        super(t);
        this.numero = num;
    }


    @Override
    public String getTexte() {
        return numero;
    }

    public String getNumero() {

        return numero;
    }


 }

