import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class BinaryDigitTest {
    String strMy1, strMy2, strMy3, strMy4, strMy5, strMy6;
    BigInteger bigInteger1, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6;
    MyBigIntegerModel bigIntegerMy1, bigIntegerMy2, bigIntegerMy3, bigIntegerMy4, bigIntegerMy5, bigIntegerMy6;

    @Before
    public void setUp(){
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
    public void checkXOR(){
//        System.out.println((bigInteger2.xor(bigInteger2)).toString(16));
//        System.out.println((MyBigIntegerBinaryDigit.myXOR(bigIntegerMy2, bigIntegerMy2)).getHex());
        Assert.assertTrue(((bigInteger1.xor(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myXOR(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger6.xor(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myXOR(bigIntegerMy6, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger3.xor(bigInteger4)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myXOR(bigIntegerMy3, bigIntegerMy4)).getHex()));
        Assert.assertTrue(((bigInteger5.xor(bigInteger6)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myXOR(bigIntegerMy5, bigIntegerMy6)).getHex()));
        Assert.assertTrue(((bigInteger1.xor(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myXOR(bigIntegerMy2, bigIntegerMy1)).getHex()));

    }

    @Test
    public void checkOR(){
//        System.out.println((bigInteger2.or(bigInteger2)).toString(16));
//        System.out.println((MyBigIntegerBinaryDigit.myOR(bigIntegerMy2, bigIntegerMy2)).getHex());
        Assert.assertTrue(((bigInteger1.or(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myOR(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger6.or(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myOR(bigIntegerMy6, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger3.or(bigInteger4)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myOR(bigIntegerMy3, bigIntegerMy4)).getHex()));
        Assert.assertTrue(((bigInteger5.or(bigInteger6)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myOR(bigIntegerMy5, bigIntegerMy6)).getHex()));
        Assert.assertTrue(((bigInteger1.or(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myOR(bigIntegerMy2, bigIntegerMy1)).getHex()));

    }

    @Test
    public void checkAND(){
//        System.out.println((bigInteger2.and(bigInteger2)).toString(16));
//        System.out.println((MyBigIntegerBinaryDigit.myAND(bigIntegerMy2, bigIntegerMy2)).getHex());
        Assert.assertTrue(((bigInteger1.and(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myAND(bigIntegerMy1, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger6.and(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myAND(bigIntegerMy6, bigIntegerMy2)).getHex()));
        Assert.assertTrue(((bigInteger3.and(bigInteger4)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myAND(bigIntegerMy3, bigIntegerMy4)).getHex()));
        Assert.assertTrue(((bigInteger5.and(bigInteger6)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myAND(bigIntegerMy5, bigIntegerMy6)).getHex()));
        Assert.assertTrue(((bigInteger1.and(bigInteger2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myAND(bigIntegerMy2, bigIntegerMy1)).getHex()));

    }

    @Test
    public void checkShiftR(){
//        System.out.println(((bigInteger1.shiftRight(2)).toString(16));
//        System.out.println((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy1, 2)).getHex()));
        Assert.assertTrue(((bigInteger1.shiftRight(2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy1, 2)).getHex()));
        Assert.assertTrue(((bigInteger2.shiftRight(4)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy2, 4)).getHex()));
        Assert.assertTrue(((bigInteger3.shiftRight(1)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy3, 1)).getHex()));
        Assert.assertTrue(((bigInteger4.shiftRight(2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy4, 2)).getHex()));
        Assert.assertTrue(((bigInteger5.shiftRight(5)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy5, 5)).getHex()));
        Assert.assertTrue(((bigInteger6.shiftRight(3)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftR(bigIntegerMy6, 3)).getHex()));

    }

    @Test
    public void checkShiftL(){
        Assert.assertTrue(((bigInteger1.shiftLeft(2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftL(bigIntegerMy1, 2)).getHex()));
        Assert.assertTrue(((bigInteger2.shiftLeft(4)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftL(bigIntegerMy2, 4)).getHex()));
        Assert.assertTrue(((bigInteger3.shiftLeft(1)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftL(bigIntegerMy3, 1)).getHex()));
        Assert.assertTrue(((bigInteger4.shiftLeft(2)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftL(bigIntegerMy4, 2)).getHex()));
        Assert.assertTrue(((bigInteger5.shiftLeft(5)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftL(bigIntegerMy5, 5)).getHex()));
        Assert.assertTrue(((bigInteger6.shiftLeft(3)).toString(16))
                .equals((MyBigIntegerBinaryDigit.myShiftL(bigIntegerMy6, 3)).getHex()));

    }
}
