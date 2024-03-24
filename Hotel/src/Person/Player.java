/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;
import Room.Room;

/**
 *
 * @author Usuario
 */
public class Player extends Person{
    private int number;
    private String position;
    private Room room = new Room();

    public Player() {
    }

    public Player(int number, String position, String name, int age, Room room) {
        super(name, age);
        this.number = number;
        this.position = position;
        this.room = room;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public Room getRoom() {
        return room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + super.getName() + ", age=" + super.getAge() + ", number=" + number + ", position=" + position + '}';
    }
    
    public String newToString() {
        return "Player{" + "name=" + super.getName() + ", age=" + super.getAge() + ", number=" + number + ", position=" + position + ", room=" + room + '}';
    }    
}
