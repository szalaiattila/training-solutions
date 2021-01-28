package classstructureconstructors;

public interface StoreMain {public static void main(String[] args) {
    Store egyesStore = new Store("egyes");
    egyesStore.store(5);
    System.out.println(egyesStore.getProduct() + ": " + egyesStore.getStock());

    Store kettesStore = new Store("kettes");
    kettesStore.store(10);
    System.out.println(kettesStore.getProduct() + ": " + kettesStore.getStock());

    egyesStore.dispatch(2);
    kettesStore.dispatch(4);
    egyesStore.store(6);
    kettesStore.store(8);

    System.out.println(egyesStore.getProduct() + ": " + egyesStore.getStock());
    System.out.println(kettesStore.getProduct() + ": " + kettesStore.getStock());
}
}




