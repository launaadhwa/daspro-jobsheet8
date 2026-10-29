
import java.util.Scanner;

public class Tugas316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int totalBarangSemuaToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j
                        + " di toko " + i + ": ");
                int jumlahBarang = sc.nextInt();

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + i + " - pelanggan: "
                    + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSemuaToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: "
                + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbanyak);

        sc.close();
    }
}
