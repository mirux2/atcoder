package abc.abc405;
import java.util.*;

public class c {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    ArrayList<Integer> a = new ArrayList<>();
    long sum = 0;
    long tmp = 0;
    long tmp_sum = 0;

    for(long i = 0; i < n; i++){
      a.add(sc.nextInt());
    }
    // for(int i = 0; i < a.size(); i++){
    //   for(int j = i+1; j < a.size(); j++){
    //     tmp = a.get(i) * a.get(j);
    //     sum += tmp;
    //   }
    // }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < i; j++){
        tmp_sum += a.get(j);
      }
      sum += (tmp_sum * a.get(i));
    }
    System.out.println(sum);

    sc.close();
  }
}
