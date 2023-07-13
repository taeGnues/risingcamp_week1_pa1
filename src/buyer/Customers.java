package buyer;

import price.WayDiscount;

//최상위 고객 객체를 추상클래스로 만들고, 공통 멤버변수(이름, 등급, 할인방식)와
// 가격을 계산하는 계산 메서드, 유저 정보를 출력하는 메서드 2가지를 만든다.
// - 유저 정보를 출력하는 메서드를 추상메서드로 선언하고, 웹에서 접속하는 유저와
// 모바일에서 접속하는 유저를 구분하여 정보가 출력되는 상단에 접속 경로를 출력해야 한다.
//        - 고객의 속성은 Getter, Setter로만 접근 가능하게 해야 한다.
//        - 고객은 이름 속성으로 동일한지 비교가 가능하다. (equals, hashcode 활용)
public class Customers {
    String name;
    Grade grade;
    WayDiscount wayDiscount;

    public Customers(String name, Grade grade, WayDiscount wayDiscount) {
        this.name = name;
        this.grade = grade;
        this.wayDiscount = wayDiscount;
    }


    public void printUserInfo(){
        System.out.println("이름 : " + name);
        System.out.println("등급 : " + grade);
        System.out.println("결제방식 : " + wayDiscount.toString());
    } // 유저 정보를 출력하는 메서드
    public double calTotalPrice(int price){
        return wayDiscount.calDiscount(price, grade);
    } // 가격을 계산하는 계산 메서드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public WayDiscount getWayDiscount() {
        return wayDiscount;
    }

    public void setWayDiscount(WayDiscount wayDiscount) {
        this.wayDiscount = wayDiscount;
    }
}
