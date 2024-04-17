// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Main");
        Say.hiToAll();
        Clear.everyOne();
    }
}
class Say
{
    static void hiToAll()
    {
        System.out.println("hii to all");
        
    }
}
class Clear
{
    static void everyOne()
    {
     System.out.println("clear all");   
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Person.canVote(24);
    }
}
class Person
{
   static void canVote(int age) 
   {
       if(age>=18)
          System.out.println("can vote");
          else
          System.out.println("can not vote");
   }
}
// Online Java Compiler
// instance method

class HelloWorld {
    public static void main(String[] args) {
        Person.canVote(24);
    }
}
class Person
{
   static void canVote(int age) 
   {
       if(age>=18)
          System.out.println("can vote");
          else
          System.out.println("can not vote");
   }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("ENter char : ");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Check.isAlphabet(ch);
    }
}


class Check
{
   static void isAlphabet(char ch) 
   {
       if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))
          System.out.println("alphabet");
          else
          System.out.println("not a alphabet");
   }
}
public class Code {
    public static void main() {
        Test.fun();
    }
}

class Test {
    public static void fun() {
        System.out.println("Hello all");
    }
}
public class Code {
    public static void main() {
        Test obj = new Test();
        obj.fun();
    }
}

class Test {
    public void fun() {
        System.out.println("Hello all");
    }
}
public class Code {
    public static void main() {
        First.fun();
        Second.fun();
    }
}

class First {
    public static void fun() {
        System.out.println("First fun");
    }
}

class Second {
    public static void fun() {
        System.out.println("Second fun");
    }
}
public class Code {
    public static void main() {
        First obj1 = new First();
        Second obj2 = new Second();
        obj1.fun();
        obj2.fun();
    }
}

class First {
    public void fun() {
        System.out.println("First fun");
    }
}

class Second {
    public void fun() {
        System.out.println("Second fun");
    }
}
public class Code {
    public static void main() {
        Add.nums(5, 10); // Invoking the method
    }
}

class Add {
    public static void nums(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
    }
}
public class Code {
    public static void main() {
        Multiply obj = new Multiply();
        obj.nums(5, 10); // Invoking the method
    }
}

class Multiply {
    public void nums(int a, int b) {
        int result = a * b;
        System.out.println("Product: " + result);
    }
}
public class Code {
    public static void main() {
        // Read input and invoke method
        Check obj = new Check();
        obj.isEven(10); // Example input
    }
}

class Check {
    public void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
public class Code {
    public static void main() {
        // Read input and invoke method
        Person obj = new Person();
        obj.canVote(25); // Example input
    }
}

class Person {
    public static void canVote(int age) {
        if (age >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Cannot vote");
        }
    }
}
public class Code {
    public static void main() {
        // Read input and invoke method
        Check obj = new Check();
        obj.isAlphabet('A'); // Example input
    }
}

class Check {
    public static void isAlphabet(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
public class Code {
    public static void main() {
        // Read input and invoke method
        Find obj = new Find();
        obj.big(5, 10, 3); // Example input
    }
}

class Find {
    public void big(int a, int b, int c) {
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + max);
    }
}
