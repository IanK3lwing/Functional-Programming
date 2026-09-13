import java.lang.Math;
import java.util.Arrays;

public class imperativeApproach {
  public static void main(String[] args) {
     // Usando a Abordagem imperativa
    int[] mylist = {1, 2, 3, 4, 5};

    System.out.println("lista antes de está elevada ao cubo");
    System.out.println(Arrays.toString(mylist));
    for (int el :  mylist) {
      mylist[el - 1] = (int) Math.pow((double) el, 2.0);  
    }

    System.out.println("lista elevada ao cubo");
    System.out.println(Arrays.toString(mylist));
  }
}