
package dungeongame;

public class Dungeon {
    private Room currentRoom;
    
    private Room room1 = new Room("Detta är rum 1");
    private Room room2 = new Room("Detta är rum 2");
    private Room room3 = new Room("Detta är rum 3");
            
    public void playGame() {
        currentRoom = room1;
        
        currentRoom.doNarrative();
    }
}
