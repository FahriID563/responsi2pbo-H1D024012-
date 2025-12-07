import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] inventaris = new defaultMesin[5];
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : inventaris) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma() + "\n");
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : inventaris) {
            if (m instanceof mesinTraktorListrik) ((mesinTraktorListrik) m).suaraMesin();
            else if (m instanceof mesinTraktor) ((mesinTraktor) m).suaraMesin();
            else if (m instanceof mesinMotor) ((mesinMotor) m).suaraMesin();
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin top = inventaris[0];
        for (defaultMesin m : inventaris) {
            if (m.nilaiPerforma() > top.nilaiPerforma()) top = m;
        }
        System.out.println(top.namaMesin + " -> " + top.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        // Simple sorting for top 3
        Arrays.sort(inventaris, Comparator.comparingDouble(defaultMesin::nilaiPerforma).reversed());
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + inventaris[i].namaMesin + " -> " + inventaris[i].nilaiPerforma());
        }
    }
}
