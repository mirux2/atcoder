package abc.abc421;
import java.util.*;

public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    ArrayList<Long> list = new ArrayList<>();
    list.add(x);
    list.add(y);
    for(int i = 0; i < 8; i++){
      long s = list.get(i) + list.get(i + 1);
      if(s >= 10){
        String str = String.valueOf(s);
        String reversed = new StringBuilder(str).reverse().toString();
        long num = Long.parseLong(reversed);
        list.add(num);
      }else {
        list.add(s);
      }
    }
    System.out.println(list.get(9));

    sc.close();
  }
}
