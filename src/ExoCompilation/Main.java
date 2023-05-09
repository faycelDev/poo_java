package ExoCompilation;
/*HashSet*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedList<Float> tab = new LinkedList();
        Map<String, Integer> taille = new HashMap(); /*Map prend 2 paramètre la clé: key et
        la valeur : value; comme un couple exemple ici String est la clée qui comporte(soso) et la valeur et int qui comporte la taille de soso est(180)
        et le tableau ne s'affiche pas dans l'ordre lors de son appel. il n'accepte pas de dupliquer les mêmes clées, la clé est unique; en faite dans map la key équivaut a l'index*/

        taille.put("soso", 180);
        taille.put("fays", 170);
        taille.put("pascal", 160);//pour remplir le tableau


        taille.put("jean", 163);

        taille.put("pascal2", 184);
        System.out.println(taille.containsValue(160));
    }
}
