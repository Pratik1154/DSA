package Demo;

/**
 * Demo
 */

enum Status {
    RUNNING(100), FAILED(200), PENDING(300), SUCCESS();

    private int price;

    private Status(){}

    private Status(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public abstract class Demo {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;
        s.setPrice(2000);
        System.out.println(s.getPrice());
    }
}