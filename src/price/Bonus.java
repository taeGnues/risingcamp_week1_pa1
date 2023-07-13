package price;

import buyer.Grade;

public class Bonus implements WayDiscount{
    double BonusPoints=0;
    @Override
    public double calDiscount(int money, Grade grade) {

        BonusPoints = money * grade.getValue();
        System.out.println("보너스 : " + BonusPoints);
        return money;
    }

    @Override
    public String toString() {
        return "보너스 결제 방식";
    }
}
