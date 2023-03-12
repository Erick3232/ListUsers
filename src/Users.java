public class Users{
    private static int counter = 0;
    private String name;
    private String email;
    private int phone;
    private String password;

    public Users(String name, String email, String password, int phone){
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        counter++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
}