package entity;

public class Hewan {
    private String suara;
    private String jenis;

    public Hewan(String suara, String jenis) {
        this.suara = suara;
        this.jenis = jenis;
    }

    public String getSuara() {
        return suara;
    }

    public String getJenis() {
        return jenis;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}