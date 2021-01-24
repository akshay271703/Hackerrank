import java.util.Scanner;
import java.util.regex.*;

/*
    Question 1 : Java Strings Introduction
    Question 2 : Java Substring
    Question 3 : Java Substring Comparisons
    Question 4 : Java String Reverse
    Question 5 : Java Anagrams
    Question 6 : Java Regex 2 - Duplicate Words
    Question 7 : Tag Content Extractor
*/

public class Answers {
    
    public static void Question1(String[] args) {    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        System.out.println((A.charAt(0)+"").toUpperCase()+A.substring(1)+" "+(B.charAt(0)+"").toUpperCase()+B.substring(1));
        sc.close();
    }

    public static void Question2(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
        in.close();
    }

    public static void Question3(String args){
        //Call the function
        getSmallestAndLargest("Test String", 5);
    }

    public static void Question4(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        {
            rev=rev+""+A.charAt(i);
        }
        if(A.equals(rev))
        System.out.println("Yes");
        else
        System.out.println("No");

        sc.close();
    }

    public static void Question5(String args[]){
        isAnagram("test", "estt");
    }

    public static void Question6(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();      
            Matcher m = p.matcher(input);
            while (m.find()) {
               input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        
        in.close();
    }

    public static void Question7(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String line = scan.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
    }

    //Utility functions
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);
        int length=s.length();
        for(int i=0;i<=length-1;i++)
        {
            try
                {
                    String sub=s.substring(i,i+k);
                    if (smallest.compareTo(sub)>0)
                    smallest = sub;
                    if(largest.compareTo(sub)<0)
                    largest=sub;
                }
                catch(Exception e){}
        }
        return smallest + "\n" + largest;
    }

    public static boolean isAnagram(String a, String b) {
        if(a.length()==b.length())
        {
          a=a.toLowerCase();
          b=b.toLowerCase();
          int char1[]= new int[26];
          int char2[]= new int[26];
          for(int i=0;i<=25;i++)
          {
            char1[i]=0;
            char2[i]=0;
          }
          for(int i=0;i<=a.length()-1;i++)
          {
            char1[((int)a.charAt(i))-97]++;
            char2[((int)b.charAt(i))-97]++;
          }
          for(int i=0;i<=25;i++)
          {
            if(char1[i]!=char2[i])
            return false;
          }
          return true;
        }
        else
        return false;
    }

}