// Casting은 형변환을 의미
package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue =" + longValue);
        /* long이 큰 컵, int 작은 컵이라 치자 ; 큰컵에 작은컵은 들어가지만 작은컵에 큰컵은 못들어감
        */
    }
}
