//inheritance
//concrete class
/*class First {
    void m1() {
        System.out.println("hello");
    }
    void m2() {
        System.out.println("hell");
    }
}

public class Program {
    public static void main(String[] args) {
        First f = new First();
        f.m2(); // Calling method from Second class
        f.m1(); // Calling method from First class
    }
}*/
//abstract class
/* Abstract class
abstract class First {
    void m1() {
        System.out.println("hello");
    }
}
class Second extends First{


    void m2() {
        System.out.println("hell");
    }
}

public class Program {
    public static void main(String[] args) {
       // First f = new First();
        Second s = new Second();
        s.m2(); // Calling method from Second class
        s.m1(); // Calling method from First class
    }
}*/
/* Interface
interface First {
    void m1();
    void m2();
}

class Second implements First {
    public void m1() {
        System.out.println("hello");
    }

    public void m2() {
        System.out.println("hell");
    }
}

public class Program {
    public static void main(String[] args) {
        First f = new Second();
        f.m2(); //upcasting
        f.m1();
        }

}
//Exceptional Handling
import java.util.Scanner;
import java.util.InputMismatchException;
class Program 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        try
        {
        System.out.println("enter two number");
        int x =sc.nextInt();
        int y= sc.nextInt();
        int z=x+y;
        System.out.println("Sum : " +z);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Exception:invalid");
        }
    } 
    
}
//Constructor ,polymorphism get and set method
class Bank 
{
    public static void main(String args[])
    {
        Account acc= new Account(5000,"Amar",1234);
        System.out.println(acc);
        acc.setName("Ram");
        System.out.println("bal: " + acc.getBalance());
        acc.deposit(2000);
        System.out.println(acc);
        acc.withdraw(2000);
        System.out.println(acc);
    }
    
}
class Account{
    private int balance;
    private String name;
    private int pin;
    public Account(int balance, String name, int pin)
    {
        this.balance = balance;
        this.name=name;
        this.pin=pin;
    }
    public String toString()
    {
        return "Details: " + this.balance + "," + this.name + "," + this.pin; 
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public String getName()
    {
        return this.name;
    }
    public int getPin()
    {
        return this.pin;
    }
    public void deposit(int amt)
    {
        this.balance= this.balance + amt;
    }
    public void withdraw(int amt)
    {
        if(this.balance >=amt)
        {
            this.balance=this.balance + amt;
        }
        else
        {
            System.out.println("Low balance");
        }
    }
    
}
//InputMismatchException and ArithmeticException - using try-catch blocks, which is a good practice. 
However, there's a small issue in your code: the catch block for ArithmeticException is not reachable 
because division by zero would throw an ArithmeticException before it checks for an InputMismatchException.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("Result: " + z);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input");
        } catch (ArithmeticException e1) {
            System.out.println("Exception: Denominator is zero");
        }
    }
}
//here it handle all type of exceptoin by jusing using exception e
import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("Result: " + z);
        } catch (Exception e) //upcasting
        {
            System.out.println("Exception: handled");
        } 
    }
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {
    public static void main(String args[]) {
        String s ="abc";
        try {
            int n =Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) //upcasting
        {
            System.out.println("Exception: handled");
        } 
    }
}
