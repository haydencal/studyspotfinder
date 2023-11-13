import java.util.*;

public class StudyRoom {
    boolean isAvail;
    Building building;
    int floor;
    String[] reviews;
    int maxAvail;
    int currAvail;
    ArrayList<String> reservedList = new ArrayList<>();

    public StudyRoom(boolean iA, Building b, int f, String[] r, int mA, int cA) {
        isAvail = iA;
        building = b;
        floor = f;
        reviews = r;
        maxAvail = mA;
        currAvail = cA;
    }

    // Method to get the building information
    public Building getBuilding() {
        return building;
    }

    public int getFloor() {
        return floor;
    }

    public String[] getReviews() {
        return reviews;
    }

    public boolean isAvailable(String date, String time) {
        if (currAvail <= maxAvail) {
            isAvail = false;
        } else {
            isAvail = true;
        }
        return isAvail;
    }

    public boolean hasReservation(String date, String time, String StudentID) {
        if (reservedList.contains(StudentID)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelReservation(String date, String time, String studentID) {
        boolean hasRes = false;
        if (hasReservation(date, time, studentID)) {
            for(int i = 0; i < reservedList.size(); i++) {
                if (reservedList.get(i) == studentID) {
                    reservedList.remove(i);
                    currAvail -= 1;
                    hasRes = true;
                }
            }
        } else {
            hasRes = false;
        }
        return hasRes;
    }

    public void addReview(String newReview) {
        // include logic for managing the array size and handling duplicates.
    }

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
