package pattern;
import java.util.Scanner;
//full pyramid
public class pattern3 {
    public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
     for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        char c='A';
        for(int j=0;j<=i;j++){
            System.out.print(c+++" ");
        }
        System.out.println();
    }
}
}
