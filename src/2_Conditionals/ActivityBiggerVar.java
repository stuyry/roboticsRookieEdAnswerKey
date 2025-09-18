public class ActivityBiggerVar {
    public static void main(String[] args){
        double var1 = 1.23; //create a variable and put a place holder double inside

        double var2 = 4.56; // create another variable with a place holder that will be compared with the previous variable 

        if (var1 > var2) { //based on the condition that the first variable is greater than the first...
            System.out.print("Variable 1 is larger than variable 2, and its value is " + var1); 
            // Print that the first variable is larger and then its value through the string ".." and + var1
        }
        else if (var1 == var2) { //Cannot just do else because there is the possibility that the variables are equal to eachother
            System.out.print("The variables are equal to eachother.");
        }
        else { //There were three possibilities >, <, or equal, and since we have just stated what to do if two of the possibilities are true, we can now do else.
            System.out.print("Variable 2 is larger than variable 1 and its value is " + var2); 
        }
    }   
}