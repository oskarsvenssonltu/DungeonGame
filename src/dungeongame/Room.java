
package dungeongame;

public class Room {
    private String roomDescription = "";
    
    public Room (String roomDescription) {
        this.roomDescription = roomDescription;
    }
    
    public void doNarrative() {
        System.out.printf("%s", roomDescription);
    }
    
}
