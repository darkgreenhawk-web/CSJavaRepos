public class AnnotateThis {

    public static void main(String[] args) {

        // Q1: Is this line declaring, initializing, or assigning? Explain.
    	// int is declaring apples as a integer
    	// = is assigning apples the integer value of 7
    	// first assigning is initializing the open memory to 7
    	// 
        int apples = 7; 

        // Q2: Why is double used instead of int?
        // Double is declaring a floating point number or a number with decimals
        double pricePerApple = 0.75; 

        // Q3: Is TAX_PERCENT a constant or variable? List two reasons for how you know.
        // TAX_PERCENT is a constant since it is in all caps.
        // Final is how we set data types as CONSTANT
        final int TAX_PERCENT = 8;

        // Q4: What value does totalApples have right now?
        // totalApples assigned to apples which was assigned to 7
        // So totalApples assigned to 7
        int totalApples = apples;

        // Q5: What value does totalApples have now?
        // totalApples is assigned to apples which is still assigned to 7 + 3
        // so total apples is 10
        totalApples = apples + 3;

        // Q6: What is the value of mathResult? Why? What order of operations is being followed?
        // math in java follows PEMDAS so it will multiply 4 by 2 = 8 + 10
        // 10 + 8 = 18
        //mathResult will be assigned 18
        int mathResult = 10 + 4 * 2;

        // Q7: What value is stored here? Why?
        // intDivision is a integer so i can only store integer values so 17/5 = 3
        // 17 and 5 are both integers so their result will only be a integer also
        // 17/5 = 3.4
        int intDivision = 17 / 5;

        // Q8: Why is this NOT 3.4 even though the variable is double?
        // Since 17 and 5 are both integers not floats their result is a integer.
        // So their result will only be 3
        double stillIntDivision = 17 / 5; 

        // Q9: What value is stored here? What changed compared to above?
        // since 5.0 is a double the result will be a double.
        // so realDivision will be assigned 3.4
        double realDivision = 17 / 5.0;

        // Q10: What value will be assigned to remainder
        // % is modulus which finds the remainder of 17 / 5 and give you the number left over
        // so 17 % 5 is 2
        int remainder = 17 % 5; 

        // Q11: What type is the result of this expression? Why?
        // the answer is 3.4 since pricePerApples is a double so the answer is a double.
        // this is a implicit cast since you can put a int into a double.
        double subtotal = totalApples * pricePerApple; 

        // Q12: What kind of casting is being done here? Will it round or truncate?
        // SubTotal is a double using (int) will explicit cast it to a integer.
        // You can not cast a double to a int without it being explicitly casted.
        // Explicit casting a int from a double will just truncate off the decimal point.
        int dollarsOnly = (int) subtotal; 

        // Q13: What class is used for standard output? How can you tell (naming conventions)?
        //Class System an methods out are used to output.
        //out points to the output stream console
        //method println prints a new line in the console.
        System.out.println("totalApples = " + totalApples); 

        // Q14: Before running, predict the outputs for all division-related lines.
        // 
        System.out.println("intDivision = " + intDivision); 
        // intDivision = 3
        System.out.println("stillIntDivision = " + stillIntDivision); 
        // stillIntDivision = 3
        System.out.println("realDivision = " + realDivision); 
        // realDivision = 3.4
        
        // Q15: declare a variable called cuteDog and assign it the string value Jalapena
        String cuteDog = "Jalapena";

        // Q16: Why is 100.0 used instead of 100?
        // because 100.0 is a double since TAX_PERCENT is a integer
        // integer * a double implicitly cast to a double.
        double taxRate = TAX_PERCENT / 100.0; 

        // Q17: Break this expression into steps. What happens first? What value is assigned to totalWithTax?
        // we first declare totalWithTax
        // now we initialize with the result of the by assigning with = subtotal + (subtotal * taxRate); 
        // subtotal * taxRate goes first 
        // add subtotal again to the result of the multiplication 
        double totalWithTax = subtotal + (subtotal * taxRate); 

        // Q18: What data type is totalWithTax and why?
        // totalWithTax is a double because it was declared as a double on line 97.
        System.out.println("totalWithTax = " + totalWithTax);
        
    }
}
