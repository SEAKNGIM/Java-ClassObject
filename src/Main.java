import java.util.Scanner;

public class Main {
    //    private  final  static  int FEMALETAXRATE = 30;
//    private  final  static  int MALETAXRATE = 50;
    int id;
    String fullName;
    String gender;
    String position;
    float hour;
    float rate;
    Main(){}

    Main(int id, String fullName, String gender, String position, float rate, float hour){
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.position = position;
        this.rate = rate;
        this.hour = hour;
    }

    private float findSalary(){
        return rate*hour;
    }

    public void Input(Scanner input){
        String idRegex = "[0-9]+";
        String genderPattern = "^(f|m|male|female)$";
        String rateRegex = "^[0-9]+(\\.[0-9]+)?$";
        String hourRegex = "^[0-9]+(\\.[0-9]+)?$";

        System.out.print("Enter Worker ID: ");
        String idInput = input.next();
        // Validate id
        while (!idInput.matches(idRegex)) {
            System.out.print("Enter a valid integer: ");
            idInput = input.next();
        }
        id = Integer.parseInt(idInput);
        System.out.print("Enter Worker Name: ");
        input.nextLine();
        fullName = input.nextLine();
        System.out.print("Enter Worker Gender: ");
        gender = input.nextLine();
        // Validate gender
        while (!gender.matches(genderPattern)) {
            System.out.print("Enter a valid f/m/female/male:");
            gender = input.nextLine();
        }
        System.out.print("Enter Worker Position: ");
        position = input.nextLine();
        System.out.print("Enter Worker Hours: ");
        String hourInput = input.next();
        // Validate hour
        while (!hourInput.matches(hourRegex)) {
            System.out.print("Enter a valid number:");
            hourInput = input.next();
        }
        hour = Float.parseFloat(hourInput);
        System.out.print("Enter Worker Rate: ");
        String rateInput = input.next();
        // Validate rate
        while (!rateInput.matches(rateRegex)) {
            System.out.print("Enter a valid number:");
            rateInput = input.next();
        }
        rate = Float.parseFloat(rateInput);
    }

    public void mainInfo(){
        System.out.println("+++++++++++++++++  Info  +++++++++++++++++++");
        System.out.println("Worker ID: "+ id);
        System.out.println("Worker Name: "+ fullName);
        System.out.println("Worker Gender: "+ gender);
        System.out.println("Worker Position: "+ position);
        System.out.println("Final Salay: "+ findSalary()+"$");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main main = new Main();
        main.Input(scanner);
        main.mainInfo();
        scanner.close();;
    }
}