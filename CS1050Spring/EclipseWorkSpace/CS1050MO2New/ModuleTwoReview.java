public class ModuleTwoReview
{
    public static void main(String[] args)
    {
        System.out.println("=== BOOLEAN / RELATIONAL OPERATORS ===");

        // Predict the results before running
        
        System.out.println("1: " + (5 > 3 && 2 < 4)); // true
        
        System.out.println("2: " + (true || false && false)); // true
        
        System.out.println("3: " + (!(5 > 3))); // false
        
        System.out.println("4: " + (3 + 4 > 5 && 10 != 8)); //true

        

        System.out.println("\n=== SIMPLE IF / ELSE ===");

        int x = 7; // 

        if (x > 5) // true 
            System.out.println("5: A"); // 
        else 
            System.out.println("5: B");
//output 5: A


        int y = 3;

        if (y > 5)  //false
            System.out.println("6: A");
        else // 
            System.out.println("6: B");

        System.out.println("6: C");
//output 6: B
//		 6: C


        System.out.println("\n=== MULTI-WAY IF ===");

        int score = 85;

        if (score >= 90) //false
            System.out.println("7: A");
        else if (score >= 80) //true
            System.out.println("7: B");
        else // skipped
            System.out.println("7: C");
//output 7: B


        System.out.println("\n=== NESTED IF ===");

        int a = 10;
        int b = 4;

        if (a > 5)// true
        {
            if (b > 5)// false
                System.out.println("8: A");
            else // else
                System.out.println("8: B");
        }
//output 8: B


        System.out.println("\n=== SWITCH STATEMENT ===");

        int day = 4;

        switch(day)
        {
            case 1:
                System.out.println("9: Monday");
            case 2:
                System.out.println("9: Tuesday");
            case 3:
            	System.out.println("9: Wednesday");
            case 4:
            	System.out.println("9: Thursday");
            case 5:
            	System.out.println("9: Friday");
            	break;
            default:
                System.out.println("9: Other");
        }
// 9: Monday
// 9: Tuesday


        System.out.println("\n=== VARIABLE SCOPE ===");

        int value = 5; // value 5

        if (value == 5) //true
        {
            value = 10; // value 10
        }

        System.out.println("10: " + value);

        if (value == 10) //True
        {
        	int newNumber = 20; //newNumber 20 but gets dropped due to scope
        }
        	
        // what will print?
        //System.out.println(newNumber); can't run since it isn't in the scope of the variable.

        
        System.out.println("\n=== METHODS / PARAMETERS ===");

        int result = add(3, 4); // add returned the result of 3 + 4 = 7
        System.out.println("11: " + result); 
        // output 11: 7



        int m = 10;

        System.out.println("12: " + mystery(m));
        // output 15
        System.out.println("13: " + m);
        // output 10


        System.out.println("\n=== COMBINED FLOW QUESTION ===");
        
        int n = 6;

        if (n > 5)
        {
            System.out.println("14: A");
            
            if (n > 10)
                System.out.println("14: B");
        }
        else
        {
            System.out.println("14: C");
        // 
        }
    }


    public static int add(int a, int b)
    {
        return a + b;
    }


    public static int mystery(int x)
    {
        x = x + 5;
        return x;
    }
}