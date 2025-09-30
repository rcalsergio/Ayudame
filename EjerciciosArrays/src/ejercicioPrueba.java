public class ejercicioPrueba {
  //int[] numeros = {1, 2, 3, -1};

  boolean resultado = hayUnNegativo(numeros);

  if(resultado)

  {
    System.out.println("Hay un número negativo.");
  }else

  {
    System.out.println("No hay un número negativo.");
  }


  public static boolean hayUnNegativo(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        return true;
      }
      return false;
    }


  }
}