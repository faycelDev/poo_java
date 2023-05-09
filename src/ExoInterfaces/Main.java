package ExoInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
/*
        ArrayList<Animal> listAnimal = new ArrayList();

        Animal a = new Chat("simba");
        Chien k = new Chien("picsou");
        Perroquet p1 = new Perroquet("krilin");

        Chien kelb = new Chien("tess");
        Chat c = new Chat("miaou");
        Perroquet p2 = new Perroquet("paiper");

        c.marcher();
        p1.voler();
        a.crier();

        c.accelererMarche(10);


        listAnimal.add(a);
        listAnimal.add(k);

        listAnimal.add(kelb);


        for (Animal animal : listAnimal) {
            animal.crier();

        }

        ArrayList<Oiseaux> listAnimalVolant = new ArrayList();
        listAnimalVolant.add(p2);
        listAnimalVolant.add(p1);


        for (Oiseaux oiseaux : listAnimalVolant) {
            oiseaux.voler();
            oiseaux.parler();
        }



       ArrayList tabArrayList = new ArrayList();

        LinkedList tabLinkedList = new LinkedList();



        double startTime = System.nanoTime();
        for(int i = 0;  i <= 1000; i++)
        {
            tabArrayList.add(0, i);
        }
        double endTime = System.nanoTime();
        double arrayListTime = endTime - startTime;

        double startTime1 = System.nanoTime();
        for(int i = 0; i <= 1000; i++)
        {
            tabLinkedList.add(0, i);
        }
        double endTime1 = System.nanoTime();
        double LinkedListTime = endTime1 - startTime1;

        System.out.println("le temps nécessaisre pour ajouter les nombres de 1 a 10000");
        System.out.println("pour Arraylist : " + arrayListTime);

        System.out.println("le temps nécessaisre pour ajouter les nombres de 1 a 10000");
        System.out.println("pour linkedlist : " + LinkedListTime);
*/

        Map<String, Integer> notes = new HashMap();

        notes.put("soso", 15);
        notes.put("fays", 9);
        notes.put("jean", 14);
        notes.put("Azouz", 17);


       int result = notes.get("soso");
        System.out.println("la note de soso est " + result);

        for(Map.Entry<String, Integer> entry : notes.entrySet())

        {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("la clée est : " + key + " la valeur est : " + value);

        }
    }



}
