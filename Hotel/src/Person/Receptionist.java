/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import Hotel.Read;
import Bill.Bill;
import Room.Room;
import static Person.Team.bills;
import static Person.Team.rooms;
import static Person.Team.assignedRooms;

/**
 *
 * @author Usuario
 */
public class Receptionist extends Person{
    
    Read re = new Read();
    private int idReceptionist;

    public Receptionist() {
    }
    
    public Receptionist(String name, int age) {
        super(name, age);
        idReceptionist = ++count;
    }

    public int getIdReceptionist() {
        return idReceptionist;
    }

    public void setIdReceptionist(int idReceptionist) {
        this.idReceptionist = idReceptionist;
    }

    @Override
    public String toString() {
        return "Receptionist{" + "name=" + getName() + ", age=" + getAge() + ", idReceptionist=" + idReceptionist + '}';
    }
    
    public void register() {
        System.out.println("Bienvenido/a recepcionista, por favor ingrese sus datos: ");
        String name1 = re.readString("Ingrese su nombre");
        int age1 = re.validateInt("Ingrese su edad: ");
        Receptionist rep1 = new Receptionist(name1, age1);
        System.out.println(rep1.toString());
    }
    
    public void readOptions() {
        int option;
        do {
            System.out.println("\nPor favor seleccione la opcion que desee hacer hoy");
            System.out.println("[1] Mostrar listado de habitaciones ocupadas y vacias");
            System.out.println("[2] Mostrar la cantidad de dinero recaudado en este dia");
            System.out.println("[3] Mostrar las opciones [1] y [2]");
            System.out.println("[4] Salir\n");
            option = re.validateInt("Ingrese opcion (1-4): ");
            switch (option) {
                case 1:
                    checkRooms();
                    break;
                case 2:
                    checkMoney();
                    break;
                
                case 3:
                    checkRooms();
                    checkMoney();
            }
        } while (option != 4);
    }
    
    public void checkRooms() {
        if (Team.teamCount > 0) {
            System.out.println("\nEstas son las habitaciones disponibles");
            for (Room room : rooms) {
                System.out.println(room.toString());
            }
            System.out.println("\nEstas son las habitaciones ocupadas");
            for (Room room : assignedRooms) {
                System.out.println(room.toString());
            }
        } else {
            System.out.println("\nEstas son las habitaciones disponibles");
            rooms.clear();
            Room.setCount(0);
            for (int i = 0 ; i < 20 ; i++) {
                Room room = new Room();
                rooms.add(room);
            }
            for (Room room : rooms) {
                System.out.println(room.toString());
            }
            System.out.println("\nNo hay habitaciones ocupadas hasta el momento");
        }
    }
    
    public void checkMoney() {
       double totalBills = 0;
       if (Team.teamCount > 0) {
           System.out.println("\nEstas son las facturas generadas el dia de hoy");
           for (Bill bill : bills) {
               System.out.println(bill.toString());
               totalBills += bill.getTotal();
           }
           System.out.println("\nEl total general de las facturas de los equipos es " + totalBills);
       } else {
           System.out.println("\nNo se ha registrado ninguna factura en el hotel aun");
       }
    }
}
