package abc.abc418;

import java.io.IOException;
import java.util.Scanner;

public class a {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n < 3){
      System.out.println("No");
    }else {
      String str = sc.next();
      String judge = str.substring(n-3,n);
      if(judge.equals("tea")) {
        System.out.println("Yes");
      }else {
        System.out.println("No");
      }
    }
    sc.close();
  }
}
