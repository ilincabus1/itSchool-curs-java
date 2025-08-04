package org.example.session19;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.*;
import java.util.stream.Collectors;

public class CoffeeShopApp {
    public static void main(String[] args) {
        GreetingService greetingService = (name) -> System.out.println("Hello customer "+name+ ", welcome to our coffee shop");
        greetingService.greet("Marcel");

        Supplier<String> idGenerator = () -> "UUID-"+ UUID.randomUUID().toString().substring(0,8);

        Function<String, Order> createOrder = (drink) -> new Order (idGenerator.get(), drink);
        List<Order> orders = Arrays.asList(
                createOrder.apply("Almond milk coffee"),
                createOrder.apply("Cappuccino"),
                createOrder.apply("Espresso"),
                createOrder.apply("Soy milk coffee")
        );
        System.out.println("Orders placed:");
        Consumer<Order> printOrder = (order) -> System.out.println(order);
        orders.forEach(printOrder);

        Predicate<Order> isPlantBased = order -> order.getDrink().toLowerCase().contains("soy")|| order.getDrink().toLowerCase().contains("almond");
        List<Order> veganOrders = orders.stream()
                .filter(isPlantBased)
                .collect(Collectors.toList());
        System.out.println("Plant-based orders:");
        veganOrders.forEach(printOrder);

        Map<String, Double> priceList = Map.of(
            "Almond milk coffee", 10.0,
                    "Cappuccino", 8.0,
                    "Espresso", 6.0,
                    "Soy milk coffee", 9.0
        );
        BinaryOperator<Double> totalCalc = Double::sum;
        double totalPrice = orders.stream()
                .map(order-> priceList.getOrDefault(order.getDrink(), 0.0))
                .reduce(0.0,totalCalc);
        System.out.println("Total price of all orders: " + totalPrice);
        }
    }
@FunctionalInterface
interface GreetingService {
    void greet(String name);
}
class Order {
    private String id;
    private String drink;

    public Order(String id, String drink) {
        this.id = id;
        this.drink = drink;
    }

    public Order() {
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
