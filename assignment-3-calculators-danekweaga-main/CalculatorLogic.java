/**********************************************************************************************************
 * @title The CalculatorLogic class
 * The CalculatorLogic class provides the logic for the mathematical operations
 * 
 * @author  Chukwunonso Daniel Ekweaga
 * @version (Final Version)
 * @student ID : 3781089
 **********************************************************************************************************/
 
public class CalculatorLogic 
{
    /**********************************************************************************************************
     * Method that performs the mathematical operation based on the equation and selected grade.
     *
     * @param equation The equation to evaluate.
     * @param isGrade4 True if Grade 4 is selected.
     * @param isGrade5 True if Grade 5 is selected.
     * @param isGrade6 True if Grade 6 is selected.
     * @return The result of the operation as a string or an error message if the input is invalid.
     **********************************************************************************************************/
     
    public static String mathOP(String equation, boolean isGrade4, boolean isGrade5, boolean isGrade6)
    {
        String resultDisplay = equation;
        double num1, num2;
        String output = "";
        String[] splitResult = resultDisplay.split(" ");
        
        //Make sure there is only 2 integers and one operator in the equation
        if (splitResult.length != 3)
        {
            output = "Error: Invalid input";
            return output;
        }
        
        // Splits the equation into two numbers and an operator
        num1 = Double.parseDouble(splitResult[0]);
        String operator = splitResult[1];
        num2 = Double.parseDouble(splitResult[2]);
        double answer = 0;
        
        // Perform the operation based on the operator
        switch (operator) 
        {
            case "+":
                answer = num1 + num2;
                output = String.format("%.2f", answer);
                break;
            case "-":
                if (isGrade4 )
                    { 
                        {
                            if(num1 > num2)
                            { 
                                answer = num1 - num2;
                                output = String.format("%.2f", answer);
                            }
                            else
                                output = "Error: Invalid input";
                        }
                        
                }
                
                else
                {
                    answer = num1 - num2;
                    output = String.format("%.2f", answer);
                }       
                break;
            case "÷":
                if (num1 < num2 || num2 == 0) 
                    {
                        output = "Error: Invalid input";
                    } 
                else 
                    {
                        answer = num1 / num2;
                        if (isGrade4) 
                            {
                                if ((num1 % num2) > 0)
                                {
                                    output = "Error: Invalid input";
                                }
                            } 
                        else if (isGrade5) 
                            {
                                answer = (int) (num1 / num2);
                                double rem = (int) (num1 % num2);
                                output = String.format("%.0f R %.0f", answer, rem);
                            } 
                        else if (isGrade6) 
                            {
                                output = String.format("%.4f", answer);
                            } 
                        else 
                            {
                                output = String.format("%.2f", answer);
                            }
                    }
                break;
            case "×":
                answer = num1 * num2;
                output = String.format("%.2f", answer);
                break;
            default:
                output = "Error: Invalid operator";
        }

        return output;
    }
}
