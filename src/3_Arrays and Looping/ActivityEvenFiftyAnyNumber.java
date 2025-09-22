public class ActivityEvenFiftyAnyNumber {
    public static void main(String[] args) { // main method :)))))
        for (int i = 50; i >= 0; i --) { //Basically defines a value for variable, sets a condtion, and repeats -- (which means minusing one everytime) every time
            if (i % 2 == 0) { // Recall modulo and the format of conditions (must set a value you aree dividing by and use == not =)
                System.out.println(i); //prints out every value where i is even. Use println bcs it creates a line break before each print
            }
            /* else {     |     In any case, you can use this else code to prevent any issues in future coding problems
                continue; |     This is typically used in switch cases, but it can be used in virtually anything that goes through values
            }             |      This symbol indicates a block comment, meaning i don't need to do // at every line -> */
        }
    }
}
