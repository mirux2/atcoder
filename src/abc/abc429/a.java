package abc.abc429;

import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.close();

    for(int i = 0; i < n; i++){
      if(i > m-1){
        System.out.println("Too Many Requests");
      }else {
        System.out.println("OK");
      }
    }
  }
}
