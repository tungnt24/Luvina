/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.structuralPattern.bridge;

/**
 *
 * @author Hung
 */
public class CheckingAccount implements Account { 
    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
}
