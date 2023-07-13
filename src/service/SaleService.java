package service;

import buyer.User;

public class SaleService {
    // 상품 가격을 입력받고 고객에 따라서 상품 가격 출력.
    int productPrice;
    public SaleService(int productPrice) {
        this.productPrice = productPrice;
    }

    public void sale(User user){
        double p = user.calTotalPrice(productPrice);

        System.out.println("결제 금액 : " + p);
    }




}
