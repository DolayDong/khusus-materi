public class contohFunctionDanProcedur {

    public static void main(String[] args) {

        double luasAlas = hitungLuasSegitiga(10, 20);
        hitungVolumePrisma(luasAlas, 30);

    }

    static double hitungLuasSegitiga(double p, double l) { // function
        double luasSegitiga = p * l / 2;
        return luasSegitiga;
    }

    static void hitungVolumePrisma(double luasAlas, double t) { // procedur
        double volume = luasAlas * t;
        System.out.println(volume);

    }
}