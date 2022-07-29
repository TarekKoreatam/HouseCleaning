/*  Names: Youssef Koreatam and Tarek Koreatam
 *  Project Option 1: Business Program
 *  Home Cleaning company
 */
import java.util.Scanner;
class HomeCleaning {
  int year, month, day, hour, minute, choice = 9;
  int full = 1, windows = 2, exiT = 3, admin = 0;
  String name;
  boolean moreThanOneTime = false;

public void itsMoreThanOneTime(){
  moreThanOneTime = true;
}
}

class Application{
  public static void main(String args[]){

    HomeCleaning hc = new HomeCleaning(); // to call the HomeCleaning class
    Scanner input = new Scanner(System.in); // to call the input

    // holds
    String[][] appointments;

    System.out.println("Welcome to the best Home Cleaning service please set an appointment:");
    do{
        System.out.println("Please choose an option below:");
        System.out.println("\t1) Make a full house Cleaning appointment.");
        System.out.println("\t2) Make a windows Cleaning appointment.");
        System.out.println("\t3) Exit appplication.");

        if(hc.choice != hc.admin || hc.choice != hc.full || hc.choice != hc.windows || hc.choice != hc.exiT && hc.moreThanOneTime == true){
          System.out.println("Please enter a valid choice.");
        }
        hc.choice = input.nextInt();
        hc.itsMoreThanOneTime();
        System.out.println(hc.moreThanOneTime);
    }while(hc.choice != hc.exiT);
    System.out.println("Thank you for choosing the best Home Cleaning service! Good Bye!");
  }
}
