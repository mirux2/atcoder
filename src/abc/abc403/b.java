package abc.abc403;
import java.util.*;

public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.next();
    String u = sc.next();
    int sa = t.length() - u.length() + 1;
    int f = 0;

    char[] str = t.toCharArray();
    char[] str2 = u.toCharArray();

    for(int i = 0; i < sa; i++){
      int count = 0;
      for(int j = 0; j < u.length(); j++){
        if(str[i+j] == (str2[j]) || str[i+j] == '?'){
          count++;
          if(count == u.length()){
            f = 1;
          }
        }
      }
    }

    if(f == 1){
      System.out.println("Yes");
    }else {
      System.out.println("No");

    }

    sc.close();
  }
}

//AC