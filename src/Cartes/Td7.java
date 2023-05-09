package Cartes;

import java.util.Random;

public class Td7 {

    public static Integer getRandomInteger(Integer min, Integer max) {
        Integer diff = max - min;
        Random r = new Random();
        return (r.nextInt(diff) + min);
    }


}
