package abc.abc405;
import java.util.*;

public class a {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int x = sc.nextInt();
    String ans = "No";

    if(x == 1){
      if(r >= 1600 && r <= 2999){
        ans = "Yes";
      }
    }else{
      if(r >= 1200 && r <= 2399){
        ans = "Yes";
      }
    }

    System.out.println(ans);
    sc.close();
  }
}