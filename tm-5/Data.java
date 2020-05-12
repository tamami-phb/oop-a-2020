
public class Data {

    private String noSurat;
    private String tanggalSurat;
    private String perihal;
    private String tujuan;

    public Data() {
        noSurat = "";
        tanggalSurat = "";
        perihal = "";
        tujuan = "";
    }

    public Data(String noSurat, String tanggalSurat, String perihal, String tujuan) {
        this.noSurat = noSurat;
        this.tanggalSurat = tanggalSurat;
        this.perihal = perihal;
        this.tujuan = tujuan;
    }

    public void setNoSurat(String noSurat) {
        this.noSurat = noSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getNoSurat() { return noSurat; }

    public String getTanggalSurat() { return tanggalSurat; }

    public String getPerihal() { return perihal; }

    public String getTujuan() { return tujuan; }

}