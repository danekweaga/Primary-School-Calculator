import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;

/**********************************************************************************************************
 * @title The Screen Class
 * The Screen class manages the display fields (equation and result) and the background rectangle
 * for the calculator screen.
 *
 * @author Chukwunonso Daniel Ekweaga
 * @version (Final Version)
 * @studentID 3781089
 **********************************************************************************************************/
 
public class Screen 
{
    // Instance variables
    private TextField result;
    private TextField equation;
    private VBox screenBox;
    private StackPane screenContainer;
    private Rectangle backGround;
    
    /*******************************************************************************************
     * Constructor for the Screen class.
     * Initializes the screen fields and creates the screen box.
     *******************************************************************************************/
    public Screen() 
    {
        initializeScreenFields();
        createScreenBox();
    }

    /********************************************************************************
     * Method to initialize the screen fields and create the background rectangle.
     ********************************************************************************/
    private void initializeScreenFields() 
    {
        // Initialize the result text field
        result = new TextField();
        result.setStyle("-fx-font-size: 18; -fx-background-color: transparent; -fx-border-color: transparent;");
        result.setAlignment(Pos.CENTER_RIGHT);
        result.setEditable(false);

        // Initialize the equation text field
        equation = new TextField();
        equation.setStyle("-fx-font-size: 18; -fx-background-color: transparent; -fx-border-color: transparent;");
        equation.setAlignment(Pos.CENTER_RIGHT);
        equation.setEditable(false);
        
        // Initialize the background rectangle with rounded corners
        backGround = new Rectangle(300,80);
        backGround.setFill(Color.WHITE); 
        backGround.setStroke(Color.LIGHTGRAY); 
        backGround.setStrokeWidth(2);
        backGround.setArcWidth(20);
        backGround.setArcHeight(20);
    }

    /***************************************************************************************
     * Method to create the screen box with the background rectangle and text fields.
     ***************************************************************************************/
    private void createScreenBox() 
    {
        // Create a VBox to hold the equation and result fields
        screenBox = new VBox();
        screenBox.setSpacing(12);
        screenBox.setPadding(new Insets(10));
        screenBox.getChildren().addAll(equation, result);

        // Create a StackPane to overlay the text fields on the background rectangle
        screenContainer = new StackPane();
        screenContainer.getChildren().addAll(backGround,screenBox);
        StackPane.setAlignment(screenBox, Pos.CENTER);
    }
    
    /*******************************************************************************************************************
     * Accessor method that returns the screen container containing the background rectangle and text fields.
     *
     * @return The screen container.
     *******************************************************************************************************************/
    public StackPane getScreenValue() 
    {
        return screenContainer;
    }
    
    /**********************************************************************************
     * Accessor method that returns the equation text field.
     *
     * @return The equation text field.
     **********************************************************************************/
    public TextField getEquationField()
    {
        return equation;
    }

    /**********************************************************************************
     * Accessor method that returns the result text field.
     *
     * @return The result text field.
     **********************************************************************************/
    public TextField getResultField() 
    {
        return result;
    }
}