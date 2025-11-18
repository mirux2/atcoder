package abc.abc405;
import java.util.*;

public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    int count = 0;

    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < a.length; i++){
      b[a[i]-1]++;
    }

    int min = b[0];
    for(int i = n-1; i >= 0; i--){
      for(int j = 0; j < b.length; j++){
        if(min > b[j]){
          min = b[j];
        }
      }
      if(min == 0){
        break;
      }else {
        b[a[i]-1]--;
        count++;
      }
    }

    System.out.println(count);
    sc.close();
  }
}
