public abstract class kendaraan {

    private String merek;
    private final String nomorPolisi;
    private boolean mesinMenyala;

    public static final int BIAYA_PEMERIKSAAN = 50000;

    public kendaraan(String merek, String nomorPolisi) {
        this(merek, nomorPolisi, false);
    }

    public kendaraan(String merek, String nomorPolisi, boolean mesinMenyala) {
        this.merek = merek;
        this.nomorPolisi = nomorPolisi;
        this.mesinMenyala = mesinMenyala;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public boolean isMesinMenyala() {
        return mesinMenyala;
    }

    public void setMesinMenyala(boolean mesinMenyala) {
        this.mesinMenyala = mesinMenyala;
    }

    public void tampilkanInfo() {
        System.out.println("Merek       : " + merek);
        System.out.println("Nomor Polisi: " + nomorPolisi);
        System.out.println("Status Mesin: " + (mesinMenyala ? "Menyala" : "Mati"));
    }

    public int hitungBiayaPemeriksaan() {
        return BIAYA_PEMERIKSAAN;
    }

    public abstract void ubahStatusMesin();
}
