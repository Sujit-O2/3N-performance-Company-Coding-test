import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        try {
            System.out.print("T=");
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                System.out.print("N,X =");
                int N=sc.nextInt();
                int X=sc.nextInt();

                // Security Enhancement: Input validation to prevent OutOfMemoryError and NegativeArraySizeException
                if (N < 0 || N > 1000000) {
                    throw new IllegalArgumentException("Invalid input size");
                }

                int a[]=new int[N];
                System.out.print("A = ");
                for(int j=0;j<N;j++){
                    a[j]=sc.nextInt();
                }
                for(int j=0;j<N;j++){
                    if(a[j]<=X){
                        X-=a[j];
                        a[j]=1;
                    }
                    else{
                        a[j]=0;
                    }
                }
                
                for(int j=0;j<N;j++){
                    System.out.print(a[j]);
                }
                System.out.println();
            }
            sc.close();
        } catch (Exception e) {
            // Security Enhancement: Prevent stack trace leakage by returning a generic error message
            System.out.println("An error occurred during execution.");
        }
    }
}
