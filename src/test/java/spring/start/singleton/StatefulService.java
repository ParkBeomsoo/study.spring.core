package spring.start.singleton;

public class StatefulService {

//    private int price;

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
//        this.price = price;
        return price;
    }

    public void getPrice() {
//        return price;
    }
}
