/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

/**
 *
 * @author Usuario
 */
public class Room {
    private static int count = 0;
    private int roomId;
    private double roomPrice = (500000);

    public Room() {
        roomId = ++count;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Room.count = count;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomPrice=" + roomPrice + '}';
    }
    
}
