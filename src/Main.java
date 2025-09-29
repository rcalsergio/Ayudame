//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }


    // 1. Calcula la velocidad orbital circular (en km/s)
    public static double velocidadOrbital(double radioKm, double masaPlanetaKg) {
        final double G = 6.67430e-20; // Constante G en km^3/(kg*s^2)
        double vOC = Math.sqrt((G*masaPlanetaKg)/radioKm); //v = √(GM/r):
        return vOC;
    }

    // 2. Calcula el empuje de un motor (F = m_dot * v_e)
    public static double calcularEmpuje(double flujoMasicoKgPorS, double velocidadEscapeMPorS) {
      double f = flujoMasicoKgPorS * velocidadEscapeMPorS;
      return f;
    }
    // 3. Convierte nombre de planeta en su número de órbita desde el Sol
    public static int numeroOrbita(String planeta) {
      int numOrbita = 0;
      switch (planeta.toLowerCase()) { // Convertimos a minúsculas para evitar problemas con mayúsculas
        case "mercurio":
          return numOrbita=1;
        case "venus":
          return numOrbita=2;
        case "tierra":
          return numOrbita=3;
        case "marte":
          return numOrbita=4;
        case "jupiter":
          return numOrbita=5;
        case "saturno":
          return numOrbita=6;
        case "urano":
          return numOrbita=7;
        case "neptuno":
          return numOrbita=8;
        default:
          return numOrbita=-1 ; // Para planetas no válidos o desconocidos
      }

    }

    // 4. Promedio de altitudes de satélites
    public static double promedioAltitudes(double[] altitudesKm) {
      if (altitudesKm == null || altitudesKm.length == 0) {
        return 0; // O lanzar una excepción, dependiendo del caso
      }
      double suma = 0;
      for (int i = 0; i < altitudesKm.length; i++) {
        suma += altitudesKm[i];
      }
      double promedio = suma / altitudesKm.length;
      return promedio;
    }


    // 5. Convierte segundos a formato horas:minutos:segundos (útil para misiones espaciales)
    public static String convertirTiempo(int segundos) {
      int h= segundos / 3600;
      int m = (segundos % 3600) / 60;
      int s = (segundos % 3600) % 60;
      return String.format("%02d:%02d:%02d", h, m, s);
    }
}