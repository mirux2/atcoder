package abc.abc420;

import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x,y,ans;
    x = sc.nextInt();
    y = sc.nextInt();

    ans = x + y;
    if(ans > 12){
      y -= 12 - x;
      ans = y;
    }
    System.out.println(ans);

    sc.close();
  }
}
// 5min