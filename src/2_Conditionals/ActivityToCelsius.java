public class ActivityToCelsius {
    public static void main(String[] args){
        //Formula for Fahrenheit to Celsius is:
        // (˚F - 32) * 5/9

        double Fahrenheit = 100; 
        //Set placeholder value for variable representing Fahrenheit
        
        double toCelsius = (Fahrenheit - 32) * 5 / 9; 
        //Set variable to be equal to the equation that represents celsius after Fahrenheit value is transformed

        System.out.println("The temperature in Fahrenheit is".concat(" ") + Fahrenheit); 
        //Prints the set Fahrenheit value so the user knows what Fahrenheit temperature is being converted

        System.out.print("In celsius, the temperature is " + toCelsius); 
        //Prints the fahrenheit temperature in celsius
    }
}