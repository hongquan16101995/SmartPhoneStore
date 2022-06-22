public class Brand {
    private static int ID_BRAND = 1;
    private int id;
    private String name;

    public Brand() {
    }

    public Brand(String name) {
        this.id = ID_BRAND++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void display() {

    }
}
