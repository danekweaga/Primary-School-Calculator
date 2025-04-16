import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;

/**********************************************************************************************************
 * @title The CalculatorApp Class
 * The CalculatorApp class is responsible for creating and managing the user interface of the calculator.
 * @author Chukwunonso Daniel Ekweaga
 * @version (Final Version)
 * @studentID 3781089
 **********************************************************************************************************/

public class CalculatorApp extends Application
{
    // Instance variables
    private VBox calcContainer;
    private Screen display;
    private GradeSelector gradeSelector;
    private ButtonGrid calcButtons;
    
    /*******************************************************************************************
     * Method that creates the user interface for the calculator.
     *******************************************************************************************/
    public void start(Stage myStage) 
    {
        // Disable window resizing
        myStage.setResizable(false);
            
        // Main Layout
        calcContainer = new VBox();
        calcContainer.setSpacing(10);
        calcContainer.setPadding(new Insets(10));
        
        // Logo
        VBox logoContainer= new VBox();
        Image image = new Image("calculator_logo-removebg-preview (1).png");
        ImageView logoView = new ImageView(image);
        logoView.setPreserveRatio(true);
        logoView.setFitWidth(190);
        logoContainer.setAlignment(Pos.CENTER);
        logoContainer.getChildren().addAll(logoView);        
        
        // Initialize components
        Screen display = new Screen();
        gradeSelector = new GradeSelector();
        calcButtons = new ButtonGrid(display, gradeSelector);

        calcContainer.getChildren().addAll(logoContainer,display.getScreenValue(), gradeSelector.getGradeGrid(), calcButtons.getButtonGrid());

        // Icon
        Image icon = new Image("icon.png");
        myStage.getIcons().add(icon);

        Scene myScene = new Scene(calcContainer, 350, 500);
        myStage.setTitle("Nonso's Calculator");
        myStage.setScene(myScene);
        myStage.show();
    }
}