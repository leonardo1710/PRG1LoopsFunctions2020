package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    /**
     * Deciding which loop to use
     *
     * While
     *      You want an Option for not looping at all - initial test of expression is false, loop is skipped
     *      You dont know how many times you need to loop.
     *      Ex.: validating user input, reading data from a file, asking user for input with option to stop at any time.
     *
     * Do-While
     *      You want to execute the loop statement at least once. Ex.: Printing a menu to the user
     *      You dont know how many times you need to loop.
     *
     * For
     *      You know the exact times you need to loop.
     *      Ex.: looping arrays
     */

    public static void main(String[] args){
        App app = new App();
        int userOption;

        // Run a menu with a loop
        System.out.println("Welcome to the System");
        Scanner scanner = new Scanner(System.in);

        /**
         * Calling functions with parameters
         * **/
        /*
        int start = 1;

        while(start > 0){
            int value = scanner.nextInt();
            boolean isEvenNumber = isEven(value);

            if(isEvenNumber == true){
                System.out.println("Even number.");
            }else{
                System.out.println("Odd number.");
            }

            start = value;
        }
        System.out.println(isEven(4));
         */


        /**
         * Do while loop example
         */
        do{
            app.printMenu();

            userOption = scanner.nextInt();

            switch (userOption){
                case 1:
                    app.doThis();
                    break;
                case 2:
                    app.doThat();
                    break;
                default:
                    break;
            }


        }while (userOption != 0);

        System.out.println("Bye bye!");

        app.forLoopExamples();

    }

    /**
     * void functions dont have
     */
    public void printMenu(){
        System.out.println("Options:");
        System.out.println("1 [do this]");
        System.out.println("2 [do that]");
        System.out.println("0 [quit]");

        System.out.println("Your Option:");
    }

    public int doThis(){
        System.out.println("Do this");
        //do something
        return 0;
    }

    public boolean doThat(){
        System.out.println("Do that");
        return true;
    }

    /**
     * function with a return value of boolean
     * that takes one parameter of type int
     */
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;

        // or even simpler
        // return number % 2 == 0;
    }

    public void forLoopExamples(){

        String[] fruits = {"Apple", "Banana", "Pear"};
        int[] myArray = {1, 3, 9, -2};  // init with values
        int[] myArray2 = new int[5];    // init with all zeros
        String[] strArr = new String[4];// init with all null

        //from 0 to end of array
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //from end to 0
        for(int i = fruits.length - 1; i >= 0; i--){
            System.out.println(fruits[i]);
        }

        // uninitialized string arrays are filled with nulls
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

        //your inner loop does a task, which actually is iterative in nature and your outer loop does that task again and again depending on your condition
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        //print triangle backwards
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //for-each loop in java
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }


}
