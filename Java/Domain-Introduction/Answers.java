
// Question 1 : Welcome to Java
// Question 2 : Java Stdin and Stdout I
// Question 3 : Java If-Else
// Question 4 : Java Stdin and Stdout II
// Question 5 : Java Output Formatting
// Question 6 : Java Loops I
// Question 7 : Java Loops II
// Question 8 : Java Datatypes
// Question 9 : Java End-of-file
// Question 10 : Java Int to String
// Question 11 : Java Date and Time
// Question 12 : Java Currency Formatter

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
public class Answers {

    public static void Question1(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    public static void Question2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }

    public static void Question3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==0)//Even
        {
            if(N>=2 && N <=5)
            System.out.println("Not Weird");
            else if(N>=6 && N<=20)
            System.out.println("Weird");
            else if(N>20)
            System.out.println("Not Weird");
        }
        else 
        {
            System.out.println("Weird");
        }
        scanner.close();
    }

    public static void Question4(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write your code here.
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }

    public static void Question5(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.print(s1);
            int spaces = 15-s1.length();
            
            for(int j=0;j<=spaces-1;j++)
            {
                System.out.print(" ");
            }
            if(x==0)
            System.out.print("000");
            else if(x>0 && x <10)
            System.out.print("00"+x);
            else if(x>9 && x<100)
            System.out.print("0"+x);
            else
            System.out.print(x);
            System.out.println();
        }
        sc.close();
    }

    public static void Question6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+" = "+N*i);
        }
        scanner.close();
    }

    public static void Question7(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static void Question8(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x>=(Byte.MIN_VALUE) && x<=Byte.MAX_VALUE)
                System.out.println("* byte");
                if(x>=(Short.MIN_VALUE) && x<=Short.MAX_VALUE)
                System.out.println("* short");
                if(x>=(Integer.MIN_VALUE) && x<=Integer.MAX_VALUE)
                System.out.println("* int");
                if(x>=(Long.MIN_VALUE) && x<=Long.MAX_VALUE)
                System.out.println("* long");

            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }

    public static void Question9(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc = new Scanner(System.in);
        int i=0;
        while(Sc.hasNext())
        {
            i++;
            System.out.println(i+" "+Sc.nextLine());
        }
        Sc.close();
    }

    public static String Question10(String args[]) {
        return args[0]+"";
    }

    public static String Question11(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
   }

   public static void Question12(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Write your code here.
    Locale indiaLocale = new Locale("en", "IN");

    NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
    NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


    System.out.println("US: " + us.format(payment));
    System.out.println("India: " + india.format(payment));
    System.out.println("China: " + china.format(payment));
    System.out.println("France: " + france.format(payment));
    }
}