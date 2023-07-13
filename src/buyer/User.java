package buyer;

import buyer.Customers;
import price.WayDiscount;

public class User extends Customers {

    String connectBy;

    public User(String connectBy, String name, Grade grade, WayDiscount wayDiscount) {
        super(name, grade, wayDiscount);
        this.connectBy = connectBy;
    }

    @Override
    public void printUserInfo() {
        System.out.println("접속 경로 : " + connectBy);
        super.printUserInfo();
    }
}
