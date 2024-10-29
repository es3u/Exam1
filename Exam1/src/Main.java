import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //   System.out.println("Hello world!");
        //1-
        // Write a Java program that accept three numbers from the user and print the largest number .
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three number ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if(x>y&&x>z)
            System.out.println(" the large number is: "+ x);
        else
        if(y>z&&y>x)
            System.out.println(" the large number is: "+ y);
        else
            System.out.println(" the large number is: "+ z);

        System.out.println("********* end 1 *************");


        //  2-  Write a Java program that accept a String and a number from the user,then print the character in the given index .


        System.out.println("Enter your String ");
        in.nextLine();
        String str = in.nextLine();

        System.out.print("Enter your number ");
        int s = in.nextInt();

        System.out.println( str.charAt(s));
        System.out.println("********* end 2 *************");



        //3- Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        int num ;
        int sum  =0 ;
        do{
            System.out.println("enter your number or zero to exit  ");
            num = in.nextInt();

            sum +=num;
        }while(num !=0);

        System.out.println("The sum is "+ sum);
        System.out.println("********* end 3 *************");



        // 4-
//        Write a Java program to find positive and negative numbers of a given array:
//
//        -  Original Array:
//      [10, -21 , 30, 31, -25]
//        -  Expected Output:
//        10  is a positive number
//        -21 is a negative number
//        30 is a positive number
//        31 is a positive number
//        -25 is a negative number

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(-21);
        arr.add(30);
        arr.add(31);
        arr.add(-25);
        for(int a : arr){
            if(a>0)
                System.out.println("is a positive number "+ a);
            if (a<0)
                System.out.println(" is a negative "+ a);

        }
        System.out.println("********* end 4 *************");


        //5-
        // Write a Java program to find a shortest word of a given array:
        //- Original Array:
        //    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
        //    - Expected Output:
        //     JAVA

//
      ArrayList<String> arr2 = new ArrayList<>();
      arr2.add("Tuwaiq");
      arr2.add("Bootcamp");
      arr2.add("Student");
      arr2.add("JAVA");



         String a = arr2.getFirst();


        for (int i = 1; i < arr2.size(); i++) {

            if(a.length() > arr2.get(i).length()){
                a = arr2.get(i);
            }

        }

        System.out.println(a.toLowerCase());
        System.out.println("********* end 5 *************");


    }
}