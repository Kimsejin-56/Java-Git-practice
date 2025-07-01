package javabasic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];
        int sum = 0;

        order[0]=new ProductOrder();
        order[0].productName = "두부";
        order[0].price = 2000;
        order[0].quantity = 2;

        order[1]=new ProductOrder();
        order[1].productName = "김치";
        order[1].price = 5000;
        order[1].quantity = 1;

        order[2]=new ProductOrder();
        order[2].productName = "콜라";
        order[2].price = 1500;
        order[2].quantity = 2;

        for (ProductOrder productOrder : order) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.price);
            sum += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
