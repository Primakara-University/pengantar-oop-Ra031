//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Buat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // Tampilkan pesan untuk meminta nama
        System.out.print("Masukkan nama Anda: ");

        // Baca nama dari pengguna dan simpan di variabel 'nama'
        String nama = input.nextLine();

        // Tampilkan pesan selamat datang
        System.out.println("Halo, " + nama + "! Selamat datang di program ini.");

        // Tutup objek Scanner
        input.close();
    }
}