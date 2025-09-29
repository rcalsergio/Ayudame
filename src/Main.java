//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }


    // 1. Calcula la velocidad orbital circular (en km/s)
    public static double velocidadOrbital(double radioKm, double masaPlanetaKg) {
        final double G = 6.67430e-20; // Constante G en km^3/(kg*s^2)
        return Math.sqrt((G * masaPlanetaKg)/radioKm);
    }

    // 2. Calcula el empuje de un motor (F = m_dot * v_e)
    public static double calcularEmpuje(double flujoMasicoKgPorS, double velocidadEscapeMPorS) {
        return flujoMasicoKgPorS * velocidadEscapeMPorS;
    }

    // 3. Convierte nombre de planeta en su número de órbita desde el Sol
    public static int numeroOrbita(String planeta) {
       switch (planeta.toLowerCase()) {
           case "mercurio": return 1;
           case "venus": return 2;
           case "tierra": return 3;
           case "marte": return 4;
           case "jupiter": return 5;
           case "saturno": return 6;
           case "urano": return 7;
           case "neptuno": return 8;
           default: return -1;
       }
    }

    // 4. Promedio de altitudes de satélites
    public static double promedioAltitudes(double[] altitudesKm) {
        int suma = 0;
        for (int i = 0; i < altitudesKm.length; i++) {
            suma += altitudesKm[i];
        }
        return suma/altitudesKm.length;
    }

    // 5. Convierte segundos a formato horas:minutos:segundos (útil para misiones espaciales)
    public static String convertirTiempo(int segundos) {

        //return String.format("%02d:%02d:%02d", h, m, s);
        int h = segundos/3600;
        int m = (segundos % 3600)/60;
        segundos = segundos % 60;
        return String.format("%02d:%02d:%02d", h, m, segundos);
    }
}