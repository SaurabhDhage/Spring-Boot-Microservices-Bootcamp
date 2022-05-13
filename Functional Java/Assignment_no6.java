import java.util.ArrayList;
import java.util.List;

public class Assignment_no6 {
    public static void main(String[] args) {
        List<Phone> ph = new ArrayList<>();
        String[] randPhName = {"Samsung", "Apple", "Huawei", "Nokia"};
        String[] randPhProcess = {"Snapdragon", "AppleBionic", "Dimensity", "Yolo"};
        int[] randPhRam = {2, 4, 8, 16};
        int[] randPhCost = {1000, 3000, 3600, 12000};
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 4);
            String name, processor;
            int ram, cost;
            name = randPhName[num];
            processor = randPhProcess[num];
            ram = randPhRam[num];
            cost = randPhCost[num];
            Phone phone = new Phone();
            phone.setPhone(name, processor, cost, ram);
            ph.add(phone);
            // a
            System.out.println("Cheapest sanpdragon phone : ");
            ph.stream().filter(p -> p.processor.equals("Snapdragon"))
                    .reduce((phone1, phone2) -> phone1.cost > phone2.cost ? phone1 : phone2).get().getPhone();
            // b & c
            System.out.println("Best Phone according to its ram : ");
            ph.stream().reduce((phone1, phone2) -> (phone1.ram/phone1.cost)> (phone2.ram/phone2.cost) ?
                    phone1 : phone2).get().getPhone();
        }

    }

}

class Phone {
    String name, processor;
    int cost, ram;

    public void setPhone(String name, String processor, int cost, int ram) {
        this.name = name;
        this.processor = processor;
        this.cost = cost;
        this.ram = ram;
    }

    public void getPhone() {

        System.out.println("Phone name = " + name + "\t" + "Processor name = " + processor);
        System.out.println("Total ram = " + ram + "\t" + "Total cost = " + cost);

    }
}

