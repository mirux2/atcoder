package abc.abc429;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class c {
  static long c2(long cnt){
    return cnt * (cnt - 1) / 2;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] a = new int[n];
    int[] cnt = new int[n];
    long ans = 0;

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      a[i] = Integer.parseInt(st.nextToken()) - 1; //aの1は0にして、後のcnt配列のindex番号と1対1対応させたい
    }

    for(int i = 0; i < n; i++){
      cnt[a[i]]++;
    }

    for(int i = 0; i < n; i++){
      ans += c2(cnt[i]) * (n - cnt[i]);
    }
    System.out.println(ans);
  }
}

// A配列から同じ数を二つ、違う数を一つ選び、三つの数をピックアップする方法は何個あるかという問題。
// 例: A[3,2,2,4,2] (2,2,4) (3,2,2) など

// 考え方
// 二つの数をa、一つの数をbとしてピックアップする。
// 配列に、cnt配列(count)を用意し、A配列の数の種類の出現回数を保持しておく。 例: cnt[0,3,1,1,0] 1は0個、2は3個、3は1個… など
// 二つピックアップするaの数の種類をどれにするかはループでn回まわし、bはその他のため、式はこうなる↓

// 計算式
// 二種類のaと一種類のbの全組み合わせ = aの数の組み合わせ全て(例の場合、三つの中から、二つピックアップする2の組み合わせの数 3C2) *
//  aの数の種類以外全ての種類(例の場合、3と4);
// 実際のコードはこんな感じ↓
// answer = c2(cnt[i]) * (n - cnt[i]); c2メソッドは組み合わせの数を計算する関数

// これをcnt配列の0~n-1(A配列の要素である1からn)まで繰り返せば答えが求まる。