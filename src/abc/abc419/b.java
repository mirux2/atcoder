package abc.abc419;

import java.io.*;
import java.util.*;

public class b {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    PrintWriter out = new PrintWriter(System.out);
    int q = Integer.parseInt(st.nextToken());
    ArrayList<Integer> bag = new ArrayList<>();

    for(int i = 0; i < q; i++){
      int minNum = 100;
      st = new StringTokenizer(br.readLine());
      int query = Integer.parseInt(st.nextToken());
      if(query == 1){
        int num = Integer.parseInt(st.nextToken());
        bag.add(num);
      }else {
        Collections.sort(bag);
        minNum = bag.get(0);
        bag.remove(0);
        out.println(minNum);
      }
    }
    out.flush();  
  }
}