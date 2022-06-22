import java.util.ArrayList;

public class BrandManage implements ICRUDService<Brand> {
    private ArrayList<Brand> brands = new ArrayList<>();

    public BrandManage() {
        //tạo sẵn data cho Brand
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Oppo"));
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    @Override
    public Brand getById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }

    @Override
    public Brand add(Brand brand) {
        brands.add(brand);
        return brand;
    }

    @Override
    public void update(Brand brand) {
        for (int i = 0; i < brands.size(); i++) {
            if (brands.get(i).getId() == brand.getId()) {
                brands.set(i, brand);
            }
        }
    }

    @Override
    public Brand deleteById(int id) {
        Brand brand = null;
        for (Brand br : brands) {
            if (br.getId() == id) {
                brand = br;
            }
        }
        if (brand != null) {
            brands.remove(brand);
            return brand;
        }
        return null;
    }

    @Override
    public void displayById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                System.out.println(brand);
                ;
            }
        }
    }

    @Override
    public void displayAll() {
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }
}
