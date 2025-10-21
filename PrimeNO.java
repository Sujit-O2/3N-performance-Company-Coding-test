import java.util.Arrays;

public class PrimeNO {
    public static void main(String[] args) {
        int a[]={10,5,3,11,2};
        int b[]=a.clone();
        Arrays.sort(b);
        int low2=b[2];
        int high2=b[b.length-3];
        for(int i=0;i<a.length;i++){
            if(a[i]==low2){
                low2=i;
            }
            if(a[i]==high2){
                high2=i;
            }
        }
        while(true){
            
        }
        
        
    }
}
