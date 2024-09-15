package soal;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan ukuran tannga (n)");
        int n = scanner.nextInt();

        cetakTangga(n);
    }
    public static void cetakTangga(int n){
        // Loop luar untuk setiap baris
        for (int i = 1; i <= n; i++) {
            // Loop dalam untuk mencetak '#' sebanyak 'i'
            for (int j = 1; j <= i; j++ ){
                System.out.println("#");
            }
            // Pindah ke baris berikutnya setelah mencetak '#' pada setiap baris
            System.out.println();
        }
    }
}
