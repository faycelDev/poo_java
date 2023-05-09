package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> colors = new HashSet<>();

        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("yellow");

        for(String color : colors)
        {
            System.out.println(color);
        }


    }
}
