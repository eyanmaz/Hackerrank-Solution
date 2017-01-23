import java.util.*;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
           if(a.length-k+i < a.length)
              a[a.length-k+i] = in.nextInt();
            else
              a[i-k] = in.nextInt();
        }
        in.close();

        for(int i=0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
