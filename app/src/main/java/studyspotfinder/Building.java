package studyspotfinder;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private int numStudySpaces;  // Number of study spaces in the building
    private StudyRoom[] studySpaces;  // An array to hold information about individual study spaces
    private String[] foodOptions;  // Available food options
    private int floorNum;  // Floor number of building
    

    public Building(String name, int numSR, String[] fO, int fN) {
        name = this.name;
        numStudySpaces = numSR;
        foodOptions = fO;
        floorNum = fN;
        studySpaces = new StudyRoom[numStudySpaces];
    }

    // Method to add a study space to the building
    public void addStudySpace(StudyRoom space, int index) {
        if (index >= 0 && index < numStudySpaces) {
            studySpaces[index] = space;
        }
    }

    // Method to get information about a specific study space
    public StudyRoom getStudySpace(int index) {
        if (index >= 0 && index < numStudySpaces) {
            return studySpaces[index];
        }
        return null;  // Return null if index is out of bounds
    }

    // Method to check the availability of a study space
    public boolean isStudySpaceAvailable(int index, String date, String time) {
        if (index >= 0 && index < numStudySpaces) {
            return studySpaces[index].isAvailable(date, time);
        }
        return false;  // Return false if index is out of bounds
    }

    // Method to reserve a study space
    public boolean reserveStudySpace(int index, String date, String time, String studentId) {
        if (index >= 0 && index < numStudySpaces) {
            return studySpaces[index].bookRoom(date, time, studentId);
        }
        return false;  // Return false if index is out of bounds
    }

    // Method to check if a specific student has a reservation
    public boolean hasReservation(int index, String date, String time, String studentId) {
        if (index >= 0 && index < numStudySpaces) {
            return studySpaces[index].hasReservation(date, time, studentId);
        }
        return false;  // Return false if index is out of bounds
    }

    // Method to cancel a reservation
    public boolean cancelReservation(int index, String date, String time, String studentId) {
        if (index >= 0 && index < numStudySpaces) {
            return studySpaces[index].cancelReservation(date, time, studentId);
        }
        return false;  // Return false if index is out of bounds
    }

    // Method to retrieve a list of available study spaces
    public List<StudyRoom> getAvailableStudySpaces(String date, String time) {
        List<StudyRoom> availableSpaces = new ArrayList<>();
        for (StudyRoom space : studySpaces) {
            if (space.isAvailable(date, time)) {
                availableSpaces.add(space);
            }
        }
        return availableSpaces;
    }

    public String getBuilding() {
        return name;
    }
}
