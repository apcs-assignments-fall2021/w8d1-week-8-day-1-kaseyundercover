import java.util.Scanner;

public class MyMain {
    public static double Pythagorean(double x, double y){
        return (Math.sqrt(x * x + y * y));
    }
    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        return (int) (Math.random()*11)+10;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        System.out.println("Pythagorean:");
        System.out.println(Pythagorean(5,12));
        System.out.println("\n");



        int x = randomTeen();
       int y = randomTeen();
       int z = randomTeen();

        System.out.println(x+" "+y+" "+z);
        System.out.println(Mathey.max(Mathey.max(x,y),z));
        System.out.println(Mathey.max(x,y,z));
        System.out.println(Math.min(Math.min(x,y),z));
        System.out.println("\n");




// Uncomment this code later!
System.out.println("Mathey.max tests");
System.out.println(Mathey.max(1, 2)); // 2
System.out.println(Mathey.max(2, 1)); // 2
System.out.println(Mathey.max(2.0, 1.1));
System.out.println(Mathey.max(1.6, 2.3));
System.out.println(Mathey.max(1.6, 2.3, 3.3, 11.9));
        System.out.println("\n");

System.out.println("Two Int");
System.out.println(Mathey.randomTwoInt(1,28));
        System.out.println("\n");

System.out.println("One Int");
System.out.println(Mathey.randomOneInt(4));
        System.out.println("\n");

System.out.println("Pow");
System.out.println(Mathey.pow(10,3));
        System.out.println("\n");

System.out.println("Abs");
System.out.println(Mathey.abs(-2));
System.out.println(Mathey.abs(9));
        System.out.println("\n");

System.out.println("Round");
System.out.println(Mathey.round(1.9));
System.out.println(Mathey.round(1.3));
System.out.println(Mathey.round(1.6));
        System.out.println("\n");

System.out.println("Floor");
System.out.println(Mathey.floor(1.99));
        System.out.println("\n");

System.out.println("Ceil");
System.out.println(Mathey.ceil(1.99));
System.out.println(Mathey.ceil(1.3));
System.out.println(Mathey.ceil(0.1));
        System.out.println("\n");

System.out.println("Sqrt");
System.out.println(Mathey.sqrt(25));
    }

}


