package abc.abc421;

import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] name = new String[n];

    for(int i = 0; i < n; i++){
      name[i] = sc.next();
    }

    int x = sc.nextInt();
    String y = sc.next();

    if(name[x - 1].equals(y)){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
    sc.close();
  }
}