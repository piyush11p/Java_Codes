import java.util.*;
public class cond{
   /*  public static void main(String[] args) {
       int income =600000;
       double tax;
       
       if(income<500000){
           tax=0;
       }
       else if(income <1000000 && income>=500000){
           tax=income*0.2;
       }else{
           tax=income*0.3;
       }
       System.out.println(tax);
       Double left = income-tax;
       System.out.println(left);
    }*/
    public static void main(String[] args) {
        int a =5;
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
     }
     public static void main(String[] args) {
        int a =5;
        int b=6;
        int c=-2;
        if(a >=b && a>=c){
            System.out.println("a is largest");
        }
        else if(b >=c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
     }
 }
 
}