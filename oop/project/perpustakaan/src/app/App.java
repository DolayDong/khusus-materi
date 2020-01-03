package app;

import app.data.Buku;
import app.data.Member;
import app.transaction.Peminjaman;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // sebelum hasmap
        // Buku buku1 = new Buku();
        // buku1.setJudulBuku("TITANIC");
        // System.out.println("Judul buku : " + buku1.getJudulBuku());
        // System.out.println();

        // materi awal HasMap . Pelajari!!! cara penggunaan
        // HashMap<String, String> people = new HashMap<String, String>();
        // people.put("A0001", "Sapto");
        // people.put("A0002", "Carmad");

        // System.out.println(people.get("A0001")); return Sapto

        // penggunaan HasMap
        // <String = tipe data dari key;
        // Buku> = tipedata dari value;
        // lemariBuku = namaAlias untuk instansiasi Class HasMap
        System.out.println("Data buku ");
        HashMap<String, Buku> lemariBuku = new HashMap<String, Buku>();
        HashMap<String, Peminjaman> DaftarTransaksi = new HashMap<String, Peminjaman>();

        // lemariBuku.put = .put adalah keyword pada HasMap untuk memberi nilai pada
        // HasMap. dengan parameter pertama adalah keynya dan parameter kedua adalah
        // valuenya.
        // value dari lemariBuku.put bisa berupa instansiasi class seperti pada contoh
        // dibawah.
        lemariBuku.put("978-3-16-148410-0", /* instansiasi class sebagai parameter value */new Buku("TITANIC",
                "978-3-16-148410-0", "Ga tau dah", "Gramedia", 200, 2010, 20));
        lemariBuku.put("978-3-16-148410-1", new Buku("Harry potter  Order of The Phoenix", "978-3-16-148410-1",
                "Ga tau dah", "Gramedia", 700, 2012, 30));
        lemariBuku.put("978-3-16-148410-2", new Buku("Harry potter and The deadly Hollow", "978-3-16-148410-2",
                "Ga tau dah", "Erlangga", 800, 2001, 50));
        lemariBuku.put("978-3-16-148410-3", new Buku("Tenggelamnya kapal vander wick", "978-3-16-148410-3",
                "Ga tau dah", "Gramedia", 200, 2015, 40));
        int no = 1;
        // foreach data buku dari lemariBuku berdasarkan key(keySet) jadikan sebagai
        // String dataBuku
        for (String dataBuku : lemariBuku.keySet()) {
            String judul = lemariBuku.get(dataBuku).getJudulBuku();
            String isbn = lemariBuku.get(dataBuku).getISBN();
            String penulis = lemariBuku.get(dataBuku).getPenulis();
            String penerbit = lemariBuku.get(dataBuku).getPenerbit();
            int halaman = lemariBuku.get(dataBuku).getJumlahHalaman();
            int stok = lemariBuku.get(dataBuku).getStok();

            System.out.println("No : " + no++);
            System.out.println("Judul buku : " + judul);
            System.out.println("ISBN : " + isbn);
            System.out.println("Penulis : " + penulis);
            System.out.println("Penerbit : " + penerbit);
            System.out.println("Jumlah halaman : " + halaman);
            System.out.println("Stok : " + stok);
            System.out.println();
        }

        System.out.println("Data member ");

        HashMap<String, Member> dataMember = new HashMap<String, Member>();

        dataMember.put("A0000001", new Member("Rizik", "A0000001", "Pagedangan", "20-Desember-2019", "082324804190"));
        dataMember.put("A0000002", new Member("Sapto Aji", "A0000002", "Cihuni", "13-Desember-2019", "082324804175"));
        int nomor = 1;
        for (String ambilDataMember : dataMember.keySet()) {
            String kode = dataMember.get(ambilDataMember).getKodeMember();
            String nama = dataMember.get(ambilDataMember).getNamaMember();
            String alamat = dataMember.get(ambilDataMember).getAlamatRumah();
            String ttl = dataMember.get(ambilDataMember).getTanggalLahir();
            String telepon = dataMember.get(ambilDataMember).getNoTelp();

            System.out.println("No " + nomor++);
            System.out.println("Kode Member : " + kode);
            System.out.println("Nama member : " + nama);
            System.out.println("Alamat member : " + alamat);
            System.out.println("Tempat tanggal Lahir : " + ttl);
            System.out.println("No telp Member : " + telepon);
            System.out.println();

        }
        Scanner userInput = new Scanner(System.in);

        Member member = dataMember.get("A0000001");
        Peminjaman transaction = new Peminjaman(member);
        transaction.setKodeTransaksi();
        // System.out.println(transaction.getKodeTaransaksi());

        boolean runPinjam = true;
        while (runPinjam) {
            // input isbn
            System.out.print("Masukkan isbn buku yang akan dipinjam : ");
            String isbn = userInput.nextLine();
            // cek ketersediaan buku dengan isbn yang di input
            if (lemariBuku.containsKey(isbn)) {
                // kurangi stok buku
                Buku borrowedBook = lemariBuku.get(isbn);
                borrowedBook.dipinjam();
                // masukkan buku ke list yang dipinjam
                transaction.addBook(isbn, borrowedBook);
                int nomr = 1;
                for (String Key : lemariBuku.keySet()) {
                    String judul = lemariBuku.get(Key).getJudulBuku();
                    String ISBN = lemariBuku.get(Key).getISBN();
                    String penulis = lemariBuku.get(Key).getPenulis();
                    int stok = lemariBuku.get(Key).getStok();

                    // print Struk

                    System.out.println("DAFTAR BUKU");
                    System.out.println("No           : " + nomr++);
                    System.out.println("Judul Buku   : " + judul);
                    System.out.println("ISBN         : " + ISBN);
                    System.out.println("Penulis      : " + penulis);
                    System.out.println("Stok         : " + stok);
                    System.out.println();
                }
            } else {
                // jika tidak ditemukan data isbn
                System.out.println("Data buku tidak tersedia");
            }
            System.out.println("Apakah masih akan meminjam buku ? [y/n]");
            String answer = userInput.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                runPinjam = false;
            }
        }
        if (transaction.getBooks().size() > 0) {
            for (String i : transaction.getBooks().keySet()) {
                String judul = lemariBuku.get(i).getJudulBuku();
                String isbn = lemariBuku.get(i).getISBN();
                String penulis = lemariBuku.get(i).getPenulis();
                // print struk
                System.out.println("DAFTAR BUKU");
                System.out.println("No           : " + nomor++);
                System.out.println("Judul Buku   : " + judul);
                System.out.println("ISBN         : " + isbn);
                System.out.println("Penulis      : " + penulis);
                System.out.println();
            }
            System.out.println("Apakah data diatas sudah Benar? [y/n]");
            String answer = userInput.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                DaftarTransaksi.put(transaction.getKodeTransaksi(), transaction);

            } else {
                System.out.println("Transaksi peminjaman dibatalkan ");
            }
        } else {
            System.out.println("Buku apa yang ingin anda pinjam? anda belum meminjam buku apapun");
        }
    }
}