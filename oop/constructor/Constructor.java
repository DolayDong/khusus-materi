public class Constructor {
    // Contstructor adalah sebuah method. yang secara otomatis dibuat ketika kita
    // instansiasi sebuah object.
    // kita boleh / bisa memiliki lebih dari satu method constructor dalam sebuah
    // class

    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        System.out
                .println("Panjang Box = " + box1.Panjang + "Lebar Box = " + box1.Lebar + "Tinggi box = " + box1.Tinggi);
        System.out.println("Laptop");
        Laptop laptop1 = new Laptop("Asus", 12, 2010);
        System.out.println("Merk : " + laptop1.Merk + " | Lebar layar : " + laptop1.UkuranLayar + " inch | "
                + "Keluaran tahun : " + laptop1.KeluaranTahun);

    }
}

class Box {

    protected double Panjang;
    protected double Tinggi;
    protected double Lebar;

    // constructor method

    public Box(double panjang, double tinggi, double lebar) {

        this.Panjang = panjang;
        this.Tinggi = tinggi;
        this.Lebar = lebar;
    }

}

class Laptop {
    protected String Merk;
    protected Integer UkuranLayar;
    protected int KeluaranTahun;

    public Laptop(String merk, Integer ukuranLayar, int keluaranTahun) {

        this.Merk = merk;
        this.UkuranLayar = ukuranLayar;
        this.KeluaranTahun = keluaranTahun;
    }

    // overloading
    // untuk constructor tanpa parameter
    public Laptop() {

    }
}
