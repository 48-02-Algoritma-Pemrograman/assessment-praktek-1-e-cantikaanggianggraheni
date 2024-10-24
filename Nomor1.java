import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jumlah anggota keluarga: ");
        int jumlahAnggota = scanner.nextInt();
        
        double tunjanganKesehatan;
        
        if (jumlahAnggota <= 3) {
            tunjanganKesehatan = jumlahAnggota * 100000;
        } else {
            tunjanganKesehatan = (3 * 100000) + ((jumlahAnggota - 3) * 50000);
        }
        
        System.out.printf("Besar tunjangan kesehatan" + tunjanganKesehatan);
        scanner.close();
    }
}
