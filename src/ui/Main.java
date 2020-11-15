/**
 * Universidad Icesi (Cali - Colombia)
 * Algoritmos y programacion I
 * Seguimiento 14
 * @Author: Daniela Olarte Borja A00368359
 * @Date: 14/11/2020
 */
package ui;
import java.util.Scanner;
import model.MathApp;
public class Main {
    private MathApp thisApp;
    private Scanner lector;
    public Main(){
        lector = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.thisApp = new MathApp();
        int option = 0;
        do{
            main.showMenu();
            option = main.lector.nextInt();
            main.executeOperation(option);
        } while(option != 0);
    }
    /** showMenu
	* Method to show main menu. <br>
	*/
    public void showMenu(){
        System.out.print("Choose an option to proceed:    \n" +
                        "(1) create set                   \n" +
                        "(2) remove set                   \n" +
                        "(3) add element to set           \n" +
                        "(4) remove element from set      \n" +
                        "(5) union                        \n" +
                        "(6) difference                   \n" +
                        "(7) intersection                 \n" +
                        "(8) symmetric difference         \n" +
                        "(9) show set information         \n" +
                        "(10) EXIT                        \n");
    }
    /** executeOperation
    * Method to execute menu´s option selected by user. <br>
    * @param option - Student's option - option != 
	*/
    public void executeOperation(int option){
        lector.nextLine();
        switch(option){
            case 1: addSet();
            break;
            case 2: removeSet();
            break;
            case 3: addElementToSet();
            break;
            case 4: removeElementFromSet();
            break;
            case 5: union();
            break;
            case 6: difference();
            break;
            case 7: intersection();
            break;
            case 8: symmetricDifference();
            break;
            case 9: showInfoSets();
            break;
            case 10: System.out.println("Have a great day!");
			break;
			default: System.out.println("Error. Select a valid option");
        }
    }
    private void addSet() {
        String name="";
        System.out.println("Type in name");
        name=lector.nextLine().toUpperCase();
        thisApp.addSet(name);
    }
    private void removeSet() {
        String name="";
        System.out.println("Type in name");
        name=lector.nextLine().toUpperCase();
        thisApp.removeSet(name);
    }
    private void addElementToSet() {
        String name="";
        int element=0;
        System.out.println("Type in set's name");
        name=lector.nextLine().toUpperCase();
        System.out.println("Type in element");
        element=lector.nextInt();
        thisApp.addElementToSet(name, element);
    }
    private void removeElementFromSet() {
        String name="";
        int element=0;
        System.out.println("Type in set's name");
        name=lector.nextLine().toUpperCase();
        System.out.println("Type in element");
        element=lector.nextInt();
        thisApp.removeElementFromSet(name, element);
    }
    private void union() {
        String name1="";
        String name2="";
        String newName="";
        System.out.println("Type in set's name 1");
        name1=lector.nextLine().toUpperCase();
        System.out.println("Type in set's name 2");
        name2=lector.nextLine().toUpperCase();
        System.out.println("Type in new set's name");
        newName=lector.nextLine().toUpperCase();
        thisApp.union(name1, name2, newName);
    }
    private void difference() {
        String name1="";
        String name2="";
        String newName="";
        System.out.println("Type in set's name 1");
        name1=lector.nextLine().toUpperCase();
        System.out.println("Type in set's name 2");
        name2=lector.nextLine().toUpperCase();
        System.out.println("Type in new set's name");
        newName=lector.nextLine().toUpperCase();
        thisApp.difference(name1, name2, newName);
    }
    private void intersection() {
        String name1="";
        String name2="";
        String newName="";
        System.out.println("Type in set's name  1");
        name1=lector.nextLine().toUpperCase();
        System.out.println("Type in set's name 2");
        name2=lector.nextLine().toUpperCase();
        System.out.println("Type in new set's name");
        newName=lector.nextLine().toUpperCase();
        thisApp.intersection(name1, name2, newName);
    }
    private void symmetricDifference() {
        String name1="";
        String name2="";
        String newName="";
        System.out.println("Type in set's name 1");
        name1=lector.nextLine().toUpperCase();
        System.out.println("Type in set's name 2");
        name2=lector.nextLine().toUpperCase();
        System.out.println("Type in new set's name");
        newName=lector.nextLine().toUpperCase();
        thisApp.symmetricDifference(name1, name2, newName);
    }
    private void showInfoSets() {
        System.out.println(thisApp.showInfoSets());
    }
}