package abc.abc407;

import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    int one = (int)(a / b);
    double decOne = (a / b) - one;

    if(decOne < 0.5){
      System.out.println(one);
    }else if(decOne > 0.5){
      one++;
      System.out.println(one);
    }

    sc.close();
  }
}
