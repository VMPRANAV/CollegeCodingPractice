package pattern;

import java.util.Scanner;

public class pattern5 {
     public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
     for(int i=0;i<n;i++){
       
 for(int j=0;j<=i;j++){
            System.out.print(j+1+" ");
        }
        System.out.println();
}
for(int i=n-2;i>=0;i--){
    
  
        for(int j=0;j<=i;j++){
            System.out.print(j+1+" ");
        }
        System.out.println();
}
}
}
