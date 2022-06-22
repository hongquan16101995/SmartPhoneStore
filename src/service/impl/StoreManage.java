import java.util.ArrayList;
import java.util.Scanner;

public class StoreManage {
    private final BrandManage brandManage = new BrandManage();
    private final SmartPhoneManage smartPhoneManage = new SmartPhoneManage();
    private final Scanner scanner = new Scanner(System.in);

    //phần của SmartPhone
    public SmartPhone addSmartphone() {
        SmartPhone smartPhone = createSmartphone();
        smartPhoneManage.add(smartPhone);
        return smartPhone;
    }

    private SmartPhone createSmartphone() {
        System.out.println("Enter name smartphone:");
        String name = scanner.nextLine();
        System.out.println("Enter price smartphone:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color smartphone:");
        String color = scanner.nextLine();
        System.out.println("Enter amount smartphone:");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter description smartphone:");
        String description = scanner.nextLine();

        showListBrand();
        Brand brand = null;
        do {
            System.out.println("Enter your choice Id Brand: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                System.out.println("Mời bạn tạo mới Brand: ");
                addBrand();
                showListBrand();
                continue;
            }
            if (brandManage.getById(choice) == null) {
                System.out.println("Id không tồn tại!");
            }
            brand = brandManage.getById(choice);
        } while (brand == null);
        return new SmartPhone(name, price, color, amount, description, brand);
    }

    public void updateSmartphoneById() {
        smartPhoneManage.displayAll();
        System.out.println("Enter id you want update: ");
        int id = Integer.parseInt(scanner.nextLine());
        SmartPhone smartPhone = smartPhoneManage.getById(id);
        System.out.println(smartPhone);
        System.out.println("Enter new name smartphone:");
        String name = scanner.nextLine();
        smartPhone.setName(name);
        System.out.println("Enter new price smartphone:");
        double price = Double.parseDouble(scanner.nextLine());
        smartPhone.setPrice(price);
        System.out.println("Enter new color smartphone:");
        String color = scanner.nextLine();
        smartPhone.setColor(color);
        System.out.println("Enter new amount smartphone:");
        int amount = Integer.parseInt(scanner.nextLine());
        smartPhone.setAmount(amount);
        System.out.println("Enter new description smartphone:");
        String description = scanner.nextLine();
        smartPhone.setDescription(description);
        System.out.println("Enter new brand smartphone:");
        showListBrand();
        int choice = Integer.parseInt(scanner.nextLine());
        Brand brand = brandManage.getById(choice);
        smartPhone.setBrand(brand);
        smartPhoneManage.update(smartPhone);
    }

    private void showListBrand() {
        System.out.println("Enter brand smartphone:");
        ArrayList<Brand> brands = brandManage.getBrands();
        for (Brand brand : brands) {
            System.out.println(brand.getId() +
                    ". " + brand.getName());
        }
        System.out.println("0. Create new Brand");
    }

    public void deleteSmartPhoneById() {
        smartPhoneManage.displayAll();
        System.out.println("Enter id you want delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        SmartPhone smartPhone = smartPhoneManage.deleteById(id);
        if (smartPhone != null) {
            System.out.println("Delete Successfully!");
            System.out.println(smartPhone);
        } else {
            System.out.println("Id không tồn tại!");
        }
    }

    public void displaySmartPhoneById() {
        System.out.println("Enter id you want display: ");
        int id = Integer.parseInt(scanner.nextLine());
        smartPhoneManage.displayById(id);
    }

    public void displayAllSmartPhone() {
        smartPhoneManage.displayAll();
    }

    //phần của Brand
    public Brand addBrand() {
        Brand brand = createBrand();
        return brandManage.add(brand);
    }

    private Brand createBrand() {
        System.out.println("Enter name brand:");
        String name = scanner.nextLine();
        return new Brand(name);
    }

    public void updateBrand() {
        brandManage.displayAll();
        System.out.println("Enter id you want update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Brand brand = brandManage.getById(id);
        System.out.println(brand);
        System.out.println("Enter new name brand: ");
        String name = scanner.nextLine();
        brand.setName(name);
        brandManage.update(brand);
    }

    public void deleteBrandById() {
        brandManage.displayAll();
        System.out.println("Enter id you want delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        Brand brand = brandManage.deleteById(id);
        if (brand != null) {
            System.out.println("Delete Successfully!");
            System.out.println(brand);
        } else {
            System.out.println("Id không tồn tại!");
        }
    }

    public void displayAllBrand() {
        brandManage.displayAll();
    }
}
