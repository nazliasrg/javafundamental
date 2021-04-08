package alvira.nazli.javafundamental.collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetTest {
    public void setTesting(){
        Set<String> setNames = new HashSet<>();
        setNames.add("Nazli");
        setNames.add("Ridho");
        setNames.add("Nazli");
        setNames.add("Alvira");
        setNames.add("Ramzi");

        List<String> listSetNames = new ArrayList<>(setNames);

        Collections.sort(listSetNames);
        System.out.println("Sort setNames using List Collections : \n" + listSetNames);

        System.out.println("\nIsi setNames tidak menggunakan sort  : ");
        for (String nama:setNames) {
            System.out.println(nama);
        }

    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.setTesting();
    }
}
