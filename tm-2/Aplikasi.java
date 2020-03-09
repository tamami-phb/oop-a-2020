import entity.*;

public class Aplikasi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Mahasiswa tamami = new Mahasiswa("19001",
            "tamami", "A");

        //mhs.nim = "19001";
        System.out.println("Halo dunia Java");
        System.out.println(mahasiswa.getNim());
        System.out.println(tamami.getNama());
    }
}