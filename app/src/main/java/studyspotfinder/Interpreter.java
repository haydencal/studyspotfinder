package studyspotfinder;

import java.util.*;

public class Interpreter
{
    public String[] foodOptions = new String []{"GrabnGo", "ksl Cafe"};
    // Buildings
    Building ksl = new Building(40, foodOptions, 3);
    ArrayList<Building> buildingList = new ArrayList<Building>();
    //buildingList.add(ksl);        // this keeps throwing an error and I DONT KNOW WHY


    String userInput;
    public Interpreter(String in){
        userInput = in;
    }

    public void selectBuilding(String name) {

    }

    
}
