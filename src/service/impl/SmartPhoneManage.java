import java.util.ArrayList;

public class SmartPhoneManage implements ICRUDService<SmartPhone> {
    private ArrayList<SmartPhone> smartPhones = new ArrayList<>();

    public ArrayList<SmartPhone> getSmartPhones() {
        return smartPhones;
    }

    public void setSmartPhones(ArrayList<SmartPhone> smartPhones) {
        this.smartPhones = smartPhones;
    }

    @Override
    public SmartPhone getById(int id) {
        for (SmartPhone smartPhone : smartPhones) {
            if (smartPhone.getId() == id) {
                return smartPhone;
            }
        }
        return null;
    }

    @Override
    public SmartPhone add(SmartPhone smartPhone) {
        smartPhones.add(smartPhone);
        return smartPhone;
    }

    @Override
    public void update(SmartPhone smartPhone) {
        for (int i = 0; i < smartPhones.size(); i++) {
            if (smartPhones.get(i).getId() == smartPhone.getId()) {
                smartPhones.set(i, smartPhone);
            }
        }
    }

    @Override
    public SmartPhone deleteById(int id) {
        SmartPhone smartPhone = null;
        for (SmartPhone sm : smartPhones) {
            if (sm.getId() == id) {
                smartPhone = sm;
            }
        }
        if (smartPhone != null) {
            smartPhones.remove(smartPhone);
            return smartPhone;
        }
        return null;
    }

    @Override
    public void displayById(int id) {
        for (SmartPhone smartPhone : smartPhones) {
            if (smartPhone.getId() == id) {
                System.out.println(smartPhone);
            }
        }
    }

    @Override
    public void displayAll() {
        for (SmartPhone smartPhone : smartPhones) {
            System.out.println(smartPhone);

        }
    }
}
