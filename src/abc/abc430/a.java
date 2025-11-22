package abc.abc430;
import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    sc.close();

    if(d >= b){
      System.out.println("No");
    }else if(c >= a){
      System.out.println("Yes");
    }else if(d < b || c < a){
      System.out.println("No");
    }
  }
}
