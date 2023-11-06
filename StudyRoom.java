public class StudyRoom {
    boolean isAvail;
    Building building;
    int floor;
    String[] reviews;

    public StudyRoom(boolean iA, Building b, int f, String[] r) {
        isAvail = iA;
        building = b;
        floor = f;
        reviews = r;
    }

    public boolean isAvailable() {
        return isAvail;
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

    public void addReview(String newReview) {
        // include logic for managing the array size and handling duplicates.
    }

    public void bookRoom() {
        if (isAvail) {
            // Implement logic to reserve the room, update availability, and handle booking details.
        } else {
            // Handle the case where the room is already booked.
        }
    }
}
