package abc.abc428;

import java.util.ArrayList;
import java.util.Scanner;

public class b {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String str = sc.next();
    String tmp;
    int count = 0;
    int max = 0;
    ArrayList<String> arry = new ArrayList<>();

    for(int i = 0; i < n - k; i++){
      tmp = str.substring(i,i+2);
      for(int j = i; j < n - k - i; j++){
        if(tmp.equals(str.substring(j,j+2))){
          count++;
        }
      }
      if(count > max){
        max = count;
        arry.add(tmp);
      }
    }
    System.out.println(arry);
  }
}
//WA