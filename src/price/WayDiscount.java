package price;

import buyer.Grade;

public interface WayDiscount {
    double calDiscount(int money, Grade grade);
    String toString();
}
