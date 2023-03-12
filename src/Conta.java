public class Conta {
    private static int countAccounts = 1;

    private int numberAccount;
    private Users users;
    
    public Conta(Users users){
        this.numberAccount = countAccounts;
        this.users = users;
        countAccounts++;
    }
    public Users getUser(){
        return users;
    }
    public void setUser(Users users){
        this.users = users; 
    }
    public int getNumberAccount(){
        return numberAccount;
    }
    public void setNumberAccount(int numberAccount){
        this.numberAccount = numberAccount; 
     }
     public String toString(){
        return "\n Number Account: " + this.getNumberAccount() +
               "\n Name: " + this.users.getName() +
               "\n Password: " + this.users.getPassword() + 
               "\n Phone: " + this.users.getPhone() +
               "\n Email: " + this.users.getEmail() +
               "\n";
    }
}
