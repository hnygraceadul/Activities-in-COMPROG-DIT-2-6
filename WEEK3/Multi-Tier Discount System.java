public class DiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 6000;
        double discountRate;

        if (purchaseAmount >= 5000) {
            discountRate = 0.15;
        } else if (purchaseAmount >= 3000) {
            discountRate = 0.10;
        } else if (purchaseAmount >= 1000) {
            discountRate = 0.05;
        } else {
            discountRate = 0.00;
        }

        double discount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discount;

        System.out.println("Purchase Amount: PHP " + purchaseAmount);
        System.out.println("Discount Tier: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: PHP " + discount);
        System.out.println("Final Discounted Price: PHP " + finalPrice);
    }
}
