package abc.abc402;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class b {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    int query;
    Queue<Integer> queue = new ArrayDeque<>();
    ArrayList<Integer> ans = new ArrayList<>();

    for(int i = 0; i < q; i++){
      query = sc.nextInt();
      if(query == 1){
        queue.add(sc.nextInt());
      }else if(query == 2){
        ans.add(queue.poll());
      }
    }

    for(int i = 0; i < ans.size(); i++){
      System.out.println(ans.get(i));
    }
  }
}
