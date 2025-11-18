package abc.abc420;

import java.io.*;
import java.util.*;

public class c {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      a.add(Integer.parseInt(st.nextToken()));
    }
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      b.add(Integer.parseInt(st.nextToken()));
    }

    for(int i = 0; i < q; i++){
      st = new StringTokenizer(br.readLine());
      
      if(st.nextToken().charAt(0) == 'A'){
        int x = Integer.parseInt(st.nextToken()) - 1;
        a.set(x, Integer.parseInt(st.nextToken()));
      }else if(st.nextToken().charAt(0) == 'B'){
        int x = Integer.parseInt(st.nextToken()) - 1;
        b.set(x, Integer.parseInt(st.nextToken()));
      }

      for(int i = 0; i < ){

      }

    }

    for(int i = 0; i < n; i++){
      System.out.print(a.get(i)+" ");
      // System.out.println(a.get(i));
    }
  }
}
