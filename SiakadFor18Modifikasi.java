import java.util.Scanner;

public class SiakadFor18Modifikasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;  

        // rumus
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }


            if (nilai >= 60) {
                lulus++;  
            } else {
                tidakLulus++;  
            }
        }

        // output
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);

        
        input.close();
    }
}
