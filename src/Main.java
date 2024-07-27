import Model.Item;
import Model.Section;

import java.time.LocalDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Section section = new Section();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        showOptions();
        int option = scanner.nextInt();

        while (option != 5) {
            assert option > 0 && option < 5;
            switch (option) {
                case 1:
                    addItem(scan1);
                    break;
                case 2:
                    listItems();
                    break;
                case 3:
                    deleteItem(scan1);
                    break;
                case 4:
                    doneItem(scan1);
                    break;
            }

            showOptions();
            option = scanner.nextInt();
        }
    }

    private static void doneItem(Scanner scan1) {
        System.out.println("enter item's ID to make it done ");
        long id = scan1.nextLong();
        boolean doneflag = false;
        for (Item item : section.getItems()) {
            if (item.getId() == id) {
                item.setDone(true);
                item.setDoneDate(LocalDateTime.now());
                doneflag = true;
                System.out.println("item " + item.getId() + " has made done.");
                break;
            }
        }
        if (!doneflag) {
            System.out.println("Item not found!");
        }
    }

    private static void deleteItem(Scanner scan1) {
        System.out.println("enter item's ID for deletion");
        long id = scan1.nextLong();
        boolean deleteflag = false;
        for (Item item : section.getItems()) {
            if (item.getId() == id) {
                section.getItems().remove(item);
                deleteflag = true;
                System.out.println("item " + item.getId() + " has been deleted.");
                break;
            }
        }
        if (!deleteflag) {
            System.out.println("Item not found!");
        }
    }

    private static void listItems() {
        for (Item item : section.getItems()) {
            System.out.println(item);
        }
    }

    private static void addItem(Scanner scan1) {

        System.out.println("enter title : ");
        String title = scan1.nextLine();

        System.out.println("enter description : ");
        String description = scan1.nextLine();

        System.out.println("enter priority : ");
        byte priority = scan1.nextByte();

        long id = section.getItems().size() > 0 ? section.getItems().get(section.getItems().size() - 1).getId() + 1 : 1;
        Item item = new Item(id, title, description, LocalDateTime.now(), false, null, priority);
        section.getItems().add(item);
        System.out.println("Item added.");
    }

    public static void showOptions() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1.add todo item\n2.list todos\n3.delete todo item\n4.done todo item\n5.Quit");
        System.out.println("---------------------------------------------------------------------------");
    }
}