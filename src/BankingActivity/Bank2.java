package BankingActivity;

public class Bank2 {
    
    int accountNo = 12345;
    String name;
    float initialBalance = 0;
    int pin = 54321;
    
    public boolean verifyAccount(int acc, int pn){
        
          if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    }
    
}