package Pengulangan;

public class PengulanganFor {

    public static void main(String[] args) {
        // data array

        // String[] arr = { "Mb ika", "Mas Marno", "Mas pirman", "Mb paryi", "Mb
        // tillah", "Mb Nur", "Sapto", "Nanang" };

        // ambil fdata didalam array dengan for
        // arr.length adalah fungsi untuk menghitung jumlah data didalam array. kenapa
        // di - 1? karena index array dimulai dari 0;
        // for (int index = 0; index <= arr.length - 1; index++) {
        // System.out.println(arr[index]);
        // }

        // coba kedua, print dari 1 - 1000;

        // for (int i = 1000; i >= 1; i--) {
        // System.out.println(i);
        // }

        // coba ketiga
        // tampilin bilangan ganjil dari range 1 - 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}