package abc.abc407;

import java.util.Scanner;

public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int count = 0;
    double ans;
    sc.close();

    for(int i = 1; i < 7; i++){
      for(int j = 1; j < 7; j++){
        if(i + j >= x || (i - j >= y || i - j <= -y)){
          count++;
        }
      }
    }
    ans = count / 36.0;
    System.out.println(ans);
  }
}
