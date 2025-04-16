import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

/**********************************************************************************************************
 * @title The GradeSelector Class
 * The GradeSelector class manages the grade selection radio buttons for the calculator.
 *
 * @author Chukwunonso Daniel Ekweaga
 * @version (Final Version)
 * @studentID 3781089
 **********************************************************************************************************/
 
public class GradeSelector
{
    //Instance data
    private RadioButton grade4, grade5, grade6;
    private GridPane gradeGrid;

    /*******************************************************************************************
     * Default Constructor for the GradeSelector class.
     * Initializes the grade selector and creates the grade grid.
     *******************************************************************************************/
    public GradeSelector() 
    {
        initializeGradeSelector();
        createGradeGrid();
    }
    
    /****************************************************************
     * Method to initialize the radio buttons and toggle group.
     ****************************************************************/  
    private void initializeGradeSelector() 
    {
        grade4 = new RadioButton();
        grade5 = new RadioButton();
        grade6 = new RadioButton();

        ToggleGroup gradeSelect = new ToggleGroup();
        grade6.setToggleGroup(gradeSelect);
        grade5.setToggleGroup(gradeSelect);
        grade4.setToggleGroup(gradeSelect);
        grade4.setSelected(true);
    }
    
    /***************************************************************************************
     * Method to create the grid layout for the grade selection radio buttons.
     ***************************************************************************************/
    private void createGradeGrid() 
    {
        gradeGrid = new GridPane();
        gradeGrid.add(grade4, 0, 0);
        gradeGrid.add(new Label("Grade 4"), 2, 0);
        gradeGrid.add(grade5, 6, 0);
        gradeGrid.add(new Label("Grade 5"), 7, 0);
        gradeGrid.add(grade6, 10, 0);
        gradeGrid.add(new Label("Grade 6"), 12, 0);

        gradeGrid.setVgap(7);
        gradeGrid.setHgap(5);
        gradeGrid.setAlignment(Pos.CENTER);
    }
    
    /**********************************************************************************
     * Returns the grade grid containing the radio buttons.
     *
     * @return The grade grid.
     **********************************************************************************/
    public GridPane getGradeGrid() 
    {
        return gradeGrid;
    }

    /**********************************************************************************
     * Checks if Grade 4 is selected.
     *
     * @return True if Grade 4 is selected, false otherwise.
     **********************************************************************************/
    public boolean isGrade4Selected() 
    {
        return grade4.isSelected();
    }

    /**********************************************************************************
     * Checks if Grade 5 is selected.
     *
     * @return True if Grade 5 is selected, false otherwise.
     **********************************************************************************/
    public boolean isGrade5Selected() 
    {
        return grade5.isSelected();
    }

    /**********************************************************************************
     * Checks if Grade 6 is selected.
     *
     * @return True if Grade 6 is selected, false otherwise.
     **********************************************************************************/
    public boolean isGrade6Selected() 
    {
        return grade6.isSelected();
    }
}