package alvira.nazli.javafundamental.generic;

public class GenericTest {
    public static <T> void printArray(T[] elementInput){
        for (T element:elementInput){
            System.out.print(element+ "\n");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"Nazli", "Alvira", "Siregar"};
        Wilayah[] arrWilayah = {new Wilayah("Sumatera Utara"), new Wilayah("Aceh"), new Wilayah("Sumatera Selatan")};

        printArray(intArray);
        printArray(strArray);
        printArray(arrWilayah);
    }
}
