public class TotalCost {
    public static void main(String[] args) {

        int laptopPrice = 85000;
        int mousePrice = 2500;

        int totalPrice = laptopPrice + mousePrice;

        double discount = totalPrice * 0.15;
        double finalPrice = totalPrice - discount;

        System.out.println("Total price after 15% discount: " + finalPrice + " tk");
    }
}
