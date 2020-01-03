package oop.inheritance;

public class BelajarInheritance {

    public static void main(String[] args) {
        // instansiasi class Musisi

        Musisi sapto = new Musisi();

        // nama object.property. jangan pernah mengakses langsung property, biasakan
        // akses proprty dengan method
        sapto.nama = "Sapto";
        // sapto.manggung();
        // instansiasi class extends Pianis
        Pianis nanang = new Pianis();
        nanang.setNama("Nanang");
        // nanang.getNama()
        nanang.manggung();

    }
}

// class induk
class Musisi {
    String nama;
    // acces modifier, private artinya akses yang hanya dapat digunakan untuk class
    // nya sendiri. tidak bisa diturunkan ke class childnya
    // public bisa diakses dimanapun

    private void menyanyi() {
        System.out.println(this.nama + " Menyanyi");
    }

    String getNama() {
        return this.nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void bacaNada() {
        System.out.println(this.nama + " Baca nada");

    }

    void manggung() {
        this.menyanyi();
    }

}

// class turunan . dengan keyword extends lalu nama class induk. (class
// namaClass extends namaClassInduk)

class Pianis extends Musisi {

    // override yaitumengambil alih property / method dari class parrent untuk agar
    // tidak sama.
    @Override
    void manggung() {
        super.manggung(); // tetap menjalankan manggung versi class parent
        this.mainPiano();
    }

    void mainPiano() {
        System.out.println(this.nama + " Main piano");
    }

}