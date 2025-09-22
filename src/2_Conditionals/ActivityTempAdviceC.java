public class ActivityTempAdviceC {
    public static void main(String[] args) { //main method
        int temperature = 10; // set variable and set placeholder value

        if (temperature < 0) {  // We use if, not switch because we have a big set of values
            System.out.println("It's freezing! Wear a heavy coat.");
        }
        // we use else ifs, not other if statements because ifs ask for all conditions and else ifs only work if previous statement was false
        else if (temperature <= 10) { // its better for the computer and with a bunch of ifs you would need to worry about overlapping ranges.                         
            System.out.println("It's cold. Wear a coat and a hat."); 
        }
        else if (temperature <= 20) { //more else ifs...
            System.out.println("It's cool. A light jacket should be fine.");
        }
        else if (temperature <= 30) {
            System.out.println("It's warm. Dress comfortably.");
        }
        else { // represents everything greater than 30, because everything else is accounted for. above 30 celsius is really hot
            System.out.println("It's hot! Stay hydrated and wear light clothing.");
        }
    }
}