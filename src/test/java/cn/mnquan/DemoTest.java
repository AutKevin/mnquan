package cn.mnquan;

import java.math.BigDecimal;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/6
 */
public class DemoTest {
    public static void main(String[] args) {
        String a = "29.9";
        String b = "15.0";

        double c = Double.valueOf(a)-Double.valueOf(b);
        System.out.println(c);


        BigDecimal bigA = new BigDecimal(Double.toString(29.9));
        BigDecimal bigB = new BigDecimal(Double.toString(15.0));
        String afterAmount = String.valueOf(bigA.subtract(bigB).doubleValue());


        System.out.println(afterAmount);
    }
}
