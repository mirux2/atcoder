package abc.abc429;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class c {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int val1;
    int val2;
    int val3;
    int count = 0;

    ArrayList<Integer> a = new ArrayList<>();
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      a.add(Integer.parseInt(st.nextToken()));
    }

    for(int i = 0; i < n - 2; i++){
      val1 = a.get(i);
      for(int j = i + 1; j < n - 1; j++){
        val2 = a.get(j);
        for(int k = j + 1; k < n; k++){
          val3 = a.get(k);
          if(!((val1 == val2 && val3 == val1) || (val1 != val2 && val1 != val3 && val2 != val3))){
            count++;
          }
        }
      }
    }

    System.out.println(count);
  }
}
