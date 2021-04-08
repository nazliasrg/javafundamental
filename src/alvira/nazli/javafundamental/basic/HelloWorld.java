package alvira.nazli.javafundamental.basic;

public class HelloWorld {
    public String name;
    private Integer usia;
    public static String jenisKelamin;

    public String getName(){
        return name;
    }

    public void getUsia() {
        if (usia > 0){
            System.out.println("Usia : " + usia + " tahun");
        }
        else{
            String result = "usia tidak valid";
            System.out.println(result);
        }
    }

    public void setUsia(Integer usia) {
        if (usia > 0) {
            this.usia = usia;
        }
        else{
            this.usia = 0;
        }
    }

}
