package abc.abc404;

import java.util.ArrayList;
import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c1 = s.toCharArray();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    char[] c2 = alphabet.toCharArray();
    sc.close();

    ArrayList <Character> charlist = new ArrayList<>();

    for(char c: c2){
      charlist.add(c);
    }

    for(int i = 0; i < s.length(); i++){
      for(int j = 0; j < charlist.size(); j++){
        if(c1[i] == charlist.get(j)){
          charlist.remove(j);
        }
      }
    }
    System.out.println(charlist.get(0));
  }
}
