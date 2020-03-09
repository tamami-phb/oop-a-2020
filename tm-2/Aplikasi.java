import entity.*;

public class Aplikasi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Mahasiswa tamami = new Mahasiswa("19001",
            "tamami", "A");

        System.out.println(Math.abs(-32));
        //mhs.nim = "19001";
        System.out.println("Halo dunia Java");
        System.out.println(mahasiswa.nim);
        System.out.println(tamami.nim);
        System.out.println(mahasiswa.nim);
        System.out.println(tamami.info());
    }
}