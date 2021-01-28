package attributes.attributes.bill.Item;

public class BillMain {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("Arany Ászok", 3, 200));
        bill.addItem(new Item("Kőbányai", 3, 190));
        bill.addItem(new Item("Dreher", 4, 260));

        System.out.println(bill.calculateTotalPrice());
    }
}
