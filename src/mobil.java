public class mobil extends kendaraan implements bisaDinyalakan, bisaDiservis {

    private int jumlahPintu;

    public mobil(String merek, String nomorPolisi, int jumlahPintu) {
        super(merek, nomorPolisi);
        this.jumlahPintu = jumlahPintu;
    }

    public mobil(String merek, String nomorPolisi, boolean mesinMenyala, int jumlahPintu) {
        super(merek, nomorPolisi, mesinMenyala);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    @Override
    public void ubahStatusMesin() {
        if (isMesinMenyala()) {
            setMesinMenyala(false);
            System.out.println("Mesin mobil dimatikan.");
        } else {
            setMesinMenyala(true);
            System.out.println("Mesin mobil dinyalakan.");
        }
    }

    @Override
    public void nyalakanMesin() {
        if (!isMesinMenyala()) {
            setMesinMenyala(true);
            System.out.println("Mobil berhasil dinyalakan.");
        } else {
            System.out.println("Mesin mobil sudah menyala.");
        }
    }

    @Override
    public void periksaKendaraan() {
        System.out.println("Mobil sedang diperiksa.");
    }
}

