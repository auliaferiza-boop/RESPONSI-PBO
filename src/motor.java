
public class motor extends kendaraan implements bisaDinyalakan, bisaDiservis {

    private String jenisMotor;

    public motor(String merek, String nomorPolisi, String jenisMotor) {
        super(merek, nomorPolisi);
        this.jenisMotor = jenisMotor;
    }

    public motor(String merek, String nomorPolisi, boolean mesinMenyala, String jenisMotor) {
        super(merek, nomorPolisi, mesinMenyala);
        this.jenisMotor = jenisMotor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Motor : " + jenisMotor);
    }

    @Override
    public void ubahStatusMesin() {
        if (isMesinMenyala()) {
            setMesinMenyala(false);
            System.out.println("Mesin motor dimatikan.");
        } else {
            setMesinMenyala(true);
            System.out.println("Mesin motor dinyalakan.");
        }
    }

    @Override
    public void nyalakanMesin() {
        if (!isMesinMenyala()) {
            setMesinMenyala(true);
            System.out.println("Motor berhasil dinyalakan.");
        } else {
            System.out.println("Mesin motor sudah menyala.");
        }
    }

    @Override
    public void periksaKendaraan() {
        System.out.println("Motor sedang diperiksa.");
    }
}
