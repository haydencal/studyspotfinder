package studyspotfinder;

//import java.util.*;

public class Interpreter
{
    public String[] foodOptions = new String []{"GrabnGo", "ksl Cafe"};
    
    // Buildings    
    Building[] buildings = {
        new Building("KSL", 40, foodOptions, 3),
        new Building("Tink", 5, foodOptions, 2),
        new Building("Thwing Center", 10, foodOptions, 4),
        new Building("Hitchcock Hall", 4, foodOptions, 3),
        new Building("Guilford Hall", 3, foodOptions, 2),
        new Building("Haydn Hall", 2, foodOptions, 2),
        new Building("Clark Hall", 12, foodOptions, 4), 
        new Building("Mather Memorial", 15, foodOptions, 3)
    };

    String userInput;
    public Interpreter(String in){ // should format in as B_buildin or C_click or whatever
        userInput = in;

        // if first char of in is B, then select building
    }

    public void selectBuilding(String name) {
        String newName = name.substring(1);
        for(int i = 0; i < buildings.length; i++) {
            if (buildings[i].getBuilding() == newName) {
                buildings[i].getAvailableStudySpaces("11/14", "11:40"); // temp vars
            }
        }
    }

    
}
