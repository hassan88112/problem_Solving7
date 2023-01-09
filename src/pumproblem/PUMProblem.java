
package pumproblem;

import java.util.Scanner;


public class PUMProblem {

    
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int counter=1;
        for(int i=1;i<=num;i++){
        if(counter % 4 == 0){
            
            System.out.println("PUM");
            counter++;
            i--;
            
        }else{
            System.out.print(counter++ +" "+counter++ +" "+counter++ +" ");
        }
        }
        System.out.print("PUM");
    }
    
}
