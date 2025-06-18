import java.math.BigInteger;

public class Zad3 {

        public static void main(String args[]) {
            BigInteger bigNumber=new BigInteger("10");
            silnia_rekurencyjna(bigNumber);
        }
        public static BigInteger silnia_rekurencyjna (BigInteger n) {
            BigInteger zero=new BigInteger("0");
            BigInteger one=new BigInteger("1");
            if ()
                return one;
            else {
                return  n.multiply(silnia_rekurencyjna(n.subtract(one)));


            }
        }
}
