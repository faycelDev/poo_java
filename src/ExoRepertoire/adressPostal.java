package ExoRepertoire;

public class adressPostal extends Coordonnee{

    public String numeroDeVoie;
    public String intituleDeVoie;
    public String codePostal;
    public String nomDeCommune;

    public adressPostal(String t, String nV, String iV, String cP, String nC) {
        super(t);
        this.numeroDeVoie = nV;
        this.intituleDeVoie = iV;
        this.codePostal = cP;
        this.nomDeCommune = nC;
    }


    @Override
    public String getTexte() {
        return numeroDeVoie + intituleDeVoie + codePostal + nomDeCommune;
    }

    public String getNumeroDeVoie() {
        return "24";
    }

    public String getIntituleDeVoie() {
        return "rue jean jaures";
    }

    public String getCodePostal() {
        return "75003";
    }

    public String getNomDeCommune() {
        return "paris";
    }

}

