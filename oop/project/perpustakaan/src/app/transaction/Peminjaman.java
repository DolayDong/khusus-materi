// package app.transaction;

// import app.data.Member;
// import app.data.Buku;

// import java.util.HashMap;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class Peminjaman {
//     private String kodeTaransaksi;
//     private HashMap<String, Buku> bukuDipinjam = new HashMap<String, Buku>();
//     private Member Member;
//     private Date dateTime;

//     public Peminjaman(Member member) { // untuk menandai data member mana yang melakukan transaksi peminjaman
//         this.Member = member;
//         Date hariPeminjaman = new Date();
//         this.dateTime = hariPeminjaman;
//     }

//     public String getKodeTaransaksi() {
//         return kodeTaransaksi;
//     }

//     public HashMap<String, Buku> setKodeTaransaksi() {
//         this.kodeTaransaksi = kodeTaransaksi;
//         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//         String date =  formatter.format(this.dateTime);
//         this.kodeTaransaksi = this.Member.getKodeMember() + "-" + date;

//         //get semua data buku dalam satu transaksi
//         public HashMap <String, Buku> getBooks(){
//             return bukuDipinjam;
//         }
//         public void addBook (String isbn, Buku buku){
// 		this.bukuDipinjam.put (isbn, buku);
// 		System.out.println ("Buku " + bukuDipinjam.get(isbn).getJudulBuku() + " Berhasil Ditambahkan ke Transaksi"); //lebih baik, karena ditampilkan setelah buku benar benar dimasukkan ke peminjaman
// 	}

//         //get satu buku yang dipinjam berdasarkan isbn
//         public Buku getBook(String Isbn){
//             return this.bukuDipinjam.get(isbn);
//         }

//     }

// }
package app.transaction;

import app.data.Buku;
import app.data.Member;

import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Peminjaman {
    private String KodeTransaksi;
    private HashMap<String, Buku> BukuDipinjam = new HashMap<String, Buku>();
    private Member member;
    private Date dateTime;

    public Peminjaman(Member member) {// butuh data member karena untuk kejelasan ini transaksi milik member siapa
        this.member = member;
        Date today = new Date();
        this.dateTime = today;
    }

    public String getKodeTransaksi() {
        return KodeTransaksi;
    }

    public void setKodeTransaksi() {
        // this.KodeTransaksi = KodeTransaksi;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date = formatter.format(this.dateTime);
        this.KodeTransaksi = this.member.getKodeMember() + "-" + date;
    }

    // get semua data buku dalam satu transaksi
    public HashMap<String, Buku> getBooks() {
        return BukuDipinjam;
    }

    // tambahkan satu buku yang mau dipinjam (dijalankan ketika meminjam buku)
    public void addBook(String isbn, Buku buku) {
        this.BukuDipinjam.put(isbn, buku);
        System.out.println("Buku " + BukuDipinjam.get(isbn).getJudulBuku() + " Berhasil Ditambahkan ke Transaksi"); // lebih
                                                                                                                    // baik,
                                                                                                                    // karena
                                                                                                                    // ditampilkan
                                                                                                                    // setelah
                                                                                                                    // buku
                                                                                                                    // benar
                                                                                                                    // benar
                                                                                                                    // dimasukkan
                                                                                                                    // ke
                                                                                                                    // peminjaman
    }

    // get satu buku yang dipinjam berdasarkan isbn
    public Buku getBook(String isbn) {
        return this.BukuDipinjam.get(isbn);
    }
}