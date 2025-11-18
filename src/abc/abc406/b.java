package abc.abc406;

import java.util.Scanner;

public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long currentNum = 1;
    long maxval = 1;
    for(int i = 0; i < k; i++){
      maxval *= 10;
    }
    for(int i = 0; i < n; i++){
      long num = sc.nextLong();
      if(currentNum <= (maxval - 1) / num){
        currentNum *= num;
      }else {
        currentNum = 1;
      }
    }
    System.out.println(currentNum);
    sc.close();
  }
}
