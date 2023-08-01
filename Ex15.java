
package ex15;
import java.util.*;


public class Ex15 {
    public void activity(int start[],int end[],int n){
        System.out.println("selected activity are: ");
        int j=0;
        for(int i=1;i<n;i++){    //bydefaut 1st activity selected
            if(start[i]>=end[j]){
                System.out.println(i+1);
                j=i;
            }
                
        }
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of element");
        int n=sc.nextInt();
        Ex15 e=new Ex15();
        int start[]=new int[n];
        int end[]=new int[n];
        System.out.println("start time");
        for(int i=0;i<n;i++){
          start[i]=sc.nextInt();
          //end[i]=sc.nextInt();
        }
        System.out.println("end time");
        for(int i=0;i<n;i++){
          //start[i]=sc.nextInt();
          end[i]=sc.nextInt();
        }
        e.activity(start,end,n);
    }
    
}
