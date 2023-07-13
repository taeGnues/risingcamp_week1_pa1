package buyer;

// 등급은 enum을 활용해서 BRONZE, SILVER, GOLD 등급으로 관리
public enum Grade {
    BRONZE(0.1), SILVER(0.2), GOLD(0.3);

    private final double value;

    Grade(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
