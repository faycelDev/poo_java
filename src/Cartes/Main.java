package Cartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> nombres = new HashSet();



        for(int i = 0; i < 20; i++)
        {

            int result = Td7.getRandomInteger(0,50);

            nombres.add(result);

        }
        System.out.println(nombres);



    }


}
