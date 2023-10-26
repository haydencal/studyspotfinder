public class StudyRoom
{
    boolean isAvail;
    Building building;
    int floor;
    String[] reviews;
    public StudyRoom(boolean iA, Building b, int f, String[] r){
        isAvail = iA;
        building = b;
        floor = f;
        reviews = r;
    }
}
