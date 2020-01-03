public class Encapsulation {
    // encapsulation adalah konsep pembungkusan suatu method dan atribut. dikenal
    // dengan istilah acces modifier. ada 3 yaitu:
    // public, private dan protected
    // private : hanya bisa diakses di classnya sendiri
    // public : bisa diakses dimanapun
    // protected : bisa di akses di classnya sendiri dan class turunannya
    // fungsi
    // - untuk melindungi data

    public static void main(String[] args) {
        Application app = new Application();
        app.setNama("Contoh Encapsulasi");
        System.out.println(app.getNama());
        System.out.println();
        Pianis pianis = new Pianis();
        pianis.setNamaPianis("Sapto");
        pianis.menyanyi();
    }
}

class Musisi {
    // contoh protected
    protected String namaMusisi;

    public void setNamaMusisi(String nama) {
        this.namaMusisi = nama;
    }

    public String getNamaMusisi() {
        return this.namaMusisi;
    }

    protected void menyanyi() {
        System.out.println(this.namaMusisi + " Menyanyi");
    }

    public void manggung() {
        this.menyanyi();
    }

}

class Pianis extends Musisi {
    public void setNamaPianis(String namaPianis) {
        this.namaMusis i = namaPianis;
    }
}

class Application {
    // contoh private
    private String AppNama;

    // SETTER : method supaya bisa mengakses String nama dengan acces modifier
    // private
    public void setNama(String nama) {
        this.AppNama = nama;
    }

    // GETTER : function untuk mengembalikan hasil dari SETTER
    public String getNama() {
        return AppNama;
    }

}
