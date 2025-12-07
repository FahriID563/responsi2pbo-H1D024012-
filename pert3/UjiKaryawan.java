class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Objek Karyawan biasa
        Karyawan karyawan = new Karyawan("Budi Santoso", 4000000);
        System.out.println("Status: Karyawan Biasa");
        karyawan.tampilInfo();
        System.out.println(); // Baris baru

        System.out.println();

        // Objek Manajer
        Manajer manajer = new Manajer("Siti Aminah", 6000000, 2500000);
        System.out.println("Status: Manajer");
        manajer.tampilInfo();
    }
}
