public class ActivityGrade {
    public static void main(String[] args) {
        int grade = 9; // must state before, can't do this inside the parentheses of switch. Also added placeholder value
        switch (grade) { //switch case based on the value of grade variable

            case 9: //basically says if grade == 9
                System.out.print("You are in Algebra 1"); //what to do if this is the case
            break; //basically tells JVM, okay there is nothing left to do, so just do what's inside and pack it up
                
            case 10: //basically says if grade == 10
                System.out.print("You are in Geometry"); //what to do if this is the case
            break; //basically tells JVM, okay there is nothing left to do, so just do what's inside and pack it up

            case 11: //basically says if grade == 11
                System.out.print("You are in Algebra 2"); //what to do if this is the case
            break; //basically tells JVM, okay there is nothing left to do, so just do what's inside and pack it up

            case 12: //basically says if grade == 12
                System.out.print("You are in Precalculus or Calculus!"); //what to do if this is the case
            break; //basically tells JVM, okay there is nothing left to do, so just do what's inside and pack it up
        
            default: //basically says what happens if not any of those above values/cases

            if (grade < 9) { //if statement, saying that if less than 9 do what's inside
                System.out.print("You are not in High School");
            }
            else { //we can use else because it would go through the above Switch cases, so after that all that would be left is < 9 or > 12
                System.out.print("You are in college");
            }
        }
    }
}
