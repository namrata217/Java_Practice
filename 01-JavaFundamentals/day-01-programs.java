Q1 — Basic Output

Write a Java program to print:

Hello Java
Welcome to Java Programming
-----------------------------------------------------------------------------    
class Hello{
    public static void main(String[] args)
    {
        System.out.println("Hello Java");
        System.out.println("Welcome to Java Programming");
    }
}
------------------------------------------------------------------------------
Q2 — Variables

Declare variables for:

Your name
Your age
Your salary
Your grade
Whether you are currently learning Java

Display all values.
----------------------------------------------------------------------------------------------
class Variablee{
    public static void main(String[] args)
    {
        String name="Namrata Gholave";
        int age=29;
        double salary=100000;
        char grade='A';
        boolean learningJava = true;
        System.out.println("Your Name : " +name);
            System.out.println("Your Age : " +age);
            System.out.println("Your Salary : " +salary);
            System.out.println("Your Grade : " +grade);
          System.out.println("Your learning java : " +learningJava);
    }
}
--------------------------------------------------------------------------------------------------------------------
Q3 — Arithmetic Operations

Create two integer variables:

a = 20
b = 10

Perform and display:

Addition
Subtraction
Multiplication
Division
Modulus
----------------------------------------------------------------------------------------------
class Airthmetic{
    public static void main(String[] args)
    {
        int a=20;
        int b=10;
        System.out.println("Addition is : "+(a+b));
         System.out.println("Substraction is : "+(a-b));
         System.out.println("Multiplication is : "+(a*b));
         System.out.println("Division is : "+(a/b));
         System.out.println("Modulus is : "+(a%b));
        
    }
}
------------------------------------------------------------------------------------------------------------
Q4 — Primitive Data Types

Create one variable for each of the 8 primitive data types and display their values.
------------------------------------------------------------------------------------------------------------
class DataTypes{
    public static void main(String[] args)
    {
        int age=29;
        char grade='A';
        boolean result=true;
       // String name="Namrata Shailesh Gholave";
        float marks=75.5f;
        double salary=90000000;
        long number=9088888888888888L;
        byte a=1;
        short n=234;
        System.out.println("Your age : "+age);
        System.out.println("Your grade : "+grade);
        System.out.println("Your result : "+result);
        System.out.println("Your marks : "+marks);
        System.out.println("Your salary : "+salary);
        System.out.println("Your number : "+number);
        System.out.println(" a : "+a);
        System.out.println(" n : "+n);
    }
}
------------------------------------------------------------------------------------------------------------
Q5 — Student Information

Create variables for:

Student name
Roll number
Age
Marks
Grade
Pass/fail status

Display the student information in a readable format.

Q6 — Rectangle

Create variables for length and width.

Calculate and display:

Area
Perimeter

Use:

Area = length × width
Perimeter = 2 × (length + width)
Q7 — Simple Salary Calculation

Create:

basicSalary = 50000

Calculate:

HRA = 20% of basic salary
DA  = 10% of basic salary

Display:

Basic Salary
HRA
DA
Total Salary
Q8 — Type Checking

Create variables of:

int
double
char
boolean
String

Display each value along with a meaningful label.
