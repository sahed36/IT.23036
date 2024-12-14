import java.util.Scanner;

public class task {

    public static void sumClass () {
        float sum = 0;
        double i = 1.0;
        do{
           sum += i;
           i = i -0.1;
           //System.out.println("sumClass: "+sum);
        } while(i>=0.1);
        System.out.println("Summing up 1+0.9+....+0.1 = "+sum);  
    }
    public static void divisorMultipleClass(){
      
        int num1,num2,max,min,rem;
        Scanner sc = new Scanner(System.in);
        num1  = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
       while(min!=0) {
        rem = max % min;
        max = min;
        min = rem;
       }

       int GCD = max;
       System.out.println("GCD : "+ GCD);
       int LCM = (num1*num2)/GCD;
       System.out.println("LCM : "+LCM);
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        sumClass(); 
        divisorMultipleClass();
    }
}