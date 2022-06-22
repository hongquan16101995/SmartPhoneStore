import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        StoreManage storeManage = new StoreManage();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Smartphone");
            System.out.println("2. Brand");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuSmartphone(scanner, storeManage);
                    break;
                case 2:
                    menuBrand(scanner, storeManage);
                    break;
            }
        } while (choice != 0);
    }

    public static void menuSmartphone(Scanner scanner, StoreManage storeManage) {
        int choice;
        do {
            System.out.println("MenuSmartphone");
            System.out.println("1. Create a Smartphone");
            System.out.println("2. Update a Smartphone by Id");
            System.out.println("3. Delete a Smartphone by Id");
            System.out.println("4. Display Smartphone by Id");
            System.out.println("5. Display all Smartphone");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(storeManage.addSmartphone());
                    break;
                case 2:
                    storeManage.updateSmartphoneById();
                    break;
                case 3:
                    storeManage.deleteSmartPhoneById();
                    break;
                case 4:
                    storeManage.displaySmartPhoneById();
                    break;
                case 5:
                    storeManage.displayAllSmartPhone();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuBrand(Scanner scanner, StoreManage storeManage) {
        int choice;
        do {
            System.out.println("MenuBrand");
            System.out.println("1. Create a Brand");
            System.out.println("2. Update a Brand by Id");
            System.out.println("3. Delete a Brand by Id");
            System.out.println("4. Display all Brand");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(storeManage.addBrand());
                    break;
                case 2:
                    storeManage.updateBrand();
                    break;
                case 3:
                    storeManage.deleteBrandById();
                    break;
                case 4:
                    storeManage.displayAllBrand();
                    break;
            }
        } while (choice != 0);
    }
}
