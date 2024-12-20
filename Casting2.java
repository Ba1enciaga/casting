package casting;

public class Casting2 {
    public static void main(String[] args) {
        int intValue = 1;
        double doubleValue = 1.5;

        intValue = (int) doubleValue;
        System.out.println(doubleValue);
        // Double형을 int형에 담으면 잠깐 int형으로 변환만해주는거네
        doubleValue = (int)doubleValue;
        System.out.println(doubleValue);
        //1.5를
    }
}
