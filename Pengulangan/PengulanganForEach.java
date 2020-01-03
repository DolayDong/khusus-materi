package Pengulangan;

public class PengulanganForEach {

    public static void main(String[] args) {
        String[] days = { "Senin", "Selasa", "Rabu" };
        /*
         * foreach :
         * 
         * for(Tipe data NamaVariable : array){}
         */
        for (String day : days) {
            System.out.println(day);
        }
    }
}