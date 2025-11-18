package abc.abc403;

import java.io.*;
import java.util.*;

public class c {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());

    boolean[] fullNum = new boolean[n + 1];

    List<Set<Integer>> data = new ArrayList<>(n + 1); //初めて
    for(int i = 0; i <= n; i++) data.add(new HashSet<>());

    PrintWriter out = new PrintWriter(System.out); 

    for(int  i = 0; i < q; i++){
      st = new StringTokenizer(br.readLine()); 
      int query = Integer.parseInt(st.nextToken());
      int userNum = Integer.parseInt(st.nextToken());
      if(query == 1){
        int pageNum = Integer.parseInt(st.nextToken());
        data.get(userNum).add(pageNum);
      }else if(query == 2){
        fullNum[userNum] = true;
      }else if(query == 3){
        int pageNum = Integer.parseInt(st.nextToken());
        if(fullNum[userNum] || data.get(userNum).contains(pageNum)){ // contains?
          out.println("Yes");
        }else {
          out.println("No");
        }
      }
    }
    out.flush();
  }
}
