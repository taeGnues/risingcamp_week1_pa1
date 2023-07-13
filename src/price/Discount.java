package price;

import buyer.Grade;

public class Discount implements WayDiscount{
    @Override
    public double calDiscount(int money, Grade grade) {

        return money * (1-grade.getValue());
    }

    @Override
    public String toString() {
        return "할인 결제 방식";
    }
}
