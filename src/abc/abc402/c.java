package abc.abc402;

import java.util.ArrayList;
import java.util.Scanner;

public class c {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] food = new int[m][n];
    ArrayList<Integer> sunuke = new ArrayList<>();
    int[] sunuke_ate = new int[n];

    for(int i = 0; i < m; i++){
      int zairyou = sc.nextInt();
      int count = 0;
      while(count < zairyou){
        food[i][count] = sc.nextInt();
        count++;        
      }
    }

    for(int i = 0; i < m; i++){
      int like = 0;
      sunuke.add(sc.nextInt());
      for(int j = 0; j < n;){
        for(int k = 0; k < sunuke.size(); k++){
          if(food[i][j] == sunuke.get(k)){
            like++;
          }
        }
      }
      System.out.print(like + " ");
    }
  }
}
//real time WA