#include <iostream>
using namespace std;

int main() {
    // Inisialisasi variabel
    int n;
    int total = 0;
    
    // Input jumlah angka yang akan dijumlahkan
    cout << "Masukkan jumlah angka yang akan dijumlahkan: ";
    cin >> n;
    
    // Inisialisasi array satu dimensi
    int angka[n];
    
    // Input angka-angka yang akan dijumlahkan
    cout << "Masukkan " << n << " angka: ";
    for (int i = 0; i < n; i++) {
        cin >> angka[i];
    }
    
    // Loop for untuk menjumlahkan angka-angka
    for (int i = 0; i < n; i++) {
        total += angka[i];
    }
    
    // Output hasil penjumlahan
    cout << "Hasil penjumlahan: " << total << endl;
    
    // Menggunakan if untuk mengecek apakah hasil adalah bilangan genap atau ganjil
    if (total % 2 == 0) {
        cout << "Hasil adalah bilangan genap." << endl;
    } else {
        cout << "Hasil adalah bilangan ganjil." << endl;
    }
    
    // Menggunakan while untuk menampilkan angka secara berurutan
    cout << "Angka secara berurutan: ";
    int i = 0;
    while (i < n) {
        cout << angka[i] << " ";
        i++;
    }
    cout << endl;
    
    // Menggunakan do while untuk menampilkan angka secara terbalik
    cout << "Angka secara terbalik: ";
    i = n - 1;
    do {
        cout << angka[i] << " ";
        i--;
    } while (i >= 0);
    cout << endl;
    
    // Menggunakan array multidimensi (matriks)
    int matriks[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
    // Output matriks
    cout << "Matriks:" << endl;
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            cout << matriks[row][col] << " ";
        }
        cout << endl;
    }
    
    return 0;
}

