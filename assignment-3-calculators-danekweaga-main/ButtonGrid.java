import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

/**********************************************************************************************************
 * @title The ButtonGrid class.
 * The ButtonGrid class manages the layout and functionality of the calculator buttons.
 *
 * @author  Chukwunonso Daniel Ekweaga
 * @version (Final Version)
 * @student ID : 3781089
 **********************************************************************************************************/
 
public class ButtonGrid 
{
     // Instance variables
    private GridPane buttonGrid;
    private Screen display;
    private GradeSelector gradeRadioButtons;
    
     
     /*******************************************************************************************
     * 2 Parameter Constructor(s) for the ButtonGrid class.
     *
     * @param display The display component for the calculator.
     * @param gradeRadioButtons The grade selector component for the calculator.
     *******************************************************************************************/
    public ButtonGrid(Screen display, GradeSelector gradeRadioButtons) 
    {
        this.display = display;
        this.gradeRadioButtons = gradeRadioButtons;
        initializeButtons();
    }

    /****************************************************************
     * Method to initialize the buttons and adds them to the grid.
     ****************************************************************/
    private void initializeButtons() 
    {
        buttonGrid = new GridPane();
        buttonGrid.setHgap(10);
        buttonGrid.setVgap(10);
        buttonGrid.setPadding(new Insets(10));

        // Button labels for the calculator
        String[] buttonLabels = {"7", "8", "9", "×", "C", 
                                  "4", "5", "6", "-", "DEL",
                                  "1", "2", "3", "+", "OFF",
                                  "0", ".", "=", "÷"};
        
        // Loop through the button labels and create buttons
        for (int i = 0; i < buttonLabels.length; i++) 
        {
            Button numberButton = createButton(buttonLabels[i]);
            int row = i / 5;
            int col = i % 5;
            
            //Position for "0" button
            if (buttonLabels[i].equals("0")) 
            {
                // Place "0" in the 4th row
                row = 3;
                
                // Place "0" in the 1st column
                col = 0;
            }
            
            // Add the button to the grid
            buttonGrid.add(numberButton, col, row);
        }
    }

    /***************************************************************************************
     * Method to create a button with the specified label and sets up its event handlers.
     *
     * @param label The label for the button.
     * @return The created button.
     ***************************************************************************************/
    private Button createButton(String label) 
    {
        Button calcButton = new Button(label);
        calcButton.setPrefSize(60, 60);
        calcButton.setStyle("-fx-font-size: 16; -fx-background-color: #1976D2; -fx-text-fill: white; -fx-background-radius: 5;");

        //Add pushed down effect to the button
        calcButton.setOnMousePressed(e -> calcButton.setStyle("-fx-font-size: 16; -fx-background-color: #0D47A1;"+
        
                            " -fx-text-fill: white; -fx-translate-y: 2.5px; -fx-background-radius: 5;"));
                  
        //Reverse pushed down effect on button
        calcButton.setOnMouseReleased(e -> {
            if (calcButton.isHover()) if (calcButton.isHover())
            {
                calcButton.setStyle("-fx-font-size: 16; -fx-background-color: #2196F3; -fx-text-fill: white; -fx-background-radius: 5;");
            } 
            else 
            {
                calcButton.setStyle("-fx-font-size: 16; -fx-background-color: #1976D2; -fx-text-fill: white; -fx-background-radius: 5;");
            }
        });

        // Add hover effect to buttons
       calcButton.setOnMouseEntered(e -> calcButton.setStyle("-fx-font-size: 16; -fx-background-color: #2196F3; -fx-text-fill: white; -fx-background-radius: 5;"));
        calcButton.setOnMouseExited(e -> calcButton.setStyle("-fx-font-size: 16; -fx-background-color: #1976D2; -fx-text-fill: white; -fx-background-radius: 5;"));

        //Set up Buttons in the calculator
        switch(label)
        {
            //Number Buttons: Adds the number to equation field
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                calcButton.setOnAction(e -> display.getEquationField().setText(display.getEquationField().getText() + label));
                break;
                
            //Operator Button: adds the operator with spaces
            case "+": case "-": case "×": case "÷":
                 calcButton.setOnAction(e -> display.getEquationField().setText(display.getEquationField().getText() + " " + label + " "));
                 break;
                 
            //Equals to button: calculates the result
            case"=":
                calcButton.setOnAction(e -> display.getResultField().setText(CalculatorLogic.mathOP(display.getEquationField().getText(), gradeRadioButtons.isGrade4Selected(), gradeRadioButtons.isGrade5Selected(), gradeRadioButtons.isGrade6Selected())));
                break;
                
            //Clear button: clears both the equation and result fields
            case"C":
                calcButton.setOnAction(e -> {
                                            display.getEquationField().clear();
                                            display.getResultField().clear();
                                        });
                break;
                
            //Delete button: removes the last character in the equation field
            case "DEL":
                calcButton.setOnAction(e -> {
                                        String text = display.getEquationField().getText();
                                        if (!text.isEmpty()) {
                                            display.getEquationField().setText(text.substring(0, text.length() - 1));
                                        }});
                break;
                
            //Off button
            case"OFF":
                calcButton.setOnAction(e -> ((Stage) calcButton.getScene().getWindow()).close());
                break;
                 
        }
        return calcButton;
    }
    
    
    /**********************************************************************************************
     * Accessor method that returns the button grid containing all the calculator buttons.
     *
     * @return The button grid.
     **********************************************************************************************/
    public GridPane getButtonGrid() 
    {
         return buttonGrid;
    }
}