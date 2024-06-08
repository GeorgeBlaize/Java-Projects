import java.util.Scanner;

public class SimpleCalculator {

    public static void displayMenu(){

        System.out.println("Simple Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static double add(double a,double b){
         return a+b;
    }
    public static double sub(double a,double b){
        return a-b;
    }

    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        return a/b;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        double num1,num2,result;

        do{


            displayMenu();
            System.out.println("Enter your choice: ");
            while (!scanner.hasNext()){
                System.out.println("Invalid input.Please enter a number between 1 and 5.");


              scanner.next();
            }
            choice=scanner.nextInt();

            switch (choice){


                case 1:
                    System.out.println("Enter first number: ");
                    num1=scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    num2=scanner.nextDouble();
                    result=add(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 2:
                    System.out.println("Enter first number: ");
                    num1=scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    num2=scanner.nextDouble();
                    result=sub(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 3:
                    System.out.println("Enter first number: ");
                    num1=scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    num2=scanner.nextDouble();
                    result=multiply(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 4:
                    System.out.println("Enter first number: ");
                    num1=scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    num2=scanner.nextDouble();
                    result=divide(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.Please enter a number between 1 and 5.");
                    break;

            }
            System.out.println();
        }while (choice!=5);
        scanner.close();
    }

}
