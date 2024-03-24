/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bill;

/**
 *
 * @author Usuario
 */
public class Bill {
    private int idBill;
    private static int count2 = 0;
    private double extraService;
    private double totalRooms;
    private double total;

    public Bill() {
        idBill = ++count2;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public double getExtraService() {
        return extraService;
    }

    public void setExtraService(double extraService) {
        this.extraService = extraService;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(double totalRooms) {
        this.totalRooms = totalRooms;
    }

    public static int getCount2() {
        return count2;
    }

    public static void setCount2(int count2) {
        Bill.count2 = count2;
    }

    @Override
    public String toString() {
        return "Bill{" + "idBill=" + idBill + ", extraService=" + extraService + ", totalRooms=" + totalRooms + ", total=" + total + '}';
    }
    
}
