import java.util.Scanner;

public class breakStick {

    public static void main(String[] args) {
        System.out.print( "T=");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            System.out.print("N,X =");
            int N=sc.nextInt();
            int X=sc.nextInt();
            int a=N-X;
            if(a%2==X%2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");

            }


            }
            sc.close();

        }
        
    }

