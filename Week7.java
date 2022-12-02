import java.util.Scanner;

class Week7 {

    //method == function

    //function definition

    //function that return value (int, double, char, String, boolean)
    //function that does not return any value (void)
    public static int addTwoNumbers(int numberOne, int numberTwo) { //function header
        //String name;
        int sum = numberOne + numberTwo;
        return sum;
    }

    //function overloading
    public static double addTwoNumbers(double numberOne, double numberTwo) {

        double sum = numberOne + numberTwo;
        return sum;

    }

    public static void addTwoNumbersNonReturning(int numberOne, int numberTwo) { //function header
        //String name;
        int sum = numberOne + numberTwo;
        System.out.println(sum);
        
    }

    public static void addTwoNumbersNonReturningVersionTwo() { //function header
        //String name;
        int a = 5;
        int b = 5;
        int sum =  a + b;
        System.out.println(sum);
        
    }

    //a) public static double salesComission(double salesAmount, double comissionRate)
    //b) public static void viewCalendar(int month, int year)
    //c) public static double squareRoot(double number)
    //d) public static boolean even(int number)

    




public static void main(String[] args) {

    /*
    int a, b, c, d;
    double e, f;
    int sumOne, sumTwo;

    a = 5;
    b = 5;
    c = 6;
    d = 6;
    e = 1.0;
    f = 2.0;

    //sumOne = a + b;
    //sumTwo = c + d;

    //function call
    System.out.println(addTwoNumbers(a,b));
    System.out.println(addTwoNumbers(c,d));
    System.out.println(addTwoNumbers(e,f));
    //addTwoNumbers(c,d);
    addTwoNumbersNonReturning(c,d);
    */

    //-------------------------------------------------------------------------------------------------------

    //Array
                          //0  1  2  3  4
    int[] arrayNumberOne = {1, 2, 3, 4, 5}; //1st option

    System.out.println(arrayNumberOne[1] + arrayNumberOne[3]);

    int[] arrayNumberTwo = new int[5]; //2nd option
    /* 
    arrayNumberTwo[0] = 1;
    arrayNumberTwo[1] = 2;
    arrayNumberTwo[2] = 3;
    arrayNumberTwo[3] = 4;
    arrayNumberTwo[4] = 5;
   

    Scanner input = new Scanner(System.in);

    for(int i=0;i<arrayNumberTwo.length;i++){

        System.out.println("Please enter number " + (i+1));
        arrayNumberTwo[i] = input.nextInt();
        
    }

    for(int i=0;i<=arrayNumberTwo.length;i++){

        System.out.println("Number " + (i+1) + " is " +  arrayNumberTwo[i]);
        
    }

 */

}



}