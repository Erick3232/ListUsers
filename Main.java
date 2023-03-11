import java.util.*;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Conta> userAccount;
    public static void main(String[] args){
        userAccount = new ArrayList<Conta>();
        operation();
    }

        public static void operation(){
        System.out.println("----------------------");
        System.out.println("Welcome, for my application!");
        System.out.println("Select one of this options");
        System.out.println("----------------------");
        System.out.println("1.Create Account");
        System.out.println("2.Lists of Users");
        System.out.println("3.Exit");

        int choose = scanner.nextInt();

        switch(choose){
            case 1: createAccount();
                break;
            case 2: listUsers();
                break;
            case 3: System.out.println("Thanks for using!");
                break;
            default:System.out.println("Please, insert a number valid");
            operation();     
            break;
            }
        }
        
        public static void createAccount(){
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Phone: ");
            int phone = scanner.nextInt();

            System.out.print("Password: ");
            String password = scanner.next();

            Users user = new Users(name, email, password, phone);
            Conta account = new Conta(user);

            userAccount.add(account);
            System.out.println("Created with Sucess!");

            operation();
        }
        public static void listUsers(){
            if(userAccount.size() > 0){
                for(Conta account : userAccount){
                    System.out.println(account);
                }
            } else {
                System.out.println("Account not registered");
            }
            operation();
        }
    }