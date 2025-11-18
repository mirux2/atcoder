package abc.abc419;

import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    if(str.equals("red")){
      System.out.println("SSS");
    }else if(str.equals("blue")){
      System.out.println("FFF");
    }else if(str.equals("green")){
      System.out.println("MMM");
    }else {
      System.out.println("Unknown");
    }
    sc.close();
  }
}
