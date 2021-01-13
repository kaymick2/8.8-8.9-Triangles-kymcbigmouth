import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sideA = 0;
    double sideB = 0;
    double sideC = 0;
    Triangleops userTriangle = new Triangleops(sideA, sideB, sideC);
    System.out.println("TriTheorem \n*");
    System.out.println("This program tests side lengths to determine if a triangle can be formed with them.");
    System.out.println("*");
    System.out.println("Please enter a length for side A:");
    while (!input.hasNextDouble()) {
      System.out.println("Please enter a length for side A:");
      input.next();
    }
    sideA = input.nextDouble();
    // side b
    System.out.println("Please enter a length for side B:");
    while (!input.hasNextDouble()) {
      System.out.println("Please enter a length for side B:");
      input.next();
    }
    sideB = input.nextDouble();
    // side c
    System.out.println("Please enter a length for side C:");
    while (!input.hasNextDouble()) {
      System.out.println("Please enter a length for side C:");
      input.next();
    }
    sideC = input.nextDouble();
    System.out.println("You have entered "+sideA+", "+sideB+", "+sideC+" as sides A, B, and C respectively. ");
    if(userTriangle.test(sideA, sideB, sideC)){
      System.out.println("Your values form a valid triangle.");
    }else{
      System.out.println("Your values do not form a valid triangle.");
    }
    // for output, call test method. output result with if statements accordingly.
    // figure out how to only output type if test method returns true
  }
}