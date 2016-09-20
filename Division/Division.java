
/**
 * This class takes two numbers, numerator and denominator, and prints the result of them being divided.
 */
public class Division
{
    // Field Variables
    private double numerator;
    private double denominator;

    /**
     * Creates an object of the class Division and sets numerator and denominator to 1.
     */
    public Division()
    {
        numerator = 1;
        denominator = 1;
    }

    /**
     * Description: Asks the user for inputs for num1 and num2, then sets numerator to num1 and denominator to num2.
     * Input: double num1
     *        double num2
     * Purpose: Lets the user input numbers for numerator and denominator.
     * Example: If the user inputs 4 for num1 and 3 for num2, numerator will be 4 and denominator will be 3.
     */
    public void setNumbers(double num1, double num2)
    {
        numerator = num1;
        denominator = num2;
    }
    
    /**
     * Description: Prints the result of numerator being divided by denominator.
     * Purpose: Lets the user see the result of the numerator being divided by the denominator.
     * Example: If numerator is 4 and denominator is 2, the printed message will say 2.
     */
    public void print()
    {
        System.out.println(numerator / denominator);
    }
}
