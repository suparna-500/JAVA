import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NameList {
    private ArrayList<String> names;

    public NameList() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        if (names.contains(name)) {
            names.remove(name);
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

 
    public void searchName(String name) {
        if (names.contains(name)) {
            System.out.println(name + " is found in the list.");
        } else {
            System.out.println(name + " is not in the list.");
        }
    }


    public void sortNames() {
        Collections.sort(names);
        System.out.println("Names sorted.");
    }

  
    public void displayNames() {
        if (names.isEmpty()) {
            System.out.println("No names to display.");
        } else {
            System.out.println("Names in the list:");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

public class NameMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameList nameList = new NameList();
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Search Name");
            System.out.println("4. Sort Names");
            System.out.println("5. Display Names");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    String addName = sc.nextLine();
                    nameList.addName(addName);
                    System.out.println(addName + " has been added.");
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();
                    nameList.removeName(removeName);
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    nameList.searchName(searchName);
                    break;

                case 4:
                    nameList.sortNames();
                    break;

                case 5:
                    nameList.displayNames();
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

