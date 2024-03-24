/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import Person.Receptionist;
import Person.Team;

/**
 *
 * @author Usuario
 */
public class Hotel {
    
    public void readHotelOptions() {
        Read re = new Read();
        int option;
        do {
            System.out.println("\nBienvenido al Hotel Oasis, por favor diganos su rol");
            System.out.println("[1] Soy recepcionista del hotel");
            System.out.println("[2] Soy entrenador de un equipo de futbol y deseo hospedar a mis jugadores");
            System.out.println("[3] Salir\n");
            option = re.validateInt("Ingrese opcion (1-3): ");
            switch (option) {
                case 1:
                    registerRecep();
                    break;
                case 2:
                    registerTeam();
                    break;
                }
            } while (option != 3);
        }
    
    public void registerRecep() {
        Receptionist rep = new Receptionist();
        rep.register();
        rep.readOptions();
    }
    
    public void registerTeam() {
        Team team = new Team();
        team.assignPlayer();
    }
    
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.readHotelOptions();
    }
}
