package alvira.nazli.javafundamental.tugas4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String namaMhs;
        ArrayList<ArrayList<String>> daftarMataKuliahStudent = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        Course course = new Course();

        System.out.println("Menu Pengisian KRS");
        System.out.print("Siapakah nama anda?  : ");
        namaMhs = scanner.nextLine();
        System.out.println("==================    Selamat datang, " + namaMhs.toUpperCase() + "!   ==================");
        student.setStudent();
        course.menuCourse();

        int jumlah = course.setCourse();

        daftarMataKuliahStudent.add(course.setMataKuliahPilihanStudent());
        daftarMataKuliahStudent.add(course.setSksMataKuliahPilihanStudent());
        daftarMataKuliahStudent.add(course.setRuanganMataKuliahPilihanStudent());

        System.out.println("\n\n============================================================================================");
        System.out.println("                      DATA DIRI DAN RINCIAN MATA KULIAH YANG ANDA AMBIL                     ");
        System.out.println("============================================================================================");

        if (jumlah>=144){
            System.out.println("Nama Lengkap             : " + student.getNamaLengkap().toUpperCase() + " S.KOM");
        }
        else{
            System.out.println("Nama Lengkap             : " + student.getNamaLengkap().toUpperCase());
        }

        student.getDataStudent();

        System.out.println("Jumlah SKS yang diambil  : " +  jumlah);

        System.out.println("---------------------------------- Daftar Mata Kuliah --------------------------------------");
        System.out.println("No.  Mata Kuliah");
        for (int i=0; i<daftarMataKuliahStudent.get(0).size(); i++) {
            System.out.println(i+1 + ".   " + daftarMataKuliahStudent.get(0).get(i) + "  (" + daftarMataKuliahStudent.get(1).get(i) + " sks), di Ruang " + daftarMataKuliahStudent.get(2).get(i).toUpperCase());
        }
        System.out.println("============================================================================================");
    }

}
