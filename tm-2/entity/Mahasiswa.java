package entity;

public class Mahasiswa {

    // properti
    public String nim;
    private String nama;
    private String kelas;

    // konstruktor
    public Mahasiswa() {}

    public Mahasiswa(String nim, String nama,
        String kelas) {
            this.nim = nim;
            this.nama = nama;
            this.kelas = kelas;
    }

    // method
    public String getNim() { return nim; }

    public void setNim(String nima) {
        nim = nima;
    }

    public String getNama() { return nama; }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() { return kelas; }

    public String info() {
        return "Nama : " + nama + "\n" +
            "Kelas : " + kelas + "\n" +
            "NIM : " + nim;
    }

}