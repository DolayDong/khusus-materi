package app.data;

public class Member {

    private String NamaMember;
    private String KodeMember;
    private String AlamatRumah;
    private String TanggalLahir;
    private String NoTelp;

    public Member(String nama, String kode, String alamat, String ttl, String telp) {
        KodeMember = kode;
        NamaMember = nama;
        AlamatRumah = alamat;
        TanggalLahir = ttl;
        NoTelp = telp;
    }

    public String getNamaMember() {
        return NamaMember;
    }

    public void setNamaMember(String namaMember) {
        NamaMember = namaMember;
    }

    public String getKodeMember() {
        return KodeMember;
    }

    public void setKodeMember(String kodeMember) {
        KodeMember = kodeMember;
    }

    public String getAlamatRumah() {
        return AlamatRumah;
    }

    public void setAlamatRumah(String alamatRumah) {
        AlamatRumah = alamatRumah;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        TanggalLahir = tanggalLahir;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String noTelp) {
        NoTelp = noTelp;
    }

}