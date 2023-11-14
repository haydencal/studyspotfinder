package studyspotfinder;

import java.util.*;

public class StudyRoom {
    boolean isAvail;
    Building building;
    int floor;
    String[] reviews;
    int maxAvail;
    int currAvail;
    ArrayList<String> reservedList = new ArrayList<>(); // list of studentD's that have reserved a spot

    public StudyRoom(boolean iA, Building b, int f, String[] r, int mA) {
        isAvail = iA;
        building = b;
        floor = f;
        reviews = r;
        maxAvail = mA;
        currAvail = mA;
    }

    // Method to get the building information
    public Building getBuilding() {
        return building;
    }

    // Method to get the floor the room is on
    public int getFloor() {
        return floor;
    }

    // Method to return the list of all reviews for the studyroom
    public String[] getReviews() {
        return reviews;
    }

    // Checks if the room has availability
    public boolean isAvailable(String date, String time) {
        if (currAvail > 0) {
            isAvail = true;
        } else {
            isAvail = false;
        }
        return isAvail;
    }

    // Checks if a student has made a reservation based on their student id
    public boolean hasReservation(String date, String time, String StudentID) {
        if (reservedList.contains(StudentID)) {
            return true;
        } else {
            return false;
        }
    }

    // cancels a students reservation based on their student id
    public boolean cancelReservation(String date, String time, String studentID) {
        boolean hasRes = false;
        if (hasReservation(date, time, studentID)) {
            for(int i = 0; i < reservedList.size(); i++) {
                if (reservedList.get(i) == studentID) {
                    reservedList.remove(i);
                    hasRes = true;
                    if (currAvail < maxAvail) {
                        currAvail += 1;
                    }
                }
            }
        } else {
            hasRes = false;
        }
        return hasRes;
    }

    // adds a review of a studyspace under a student's id
    public void addReview(String newReview, String StudentID) {
        // include logic for managing the array size and handling duplicates.
    }

    // adds a student's reservation of the room
    public boolean bookRoom(String date, String time, String studentID) {
        if (isAvail) {
            // Implement logic to reserve the room, update availability, and handle booking details.
            reservedList.add(studentID);
            currAvail -= 1;
            return true;
        } else {
            // Handle the case where the room is already booked.
            return false;
        }
    }
}
