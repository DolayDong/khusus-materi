public class BelajarFunction {

    public static void main(String[] args) {
        int d = 10;
        int t = 20; // type data int untuk nilai bilangan bulat
        double r = d / 2; // type data double untuk bilangan desimal/yang memiliki nilai koma
        final double pi = 3.14; // konstanta, variabel yang tidak dapat dirubah nilainya
        double luasAlas = pi * r * r;
        double volumeKerucut = (luasAlas * t) / 3;

        int d2 = 15;
        int t2 = 13;
        double r2 = d2 / 2;
        double luasAlas2 = pi * r2 * r2;
        double volumeKerucut2 = (luasAlas2 * t2) / 3;

        System.out.println("Volume kerucut pertama = " + volumeKerucut);
        System.out.println("Volume kerucut kedua = " + volumeKerucut2);
        hitungVolumeKerucut(10, 20);
        cetakln("Volume kerucut dengan jari-jari " + r + " dan tinggi " + t + " = " + volumeKerucut);
        cetakln(addTwoNumber(addTwoNumber(10, 10), 10));
    }

    // procedur (tidak mengembalikan nilai)
    static void hitungVolumeKerucut(double r, double t) {

        final double pi = 3.14;
        double luasAlas = pi * r * r;
        double volume = luasAlas * t / 3;

        System.out.println("Volume kerucut dengan jari-jari " + r + " dan tinggi " + t + " = " + volume);
    }

    static void cetakln(Object obj) {
        System.out.println(obj);
    }

    // function (mengembalikan nilai sebagai output)

    // cara pembuatan

    static int addTwoNumber(int a, int b) {
        int result = a + b;
        return result;
    }
    // type data namaFunction(parameter){ statement; return }

}