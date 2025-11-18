package abc.abc418;

import java.util.Scanner;

public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int begin = 0;
    double end = 0;
    double size = 0;
    double count = 0;

    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 't'){
        begin = i;
      }
    }
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(str.length()-1 - i) == 't'){
        end = i;
      }
    }
    for(int i = begin; i <= end; i++){
      if(str.charAt(i) == 't'){
        count++;
      }
    }
    if(begin > end){
      size = (double)begin - end + 1;
    }
    if(size - 2 <= 0){
      System.out.println(0);
    }else {
      System.out.println((count - 2) / (size - 2));
    }
    sc.close();
  }
}

//??