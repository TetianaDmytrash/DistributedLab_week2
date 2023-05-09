import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class StandardDigitTest {
    String strMy1, strMy2, strMy3, strMy4, strMy5, strMy6;
    BigInteger bigInteger1, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6;
    MyBigIntegerModel bigIntegerMy1, bigIntegerMy2, bigIntegerMy3, bigIntegerMy4, bigIntegerMy5, bigIntegerMy6;

    @Before
    public void setUp() {
        strMy1 = "51bf608414ad5726a3c1bec098f77b1b54ffb2787f8d528a74c1d7fde6470ea4";
        strMy2 = "403db8ad88a3932a0b7e8189aed9eeffb8121dfac05c3512fdb396dd73f6331c";
        strMy3 = "36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80";
        strMy4 = "70983d692f648185febe6d6fa607630ae68649f7e6fc45b94680096c06e4fadb";
        strMy5 = "33ced2c76b26cae94e162c4c0d2c0ff7c13094b0185a3c122e732d5ba77efebc";
        strMy6 = "22e962951cb6cd2ce279ab0e2095825c141d48ef3ca9dabf253e38760b57fe03";

        bigInteger1 = new BigInteger(strMy1, 16);
        bigInteger2 = new BigInteger(strMy2, 16);
        bigInteger3 = new BigInteger(strMy3, 16);
        bigInteger4 = new BigInteger(strMy4, 16);
        bigInteger5 = new BigInteger(strMy5, 16);
        bigInteger6 = new BigInteger(strMy6, 16);

        bigIntegerMy1 = new MyBigIntegerModel();
        bigIntegerMy1.setHex(strMy1);
        bigIntegerMy2 = new MyBigIntegerModel();
        bigIntegerMy2.setHex(strMy2);
        bigIntegerMy3 = new MyBigIntegerModel();
        bigIntegerMy3.setHex(strMy3);
        bigIntegerMy4 = new MyBigIntegerModel();
        bigIntegerMy4.setHex(strMy4);
        bigIntegerMy5 = new MyBigIntegerModel();
        bigIntegerMy5.setHex(strMy5);
        bigIntegerMy6 = new MyBigIntegerModel();
        bigIntegerMy6.setHex(strMy6);
    }

    @Test
    public void checkADD() {
//        System.out.println((bigInteger2.add(bigInteger2)).toString(16));
//        System.out.println((MyBigIntegerStandardDigit.myADD(bigIntegerMy2, bigIntegerMy2)).getHex());
        Assert.assertTrue(((bigInteger1.add(bigInteger2)).toString(16))
                .equals((MyBigIntegerStandardDigit.myADD(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger2.add(bigInteger1)).toString(16))
                .equals((MyBigIntegerStandardDigit.myADD(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger5.add(bigInteger4)).toString(16))
                .equals((MyBigIntegerStandardDigit.myADD(bigIntegerMy5, bigIntegerMy4)).getHex()));
        Assert.assertTrue(((bigInteger1.add(bigInteger6)).toString(16))
                .equals((MyBigIntegerStandardDigit.myADD(bigIntegerMy1, bigIntegerMy6)).getHex()));
        Assert.assertTrue(((bigInteger3.add(bigInteger2)).toString(16))
                .equals((MyBigIntegerStandardDigit.myADD(bigIntegerMy3, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger4.add(bigInteger4)).toString(16))
                .equals((MyBigIntegerStandardDigit.myADD(bigIntegerMy4, bigIntegerMy4)).getHex()));

    }

    @Test
    public void checkSUB() {
//        System.out.println((bigInteger4.subtract(bigInteger4)).toString(16));
//        System.out.println((MyBigIntegerStandardDigit.mySUB(bigIntegerMy4, bigIntegerMy4)).getHex());
        Assert.assertTrue(((bigInteger1.subtract(bigInteger2)).toString(16))
                .equals((MyBigIntegerStandardDigit.mySUB(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertFalse(((bigInteger2.subtract(bigInteger1)).toString(16))
                .equals((MyBigIntegerStandardDigit.mySUB(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger4.subtract(bigInteger5)).toString(16))
                .equals((MyBigIntegerStandardDigit.mySUB(bigIntegerMy4, bigIntegerMy5)).getHex()));
        Assert.assertTrue(((bigInteger1.subtract(bigInteger6)).toString(16))
                .equals((MyBigIntegerStandardDigit.mySUB(bigIntegerMy1, bigIntegerMy6)).getHex()));
        Assert.assertTrue(((bigInteger2.subtract(bigInteger3)).toString(16))
                .equals((MyBigIntegerStandardDigit.mySUB(bigIntegerMy2, bigIntegerMy3)).getHex()));
        Assert.assertTrue(((bigInteger4.subtract(bigInteger2)).toString(16))
                .equals((MyBigIntegerStandardDigit.mySUB(bigIntegerMy4, bigIntegerMy2)).getHex()));

    }

    @Test
    public void checkMOD() {
//        System.out.println((bigInteger4.subtract(bigInteger4)).toString(16));
//        System.out.println((MyBigIntegerStandardDigit.myMOD(bigIntegerMy4, bigIntegerMy4)).getHex());
        Assert.assertTrue(((bigInteger1.mod(bigInteger2)).toString(16))
                .equals((MyBigIntegerStandardDigit.myMOD(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertFalse(((bigInteger2.mod(bigInteger1)).toString(16))
                .equals((MyBigIntegerStandardDigit.myMOD(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger4.mod(bigInteger5)).toString(16))
                .equals((MyBigIntegerStandardDigit.myMOD(bigIntegerMy4, bigIntegerMy5)).getHex()));
        Assert.assertTrue(((bigInteger1.mod(bigInteger6)).toString(16))
                .equals((MyBigIntegerStandardDigit.myMOD(bigIntegerMy1, bigIntegerMy6)).getHex()));
        Assert.assertTrue(((bigInteger2.mod(bigInteger3)).toString(16))
                .equals((MyBigIntegerStandardDigit.myMOD(bigIntegerMy2, bigIntegerMy3)).getHex()));
        Assert.assertTrue(((bigInteger4.mod(bigInteger2)).toString(16))
                .equals((MyBigIntegerStandardDigit.myMOD(bigIntegerMy4, bigIntegerMy2)).getHex()));

    }
}