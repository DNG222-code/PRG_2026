package activitat5extra1;

public class Test {

    public static void main(String[] args) {

        // ===================================================
        // Creamos los 3 objetos del Ordenador.
        // ===================================================
        Ordenador o1 = new Ordenador("Ordenador Sobremesa PcCom Imperial", "AMD Ryzen 7 7800X3D",
                "MSI PRO B650-S WIFI", "RTX 4070 Super", "Acer Predator Vesta II RGB DDR5", "WD BLACK SN770",
                1869.0, true);

        Ordenador o1pt1 = new Ordenador("16 GB", "32 GB", "2TB");

        Ordenador o2 = new Ordenador("Ordenador Sobremesa PcCom Imperial", "AMD Ryzen 7 7800X3D",
                "MSI PRO B650-S WIFI", "RTX 4070 Super", "Acer Predator Vesta II RGB DDR5", "WD BLACK SN770",
                1869.0, true);

        Ordenador o2pt1 = new Ordenador("16 GB", "32 GB", "2TB");

        Ordenador o3 = new Ordenador("Ordenador Sobremesa PcCom Imperial", "AMD Ryzen 7 7800X3D",
                "MSI PRO B650-S WIFI", "RTX 4070 Super", "Acer Predator Vesta II RGB DDR5", "WD BLACK SN770",
                1869.0, true);

        Ordenador o3pt1 = new Ordenador("16 GB", "32 GB", "2TB");

        Ordenador.mostrarOrdenadores(o1, o2, o3);

    }

}