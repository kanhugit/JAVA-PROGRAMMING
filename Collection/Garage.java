//package Collection;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class Garage {
//    public static void main(String[] args) {
//        ArrayList<Bike> b = new ArrayList<>();
//        b.add(new Bike("Hero", 70000, "black", 50));
//        b.add(new Bike("Honda", 10000, "White", 46));
//        b.add(new Bike("Splender", 49000, "black", 30));
//        b.add(new Bike("Duke", 200000, "Yellow", 80));
//        b.add(new Bike("Bullet", 70000, "black", 50));
//        b.add(new Bike("F-z", 70000, "Red", 90));
//
//        // Calculate average cost
//        double sum = 0;
//        for (Bike i : b) {
//            sum += i.cost;
//        }
//        double avg = sum / b.size();
//
//        // Filter bikes based on conditions
//        String vowels = "AEIOUaeiou";
//        ArrayList<Bike> bikes = new ArrayList<>();
//        for (Bike i : b) {
//            if (i.cost < avg && i.milage > 50) {
//                if (!vowels.contains(i.brand.charAt(0) + "")) {
//                    bikes.add(i);
//                }
//            }
//        }
//
//        // User options for sorting
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose The Below Options:");
//        System.out.println("1. Bikes Ascending by Brand");
//        System.out.println("2. Bikes Descending by Brand");
//        System.out.println("3. Bikes Ascending by Cost");
//        System.out.println("4. Bikes Descending by Cost");
//        System.out.println("5. Bikes Ascending by Mileage");
//        System.out.println("6. Bikes Descending by Mileage");
//        System.out.println("7. Bikes Ascending by Mileage, Descending by Cost");
//        System.out.println("8. Bikes Descending by Mileage, Ascending by Cost");
//
//        int option = sc.nextInt();
//
//        // Sorting based on user choice
//        Comparator<Bike> com = null;
//        switch (option) {
//            case 1:
//                com = (o1, o2) -> o1.brand.compareTo(o2.brand); // Ascending by Brand
//                break;
//            case 2:
//                com = (o1, o2) -> o2.brand.compareTo(o1.brand); // Descending by Brand
//                break;
//            case 3:
//                com = (o1, o2) -> Double.compare(o1.cost, o2.cost); // Ascending by Cost
//                break;
//            case 4:
//                com = (o1, o2) -> Double.compare(o2.cost, o1.cost); // Descending by Cost
//                break;
//            case 5:
//                com = (o1, o2) -> Double.compare(o1.milage, o2.milage); // Ascending by Mileage
//                break;
//            case 6:
//                com = (o1, o2) -> Double.compare(o2.milage, o1.milage); // Descending by Mileage
//                break;
//            case 7:
//                com = (o1, o2) -> {
//                    int result = Double.compare(o1.milage, o2.milage); // Ascending by Mileage
//                    if (result == 0) {
//                        result = Double.compare(o2.cost, o1.cost); // Descending by Cost
//                    }
//                    return result;
//                };
//                break;
//            case 8:
//                com = (o1, o2) -> {
//                    int result = Double.compare(o2.milage, o1.milage); // Descending by Mileage
//                    if (result == 0) {
//                        result = Double.compare(o1.cost, o2.cost); // Ascending by Cost
//                    }
//                    return result;
//                };
//                break;
//            default:
//                System.out.println("Invalid Option!");
//                return;
//        }
//
//        // Sort and display bikes
//        Collections.sort(bikes, com);
//        System.out.println("\nFiltered and Sorted Bikes:");
//        System.out.println(bikes);
//    }
//}
