import java.util.ArrayList;

public class MyBigIntegerBinaryDigit {

    //ok
    public static MyBigIntegerModel myXOR(MyBigIntegerModel first, MyBigIntegerModel second){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < (first.getDigits()).size(); i++){
            Integer tmp = first.getDigits().get(i) ^ second.getDigits().get(i);
            result.add(tmp);
        }
        return new MyBigIntegerModel(result);
    }

    //ok
    public static MyBigIntegerModel myOR(MyBigIntegerModel first, MyBigIntegerModel second){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < (first.getDigits()).size(); i++){
            Integer tmp = first.getDigits().get(i) | second.getDigits().get(i);
            result.add(tmp);
        }
        return new MyBigIntegerModel(result);
    }

    //ok
    public static MyBigIntegerModel myAND(MyBigIntegerModel first, MyBigIntegerModel second){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < (first.getDigits()).size(); i++){
            Integer tmp = first.getDigits().get(i) & second.getDigits().get(i);
            result.add(tmp);
        }
        return new MyBigIntegerModel(result);
    }

    //error
    public static MyBigIntegerModel myINV(MyBigIntegerModel first){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < (first.getDigits()).size(); i++){
            Integer tmp = (~first.getDigits().get(i))&0xffff;
            System.out.println(Integer.toBinaryString(tmp));
            result.add(tmp);
        }
        return new MyBigIntegerModel(result);
    }

    //ok
    public static MyBigIntegerModel myShiftR(MyBigIntegerModel first, int k){
        ArrayList<Integer> result = new ArrayList<>();
        Integer tmpShift = 0x0000;
        int value = 1;
        for(int i = k; i > 0; i--){
            value = value | (1 << (i - 1));
        }

        for(int i = 0; i < (first.getDigits()).size(); i++){
            Integer tmp = first.getDigits().get(i);
            tmp = tmp | tmpShift;
            tmpShift = tmp&(value);
            tmp = tmp >> k;
            tmpShift = tmpShift << 16;
            tmp = tmp&0xffff;
            result.add(tmp);

        }
        return new MyBigIntegerModel(result);
    }

    //ok
    public static MyBigIntegerModel myShiftL(MyBigIntegerModel first, int k){
        ArrayList<Integer> result = new ArrayList<>();
        Integer tmpShift = 0x0000;
        Integer tmp = 0x0000;
        for(int i = (first.getDigits()).size()-1; i >= 0; i--){
            tmp = first.getDigits().get(i) << k;
            tmp = tmp | tmpShift;
            tmpShift = tmp&(0xffff0000);
            tmpShift = tmpShift >> 16;
            tmp = tmp&0xffff;
            result.add(tmp);
        }
        if(tmpShift != 0x0000){
            result.add(tmpShift);
        }
        ArrayList<Integer> resultReverse = new ArrayList<>();
        for (int i = result.size()-1; i >= 0; i--) {
            resultReverse.add(result.get(i));
        }
        return new MyBigIntegerModel(resultReverse);
    }
}
