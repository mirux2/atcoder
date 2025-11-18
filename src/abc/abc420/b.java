package abc.abc420;

import java.io.*;
import java.util.*;

public class b {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    String[] str = new String[n];
    char[] syosu = new char[m];
    int[] user_point = new int[n];

    for(int i = 0; i < n; i++){
      str[i] = br.readLine();
    }

    for(int i = 0; i < m; i++){
      int x = 0;
      int y = 0;
      for(int j = 0; j < n; j++){
        if(str[j].charAt(i) == '0'){
          x++;
        }else {
          y++;
        }
      }
      if(x == n || y == n){
        syosu[i] = '2';
      }else if(x < y){
        syosu[i] = '0';
      }else {
        syosu[i] = '1';
      }
    }
    // for(int i = 0; i < m; i++){
    //   System.out.print(syosu[i]);
    // }
    // System.out.println();

    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(syosu[i] == '2'){
          user_point[j]++;
        }else if(str[j].charAt(i) == syosu[i]){
          user_point[j]++;
        }
      }
    }

    // for(int i = 0; i < n; i++){
    //   System.out.print(user_point[i] + " ");
    // }
    // System.out.println();

    int max = 0;
    for(int i = 0; i < user_point.length; i++){
      if(max < user_point[i]){
        max = user_point[i];
      }
    }

    for(int i = 0; i < user_point.length; i++){
      if(max == user_point[i]){
        System.out.print(i + 1 + " ");
      }
    }
  }
}
// 1h10m