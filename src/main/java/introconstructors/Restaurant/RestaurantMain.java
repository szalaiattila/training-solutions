package introconstructors.Restaurant;
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Gödör", 10);
        System.out.println(restaurant.getName());
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());
    }
}