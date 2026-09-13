import java.lang.Math;
import java.util.Arrays;
import java.util.stream.IntStream;


public class functionalApproach {
  public static void  main(String[] args) {
    // FORMA FUNCIONAL
    int[] mylist = {1,2,3,4,5};

    System.out.println("lista antes de ser elevada ao quadrado");
    System.out.println(Arrays.toString(mylist));

    int[] mylistPow = IntStream.of(mylist).map( el -> (int) Math.pow((double) el, 2.0)).toArray();

    System.out.println("lista elevada ao quadrado");
    System.out.println(Arrays.toString(mylistPow));

    

    
  }
}