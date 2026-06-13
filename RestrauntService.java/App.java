    public class App {
    public static void main(String[] args) {
        // RestrauntService service = new RestrauntService();

        // System.out.println(RestrauntService.Restrauntype);

        BurgerKing order = new BurgerKing("Whooper Burger");

        order.acceptOrder("Samruddhi");

        order.PrepareFood();

        order.DeliverFood();
    }

    static class BurgerKing {
        private final String item;

        BurgerKing(String item) {
            this.item = item;
        }

        void acceptOrder(String customer) {
            System.out.println("Order accepted for " + customer + ": " + item);
        }

        void PrepareFood() {
            System.out.println("Preparing " + item);
        }

        void DeliverFood() {
            System.out.println("Delivering " + item);
        }
    }
}
