import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String [] Args){
        System.out.println("hello night");

        String firstB = "4";
//        String firstB = "51bf608414ad5726a3c1bec098f77b1b54ffb2787f8d528a74c1d7fde6470ea4";
        MyBigIntegerModel myBigIntegerModelB = new MyBigIntegerModel();
        myBigIntegerModelB.setHex(firstB);
        MyBigIntegerView.printHexDigits(myBigIntegerModelB);

        String secondB = "403db8ad88a3932a0b7e8189aed9eeffb8121dfac05c3512fdb396dd73f6331c";
        MyBigIntegerModel myBigIntegerModelS = new MyBigIntegerModel();
        myBigIntegerModelS.setHex(secondB);
//        MyBigIntegerView.printHexDigits(myBigIntegerModelS);

//        MyBigIntegerModel res = MyBigIntegerBinaryDigit.myAND(myBigIntegerModelB, myBigIntegerModelS);
        MyBigIntegerModel res = MyBigIntegerBinaryDigit.myINV(myBigIntegerModelB);
        MyBigIntegerView.printHexDigits(res);

        BigInteger fB = new BigInteger("4", 16);
        BigInteger sB = new BigInteger("403db8ad88a3932a0b7e8189aed9eeffb8121dfac05c3512fdb396dd73f6331c", 16);
//        BigInteger rB = fB.and(sB);

//        BigInteger rB = fB.shiftRight(2);
        BigInteger rB = fB.not();
        System.out.println((rB.toString(16)));
        System.out.println((rB.toString(2)));

        BigInteger s = new BigInteger("36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80", 16);
        BigInteger f = new BigInteger("70983d692f648185febe6d6fa607630ae68649f7e6fc45b94680096c06e4fadb", 16);
        BigInteger r = f.mod(s);

        System.out.println("add");
        System.out.println((r.toString(16)));
        String secondAdd = "36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80";
        String firstAdd = "70983d692f648185febe6d6fa607630ae68649f7e6fc45b94680096c06e4fadb";
        MyBigIntegerModel firstAddBigIntegerModel = new MyBigIntegerModel();
        firstAddBigIntegerModel.setHex(firstAdd);
        MyBigIntegerModel secondAddBigIntegerModel = new MyBigIntegerModel();
        secondAddBigIntegerModel.setHex(secondAdd);
        MyBigIntegerModel resAddBigIntegerModel = MyBigIntegerStandardDigit.myMOD(firstAddBigIntegerModel, secondAddBigIntegerModel);
        MyBigIntegerView.printHexDigits(resAddBigIntegerModel);
//        MyBigIntegerView.printHexDigits(firstAddBigIntegerModel);
//        MyBigIntegerView.printHexDigits(secondAddBigIntegerModel);


//
//
//        System.out.println(~(-342));
//        System.out.println(Integer.toBinaryString(~(-342)));
    }
}
