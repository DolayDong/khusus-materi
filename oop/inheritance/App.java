package oop.inheritance;

class person {
    // atribute
    String jeneng;
    int umur;
    double tinggiBadan;
    double beratBadan;

    // method
    void jalan() {
        // code untuk berjalan
        System.out.println("Saya sedang berjalan");
    }

    void bicara(String kata) {
        System.out.println(this.jeneng + " berkata : '" + kata + "'");
    }

    void aturNama(String aran) {
        this.jeneng = aran;
    }

    String getName() {
        return this.jeneng;
    }

    void sebutNama() {
        System.out.println(this.getName());
    }

}

public class App {

    public static void main(String[] args) {
        // instansiasi class menjadi object
        person sapto = new person();
        person nanang = new person();

        sapto.aturNama("Sapto Aji");
        System.out.print("Hallo nama saya ");
        sapto.sebutNama();
        sapto.bicara("Hahaha saya adalah Ironman");

        nanang.aturNama("Nanang Fauzi");
        nanang.sebutNama();
        nanang.bicara("Haha dan saya adik ironman");

    }

}