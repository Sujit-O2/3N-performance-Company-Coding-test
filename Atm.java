import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.print( "T=");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("N,X =");
            int N=sc.nextInt();
            int X=sc.nextInt();
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
        
    }
}
