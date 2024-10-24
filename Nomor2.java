import java.util.Scanner;

public class KasirBoneka {
    public static void main(String[] args) {
        String produk = {"Labubu", "Jenglot", "Voodo"};
        int harga = {300000, 250000, 200000};
        int jumlah = new int[produk.length];

        int totalTransaksi = 0;
        int totalPendapatan = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukan nama produk: ");
            String inputProduk = scanner.nextLine();

            int indeksProduk = -1;
            for (int i = 0; i < produk.length; i++) {
                if (inputProduk.equalsIgnoreCase(produk[i])) {
                    indeksProduk = i;
                    break;
                }
            }

            if (indeksProduk == -1) {
                System.out.println("Produk tidak ditemukan");
                continue;
            }

            System.out.print("Jumlah pembelian: ");
            int jumlahBeli = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            jumlahindeksProduk += jumlahBeli;
            totalPendapatan += harga[indeksProduk] * jumlahBeli;
            totalTransaksi++;

        
            System.out.print("Input lagi (Y/N)?: ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("Y")) {
                break;
            }
        }


        System.out.println("Total transaksi yang terjadi = " + totalTransaksi);
        System.out.println("Jumlah uang yang diterima = " + totalPendapatan);

    }
}
