package abc.abc429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    boolean correct = false;
    
    ArrayList<Integer> a = new ArrayList<>();
    st = new StringTokenizer(br.readLine());
    
    for(int i = 0; i < n; i++){
      a.add(Integer.parseInt(st.nextToken()));
    }
    
    for(int i = 0; i < n; i++){
      int sum = 0;
      for(int j = 0; j < n; j++){
        if(i == j){
          continue;
        }else {
          sum += a.get(j);
        }
      }
      if(sum == m){
        correct = true;
        break;
      }
    }

    if(correct){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
  }
}
