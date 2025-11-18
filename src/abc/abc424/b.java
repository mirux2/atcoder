package abc.abc424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int[] problems = new int[m];
    for(int i = 0; i < m; i++){
        problems[i] = i + 1;
    }
    
    Set<Integer>[] sets = new HashSet[n];
    for (int i = 0; i < sets.length; i++) {
      sets[i] = new HashSet<>();
    }
    
    for(int i = 0; i < k; i++){
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st1.nextToken()) -1;
      int b = Integer.parseInt(st1.nextToken());
      sets[a].add(b);
      for(int j = 0; j < n; j++){
        if(Arrays.stream(problems).allMatch(sets[j]::contains)){
          System.out.print(j+1+" ");
          sets[j].clear();
        }
      }
    }
  }
}
