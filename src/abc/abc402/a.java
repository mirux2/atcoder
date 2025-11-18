package abc.abc402;
import java.util.*;

class a {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] str = s.toCharArray();
    ArrayList <Character> ans = new ArrayList<>();

    for(int i = 0; i < str.length; i++){
      if(Character.isUpperCase(str[i])){
        ans.add(str[i]);
      }
    }
    for(int i = 0; i < ans.size(); i++){
      System.out.print(ans.get(i));
    }
    

  }

}
 //RT AC