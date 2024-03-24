/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;
import java.util.Iterator;
import Hotel.Read;
import Room.Room;
import Bill.Bill;

/**
 *
 * @author Usuario
 */
public class Team {
    static int teamCount = 0;
    ArrayList<Player> team = new ArrayList<>();
    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Room> assignedRooms = new ArrayList<>();
    static ArrayList<Bill> bills = new ArrayList<>();

    public Team() {
        ++teamCount;
    }
    
    public void assignPlayer() {
        Read re = new Read();
        int n = re.validateInt("Ingrese el numero de jugadores de su equipo: ");
        for (int i = 0; i < n ; i++) {
            Player p = new Player();
            int nu = re.validateInt("Por favor ingrese el numero de su dorsal: ");
            p.setNumber(nu);
            String po = re.readString("Ingrese su posicion");
            p.setPosition(po);
            String na = re.readString("Ingrese su nombre");
            p.setName(na);
            int age = re.validateInt("Ingrese su edad: ");
            p.setAge(age);
            team.add(p);
            System.out.println("\nBienvenido " + p.getName() + ", fuiste registrado");
        }
        print();
        assignRooms();
        assignBills();
    }
    
    public void print(){
        System.out.println("\nEstos son los integrantes del equipo: ");
        for (Player player : team) {
            System.out.println(player.toString());
        }
        System.out.println("\nEl equipo tiene " + team.size()+ " jugadores");
    }
    
    public void assignRooms() {
        Read re = new Read();
        rooms.clear();
        Room.setCount(0);
        for (int i = 0 ; i < 20 ; i++) {
            Room room = new Room();
            rooms.add(room);
        }
        System.out.println("\nAsigne las habitaciones para cada jugador");
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
        for (Player player : team) {
            boolean validRoomId = false;
            while (!validRoomId) {
                int selectedRoomId = re.validateInt("\nQue habitacion desea asignarle a " + player.getName() + " ");
                Iterator<Room> iterator = rooms.iterator();
                while (iterator.hasNext()) {
                    Room room = iterator.next();
                    if (selectedRoomId == room.getRoomId()) {
                        player.setRoom(room);
                        iterator.remove();
                        validRoomId = true;
                        break;
                    }
                }
                if (!validRoomId) {
                    System.out.println("\nId de habitacion no valido o ya ocupado");
                }
            }
            System.out.println(player.newToString());
            Room ro = player.getRoom();
            assignedRooms.add(ro);
        }
    }
    
    public void assignBills() {
        Bill bill = new Bill();
        double t = 0;
        for (Player player : team) {
            t += player.getRoom().getRoomPrice();
        }
        double ex = t*0.20;
        bill.setTotalRooms(t);
        bill.setExtraService(ex);
        double total = bill.getExtraService() + bill.getTotalRooms();
        bill.setTotal(total);
        bills.add(bill);
        System.out.println("\nLa factura del total que debe pagar su equipo es " + bill.toString());
    }
}
