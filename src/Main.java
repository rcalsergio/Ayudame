import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    // 1. Calcula la velocidad orbital circular (en km/s)
    public static double velocidadOrbital(double radioKm, double masaPlanetaKg) {
        final double G = 6.67430e-20; // Constante G en km^3/(kg*s^2)
        double velocidadOrbitalCircular = G*(radioKm)/(masaPlanetaKg*masaPlanetaKg);
        return 0;
    }

    // 2. Calcula el empuje de un motor (F = m_dot * v_e)
    public static double calcularEmpuje(double flujoMasicoKgPorS, double velocidadEscapeMPorS) {
        double empujeMotor = flujoMasicoKgPorS * velocidadEscapeMPorS;
        return 0;
    }

    // 3. Convierte nombre de planeta en su número de órbita desde el Sol
    public static int numeroOrbita(String planeta) {
        Scanner sc = new Scanner(System.in);
        int planetaUsuario= sc.nextInt();

        System.out.println("Mercúrio → 1"
                            + "Vênus → 2"
                            + "Terra → 3"
                            + "Marte → 4"
                            + "Júpiter → 5"
                            + "Saturno → 6"
                            + "Urano → 7"
                            + "Netuno → 8");

        switch (planetaUsuario) {
            case 1:
                System.out.println("Mercúrio 88 dias (~0,24 anos)");;
            case 2:
                System.out.println("Vênus → 2225 dias (~0,62 anos)");
            case 3:
                System.out.println("Terra → 365 dias (1 ano)");
            case 4:
                System.out.println("Marte → 687 dias (~1,88 anos)");
            case 5:
                System.out.println("Júpiter → 11,86 anos");
            case 6:
                System.out.println("Saturno → 29,45 anos");
            case 7:
                System.out.println("Urano → 84 anos");
            case 8:
               System.out.println("Netuno → 164,8 anos");
        }

       return 0;

    }

    // 4. Promedio de altitudes de satélites
    public static double promedioAltitudes(double[] altitudesKm) {
        int satelites = 8;
        double promedioAltitudes = 0;
        double promedio = altitudesKm.length/satelites;

        return 0;
    }

    // 5. Convierte segundos a formato horas:minutos:segundos (útil para misiones espaciales)
    public static String convertirTiempo(int segundos) {
        int minutos = segundos % 3600 / 60;
        int hora = segundos / 3600;

        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

}