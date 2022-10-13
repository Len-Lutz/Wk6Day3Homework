
/*
**  The lines below with the "//" all the way to the left will cause
**  compiler errors when they are uncommented.  The errors that were
**  generated are indicated in the comments above the errors
*/

public class Week5Day3Homework {
    // variable available ANYWHERE in this class
    static int wholeClassInt = 0;

    public static void main(String[] args) {
        // variables with name starting with number
        // gets "java: not a statement:" compiler error
//        String 1string = "one";

        // gets "java: illegal character: '#'" compiler error
//        int #num = 1;

        // legal, but VERY confusing
        double $amount = 125.45;
        System.out.println("$amount = " + $amount);

        // legal name in Java, but may mean something different in other languages
        String _str = "Valid Name";
        System.out.println("_str = " + _str);

        // using variable that has not been initialised
        // gets compiler error "java: variable notInitialised might not have been initialised"
        int notInitialised;
//        System.out.println("Using un-initialised int: " + notInitialised);

        // more tests
        callThisFirst();
        doThisSecond();
    }

    public static void callThisFirst() {
        // variable available anywhere in THIS METHOD
        int callThisFirstInt = 0;

        if ( callThisFirstInt == 0 )
        {
            // Only accessible inside this "if" block (and sub-blocks inside of "if" block)
            int inIfInt = 3;

            for( int loop=0; loop<20; loop++  )
            {
                // both inIfInt and loop are available here
                System.out.println("loop = " + loop);
                System.out.println("Value of inIfInt = " + (++inIfInt));
            }

            // sets callThisFirstInt to 46?  (initialised to 3, incremented 20 times in for loop
            callThisFirstInt = inIfInt * 2;
            System.out.println("callThisFirstInt = " + callThisFirstInt);

            // "loop" is only available in the above "for loop"
            // Compile Error: "java: cannot find symbol" symbol: variable loop   location: class Week5Day3Homework
//            System.out.println("Value of loop: " + loop);

            // the class variable, the method variable, and inTheIf are all visible here
            // sets wholeClassInt to 1058 (46 * 23)
            wholeClassInt = callThisFirstInt * inIfInt;
            System.out.println("wholeClassInt = " + wholeClassInt);

        }
    }

    public static void doThisSecond() {
        // again, a class variable is access inside a class method
        if (wholeClassInt != 0)
        {
            System.out.println("callThisFirst method must have been called!");
        }

        try
        {
            // variables declared inside a try block
            int numerator = 9;
            int denominator = 0;

            //  IDE gives warning:  "Division by zero" which is caught below
            int result = numerator/denominator;
        }
        catch(Exception e)
        {
            System.out.println("A divide by zero exception was thrown.");
            // Compile Error "java: cannot find symbol:"  symbol: variable denominator    location: class Week5Day3Homework"
//            System.out.println("Cannot divide by " + denominator);
        }
    }
}
