// polimorphism berarti banyak bentuk. banyak bentuk dari method !atribut
// polymorphism ada 2 bentuk. overriding dan overloading

public class Polymorphism {

    public static void main(String[] args) {
        Matematika Perkalian = new Matematika();
        Perkalian.perkalian(10, 5);
        Perkalian.perkalian(2.5, 0.5);
        Perkalian.perkalian(0.5, 0.5, 0.5);
        Perkalian.perkalian(10, 10, 5);
        Perkalian.perkalian(10, 0.5);
        Perkalian.perkalian(0.5, 20);
        System.out.println();
        Pianis piano = new Pianis();
        Musisi musisi = new Musisi();
        System.out.print("Musisi : ");
        musisi.manggung();
        System.out.print("Pianis : ");
        piano.manggung();
    }
}

class Matematika {
    // contoh polymorphism overloading
    // satu method perkalian tapi dengan banyak bentuk parameter yang berbeda
    // perkalian 1
    public void perkalian(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    // perkalian 2
    public void perkalian(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(result);
    }

    // perkalian 3
    public void perkalian(int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        System.out.println(result);
    }

    public void perkalian(double num1, double num2, double num3) {
        double result = num1 * num2 * num3;
        System.out.println(result);
    }

    public void perkalian(int num1, double num2) {
        double result = num2 * num1;
        System.out.println(result);
    }

    public void perkalian(double num1, int num2) {
        double result = num1 * num2;
        System.out.println(result);
    }
}

class Musisi {
    String nama;

    public void bacaNada() {
        System.out.println("Saya bisa baca nada");
    }

    public void manggung() {
        System.out.println("Nyanyi");
    }
}

class Pianis extends Musisi {

    public void mainPiano() {
        System.out.println("Saya main piano");
    }

    // contoh polymorphism overriding
    // @Override adalah keyword untuk menandai sebuah operasi overriding.
    @Override
    public void manggung() {
        // keyword super untuk mengacu kepada method parent nya
        super.manggung();
        // keyword this untuk mengacu pada method di classnya sendiri
        this.mainPiano();
    }
}