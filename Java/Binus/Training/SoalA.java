import java.util.Scanner;

public class SoalA {
  static Scanner io = new Scanner(System.in);
  static int MAX = 1000;

  public int[] data = new int[MAX];

  public String[] checking(int K, int tot) {
    int hsl = 0, idk;
    int[] dt = new int[100];
    for (int i = 0;i < tot;i++) {
      idk = 0;
      for (int j = i+1;j < tot;j++)
        if (data[i] == data[j]) idk++;
      if (idk == (K-1)) dt[hsl++] = data[i];
    }

    String[] arr = new String[100];
    if (hsl > 1 || hsl == 0) {
      arr[0] = "false";
      arr[1] = "" + hsl;
      return arr;
    } else {
      arr[0] = "true";
      arr[1] = "" + dt[0];
      return arr;
    }
  }

  public static void main(String[] args) {
    int N, K, M, tot;
    SoalA m = new SoalA();

    N = io.nextInt();

    for (int i = 0;i < N;i++) {
      K = io.nextInt();
      tot = 0;
      for (int j = 0;j < K;j++) {
        M = io.nextInt();
        for (int k = tot;k < (tot+M);k++) {
          m.data[k] = io.nextInt();
        }
        tot += M;
      }
      String[] h = m.checking(K, tot);
      int hsl = Integer.parseInt(h[1]);
      System.out.print("Case #" + (i+1) + ": ");
      if (h[0] == "false" && hsl == 0)
        System.out.println("AM I LOST?");
      else if (h[0] == "false" && hsl > 0)
        System.out.println("NOT SURE");
      else
        System.out.println(hsl);
    }
  }
}
