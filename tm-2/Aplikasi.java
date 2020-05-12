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

        Hewan kucing = new Hewan("meow", "kucing");
        Hewan anjing = new Hewan("guk", "anjing");
        System.out.println("Hewan : " + kucing.getJenis() + "\n  " +
            "suaranya: " + kucing.getSuara());
        System.out.println("Hewan : " + anjing.getJenis() + "\n  " +
            "suaranya: " + anjing.getSuara());

    }
}