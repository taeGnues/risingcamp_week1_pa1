import buyer.User;
import price.Bonus;
import price.Discount;
import service.SaleService;

import java.util.ArrayList;
import java.util.Scanner;

import static buyer.Grade.*;

public class Main {
    public static void main(String[] args) {
        // 세일 서비스 객체 생성
        SaleService saleService = new SaleService(10000);

        // 고객 객체 생성
        User user1 = new User("Web", "가가가", GOLD, new Discount());
        User user2 = new User("Mobile", "나나나", BRONZE, new Bonus());

        // 고객 리스트 생성, 추가
        ArrayList<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);

        // 고객 정보 조회 & 가격 계산
        System.out.println("고객 가격 계산=======================");
        for(User u : users){
            u.printUserInfo();
            saleService.sale(u);
            System.out.println("=======================");
        }

        System.out.println("고객 이름 검색 기능 ===================");
        Scanner sc = new Scanner(System.in);
        String find_name = sc.nextLine();
        for(User u : users){
            if(u.getName().equals(find_name)){
                u.printUserInfo();
                System.out.println("=======================");
            }
        }
    }
}



//
//- 최상위 고객 객체를 추상클래스로 만들고, 공통 멤버변수(이름, 등급, 할인방식)와
//        가격을 계산하는 계산 메서드, 유저 정보를 출력하는 메서드 2가지를 만든다.
//        - 유저 정보를 출력하는 메서드를 추상메서드로 선언하고, 웹에서 접속하는 유저와
//        모바일에서 접속하는 유저를 구분하여 정보가 출력되는 상단에 접속 경로를 출력해야 한다.
//        - 등급은 enum을 활용해서 BRONZE, SILVER, GOLD 등급으로 관리하고,

//        각 등급마다 할인 비율인 0.1, 0.2, 0.3을 적용하도록 한다.

//        - 할인방식은 금액을 받으면 계산 결과를 반환하는 메서드를 가진 인터페이스로 설계하고
//        보너스 방식과, 할인 방식이 있다.

//        - 보너스 방식은 할인 비율만큼 보너스 포인트에 더하고,
//        할인 방식은 지불 금액에서 곧바로 할인 비율만큼 금액을 차감해주는 방식이다.
//        - 계산 메서드는 고객 객체에 있는 할인방식을 활용하여 계산되도록 한다.
//        - 고객의 속성은 Getter, Setter로만 접근 가능하게 해야 한다.
//        - 고객은 이름 속성으로 동일한지 비교가 가능하다. (equals, hashcode 활용)