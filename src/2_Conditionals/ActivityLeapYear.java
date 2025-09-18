public class ActivityLeapYear {
    public static void main(String[] args) {
        int year = 4;

        if (year % 100 == 0 && year % 400 != 0) { 
            // three possibilities: divisibible by 100 and not 400, not divisible by a 100 and not divisible by 400, and divisible by both
            // We account for the first possibility listed above here.
            System.out.print("The year " + year + " is not a leap year.");
        }
        else if (year % 4 == 0){
            //This takes care of the other 2 possibilies
            // because if it is not 100, it can be like 96 and still be divisible by 4
            // and if it is both (solely meaning divisible by 400) this accounts for that
            System.out.print("The year " + year + " is a leap year.");
        }
        else {
            //Now the last possibility is that it is not divisible by 100 and not divisible by 400, and in this scenario it is not divisible by 4, so say 95.
            System.out.print("The year " + year + " is not a leap year.");
        }
    }
}
