public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEM INFORMASI KENDARAAN ===");

        // pengujian 1: membuat objek mobil dan motor
        mobil mobilSaya = new mobil("Toyota", "B 1234 ABC", 4);
        motor motorSaya = new motor("Honda", "B 5678 XYZ", "Matic");

        // pengujian 2: menampilkan informasi kendaraan
        System.out.println("\n--- Informasi Mobil ---");
        mobilSaya.tampilkanInfo();

        System.out.println("\n--- Informasi Motor ---");
        motorSaya.tampilkanInfo();

        // pengujian 3: encapsulation dan setter
        System.out.println("\n--- Mengubah Merek Mobil ---");
        mobilSaya.setMerek("Mitsubishi");
        System.out.println("Merek baru: " + mobilSaya.getMerek());

        // pengujian 4: menggunakan constructor overloading
        mobil mobilKedua = new mobil("Suzuki", "B 9999 DEF", true, 4);
        System.out.println("\n--- Mobil Kedua ---");
        mobilKedua.tampilkanInfo();

        // pengujian 5: mengubah status mesin memakai if-else
        System.out.println("\n--- Mengubah Status Mesin ---");
        mobilSaya.ubahStatusMesin();
        mobilSaya.ubahStatusMesin();

        // pengujian 6: menguji interface bisaDinyalakan
        System.out.println("\n--- Menyalakan Kendaraan ---");
        bisaDinyalakan objekMesin = mobilSaya;
        objekMesin.nyalakanMesin();

        // pengujian 7: menguji interface bisaDiservis
        System.out.println("\n--- Pemeriksaan Kendaraan ---");
        bisaDiservis objekServis = motorSaya;
        objekServis.periksaKendaraan();

        // pengujian 8: multiple interface
        System.out.println("\n--- Multiple Interface ---");
        mobilSaya.periksaKendaraan();
        mobilSaya.nyalakanMesin();

        // pengujian 9: menghitung biaya pemeriksaan
        System.out.println("\n--- Biaya Pemeriksaan ---");
        System.out.println("Biaya: Rp" + mobilSaya.hitungBiayaPemeriksaan());

        // pengujian 10: menampilkan konstanta dan atribut final
        System.out.println("\n--- Immutability ---");
        System.out.println("Biaya tetap: Rp" + kendaraan.BIAYA_PEMERIKSAAN);
        System.out.println("Nomor polisi: " + mobilSaya.getNomorPolisi());

        System.out.println("\n=== PENGUJIAN SELESAI ===");
    }
}

