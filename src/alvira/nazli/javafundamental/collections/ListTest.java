package alvira.nazli.javafundamental.collections;

import java.util.*;

public class ListTest {
    public void listTesting(){
        String[] jajanan = {"Seblak", "Martabak", "Putu Bambu"};
        List<String> makanan = new ArrayList<>();
        // cara 1 isi arraylist 1 dimensi
        List<String> minuman = new ArrayList<>(Arrays.asList("Air Mineral", "Jamu", "Susu", "Bandrek"));
        List<String> jajananList = new ArrayList<>(Arrays.asList(jajanan));

        // cara 2 isi arrayList
        makanan.add("Sate Padang");
        makanan.add("Martabak");

        System.out.println("Makanan                         : " + makanan);

        // tambah data berdasarkan index
        makanan.add(1, "Mie Goreng");

        System.out.println("Makanan setelah ditambah mie    : " + makanan);
        System.out.println("Minuman                         : " + minuman);

        // menghapus data berdasarkan index
        minuman.remove(2);
        System.out.println("Minuman setelah dihapus susu    : " + minuman);

        // menghapus data berdasarkan value
        minuman.remove("Bandrek");
        System.out.println("Minuman setelah dihapus bandrek : " + minuman);

        System.out.println("Jajanan                         : " + jajananList);

        // menghapus data berdasarkan index
        jajananList.remove(0);
        System.out.println("Jajanan setelah dihapus seblak  : " + jajananList);

        System.out.println("Get berdasarkan index Jajanan   : " + jajananList.get(1));

        // index of value
        System.out.println("Index Of Putu Bambu             : " + jajananList.indexOf("Putu Bambu"));

        // sorting data collections
        Collections.sort(makanan);
        System.out.println("Makanan setelah disortir        : " + makanan);

        System.out.println("\nMenampilkan isi arrayList menggunakan foreach");
        System.out.println("\nMakanan : ");
        for (String elementMakanan: makanan) {
            System.out.println(elementMakanan);
        }
        System.out.println("\nMinuman : ");
        for (String elementMinuman: minuman) {
            System.out.println(elementMinuman);
        }
        System.out.println("\nJajanan : ");
        for (String elementJajanan: jajananList) {
            System.out.println(elementJajanan);
        }

    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.listTesting();
    }
}
