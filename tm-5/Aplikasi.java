import java.util.*;

public class Aplikasi {

    public static void main(String args[]) {
        Aplikasi app = new Aplikasi();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int answer = sc.nextInt();
            switch(answer) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Formulir Lihat Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        //  proses hapus data di list
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------");
        System.out.print("No Surat: "); String noSurat = sc.nextLine();
        System.out.print("Tanggal Surat: "); String tglSurat = sc.nextLine();
        System.out.print("Perihal: "); String perihal = sc.nextLine();
        System.out.print("Tujuan: "); String tujuan = sc.nextLine();
        //  proses timpa data di list
        Operasi.editData(new Data(noSurat, tglSurat, perihal, tujuan), idx-1);
    }

    public void listData() {
        //  ambil data dan tampilkan ke layar
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  No Surat : " + result.get(i).getNoSurat());
            System.out.println("  Tanggal Surat : " + result.get(i).getTanggalSurat());
            System.out.println("  Perihal : " + result.get(i).getPerihal());
            System.out.println("  Tujuan : " + result.get(i).getTujuan()); 
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------");
        System.out.print("No Surat: "); String noSurat = sc.nextLine();
        System.out.print("Tanggal Surat: "); String tglSurat = sc.nextLine();
        System.out.print("Perihal: "); String perihal = sc.nextLine();
        System.out.print("Tujuan: "); String tujuan = sc.nextLine();
        // proses simpan data
        Operasi.addData(new Data(noSurat, tglSurat, perihal, tujuan));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("APLIKASI DATA SURAT KELUAR");
        System.out.println("----------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}