package alvira.nazli.javafundamental.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public void mapTesting(){
        Map<String, Integer> nilaiMhs = new HashMap<>();
        nilaiMhs.put("Nazli", 99);
        nilaiMhs.put("Alvira", 90);
        nilaiMhs.put("Ridho", 50);
        nilaiMhs.put("Surya", 50);

        System.out.println(nilaiMhs);

        System.out.println("\nMenampilkan isi nilaiMhs menggunakan foreach : ");
        for (String keyNilai: nilaiMhs.keySet()) {
            System.out.println("Nama : " + keyNilai + ", Nilai : " + nilaiMhs.get(keyNilai));
        }
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.mapTesting();
    }
}
