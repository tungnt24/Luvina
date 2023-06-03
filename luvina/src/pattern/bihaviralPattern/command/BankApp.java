/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bihaviralPattern.command; 
public class BankApp { 
    private Command openAccount;
    private Command closeAccount;
 
    public BankApp(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }
     
    public void clickOpenAccount() {
        System.out.println("User click open an account");
        openAccount.execute();// open cua account
    }
     
    public void clickCloseAccount() {
        System.out.println("User click close an account");
        closeAccount.execute();// close cua account
    }
}
