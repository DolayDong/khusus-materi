package app.data;

// pelajari hash map !!!

public class Buku {
    private String JudulBuku;
    private String ISBN;
    private String Penulis;
    private String Penerbit;
    private int JumlahHalaman;
    private int TahunTerbit;
    private int Stok;

    // HasMap butuh method construct untuk lebih mudah pemakaiannya

    public Buku(String judul, String isbn, String penulis, String penerbit, int hal, int tahun, int stok) {
        this.JudulBuku = judul;
        this.ISBN = isbn;
        this.Penulis = penulis;
        this.Penerbit = penerbit;
        this.JumlahHalaman = hal;
        this.TahunTerbit = tahun;
        this.Stok = stok;
    }

    public void setJudulBuku(String judulBuku) {
        this.JudulBuku = judulBuku;
    }

    public String getJudulBuku() {
        return JudulBuku;
    }

    public void setISBN(String isbn) {
        this.ISBN = isbn;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setPenulis(String penulis) {
        this.Penulis = penulis;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenerbit(String penerbit) {
        this.Penerbit = penerbit;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.JumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return JumlahHalaman;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.TahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return TahunTerbit;
    }

    public void setStok(int stok) {
        this.Stok = stok;
    }

    public int getStok() {
        return Stok;
    }

    public void dipinjam() {
        this.Stok--;
    }

}