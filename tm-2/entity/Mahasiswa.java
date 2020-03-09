package entity;

public class Mahasiswa {

    // properti
    private String nim;
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

    public String getNama() { return nama; }

    public String getKelas() { return kelas; }

}