/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author GLORIA
 */
 
    public class TelecomBilling {
    public static void main(String[] args) {
       // UGX10,000 
        double initialBalance = 10000;
        // UGX200 per second
        double callRate = 200;
        // 10% tax on airtime load
        double taxRate = 0.10; 

        // Calculate the balance after tax
        double balanceAfterTax = initialBalance - (initialBalance * taxRate);

        // Calculate the cost of the call
        // 5 minutes in seconds
        int callDuration = 5 * 60; 
        double callCost = callDuration * callRate;

        // Calculate the remaining balance
        double remainingBalance = balanceAfterTax - callCost;

        System.out.println("Remaining balance: UGX" + remainingBalance);
    }
}


