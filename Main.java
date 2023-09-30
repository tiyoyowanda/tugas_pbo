import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi variabel
        int n;
        int total = 0;

        // Input jumlah angka yang akan dijumlahkan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang akan dijumlahkan: ");
        n = input.nextInt();

        // Inisialisasi array satu dimensi
        int[] angka = new int[n];

        // Input angka-angka yang akan dijumlahkan
        System.out.print("Masukkan " + n + " angka: ");
        for (int i = 0; i < n; i++) {
            angka[i] = input.nextInt();
        }

        // Loop for untuk menjumlahkan angka-angka
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }

        // Output hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + total);

        // Menggunakan if untuk mengecek apakah hasil adalah bilangan genap atau ganjil
        if (total % 2 == 0) {
            System.out.println("Hasil adalah bilangan genap.");
        } else {
            System.out.println("Hasil adalah bilangan ganjil.");
        }

        // Menggunakan while untuk menampilkan angka secara berurutan
        System.out.print("Angka secara berurutan: ");
        int i = 0;
        while (i < n) {
            System.out.print(angka[i] + " ");
            i++;
        }
        System.out.println();

        // Menggunakan do while untuk menampilkan angka secara terbalik
        System.out.print("Angka secara terbalik: ");
        i = n - 1;
        do {
            System.out.print(angka[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        // Menggunakan array multidimensi (matriks)
        int[][] matriks = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Output matriks
        System.out.println("Matriks:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriks[row][col] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
