public class MyBigIntegerView{
    public static void printIntDigits(MyBigIntegerModel digits){
        System.out.println("digits (10): ");
        for(int i : digits.getDigits()){
            System.out.print(i + "");
        }
        System.out.println();
    }

    public static void printHexDigits(MyBigIntegerModel digits){
        String res = MyBigIntegerController.parseIntInHex(digits.getDigits());
        System.out.println("digits (16): ");
        System.out.println(res);
    }
}
