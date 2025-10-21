import java.util.Scanner;

public class AirLineRegstration {
    public static void main(String[] args) {
        System.out.print( "T=");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
for(int i=0;i<t;i++){
            System.out.print( "A.B,C,D,E = ");
            int a[]=new int[3],d,e;
            for(int j=0;j<3;j++){
                a[j]=sc.nextInt();
                
            }
            d=sc.nextInt();
            e=sc.nextInt();
            int sum=0;
                for(int j=0;j<3;j++){
                sum+=a[j];
                
                
            }
            while(true){
                

                
                if(sum<=d){
                    System.out.println("Yes");
                    break;
                }
                else{
                    int flag=0;
                    for(int j=0;j<3;j++){
                    if(sum-a[j]<=d  && a[j]<e){
                        flag=1;
                        break;
                    }
                    else{
                        sum+=a[j];
                        flag=0;
                    }
                }
                    if(flag==0){
                        System.out.println("No");
                        break;
                        
                    }
                    else{
                    System.out.println("YES");
                    break;

                    }
                }
            }            
        }
        sc.close();
            }    
        }

