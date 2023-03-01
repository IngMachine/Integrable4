package poo.typesdata.bigdecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);
        BigDecimal decimal = new BigDecimal(0.1f);
        BigDecimal decimal1 = new BigDecimal(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f );
        BigDecimal result = decimal.add(decimal1);
        System.out.println(result.toString());
    }
}
