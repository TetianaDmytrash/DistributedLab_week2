import java.util.ArrayList;

public class MyBigIntegerStandardDigit {
    public static MyBigIntegerModel myADD(MyBigIntegerModel first, MyBigIntegerModel second){
        ArrayList<Integer> result = new ArrayList<>();

        Integer tmpShift = 0;
        for(int i = ((first.getDigits()).size()-1); i >= 0; i--){
//            System.out.println(Integer.toHexString(first.getDigits().get(i)) + " + " + Integer.toHexString(second.getDigits().get(i)) + " + " + tmpShift);
            Integer tmp = first.getDigits().get(i) + second.getDigits().get(i) + tmpShift;
            tmpShift = tmp&0x10000;
            tmpShift = tmpShift >> 16;
//            System.out.println("shift = " + tmpShift);
            tmp = tmp&0xffff;
//            System.out.println("res = " + Integer.toHexString(tmp));
            result.add(tmp);
        }
//        result.add(tmpShift);
        ArrayList<Integer> resultAdd = new ArrayList<>();
        for (int i = result.size()-1; i >= 0; i--) {
            resultAdd.add(result.get(i));
        }
        return new MyBigIntegerModel(resultAdd);
    }

    public static MyBigIntegerModel mySUB(MyBigIntegerModel first, MyBigIntegerModel second){
        ArrayList<Integer> result = new ArrayList<>();
        if((first.getDigits()).size()<(second.getDigits()).size()){
            System.out.println("the result will not be a natural number");
            return null;
        } else if((first.getDigits()).size()==(second.getDigits()).size()){
            for(int i = 0; i < (first.getDigits()).size(); i++){
                if (first.getDigits().get(i) < second.getDigits().get(i)) {
                    System.out.println("the result will not be a natural number");
                    return null;
                } else if(first.getDigits().get(i) > second.getDigits().get(i)){
//                    System.out.println("good");
                    break;
                }
            }
        }
        Integer tmpShift = 0;
        for(int i = ((first.getDigits()).size()-1); i >= 0; i--){
            Integer tmp = first.getDigits().get(i) - second.getDigits().get(i) - tmpShift;
            tmpShift = tmp&0x10000;
            tmpShift = tmpShift >> 16;
            tmp = tmp&0xffff;
            result.add(tmp);
        }

        ArrayList<Integer> resultSub = new ArrayList<>();
        for (int i = result.size()-1; i >= 0; i--) {
            resultSub.add(result.get(i));
        }
        return new MyBigIntegerModel(resultSub);
    }

    public static MyBigIntegerModel myMOD(MyBigIntegerModel first, MyBigIntegerModel second){
        MyBigIntegerModel resMODBigIntegerModel = new MyBigIntegerModel("0");
        while(true){
            if((first.getDigits()).size()<(second.getDigits()).size()){
//                System.out.println("0");
                return resMODBigIntegerModel;
            } else if((first.getDigits()).size()==(second.getDigits()).size()){
                for(int i = 0; i < (first.getDigits()).size(); i++){
                    if (first.getDigits().get(i) < second.getDigits().get(i)) {
//                        System.out.println("00");
                        return resMODBigIntegerModel;
                    } else if(first.getDigits().get(i) > second.getDigits().get(i)){
//                        System.out.println("good");
                        resMODBigIntegerModel = MyBigIntegerStandardDigit.mySUB(first, second);
                        first = resMODBigIntegerModel;
                        break;
                    }
                }
            }
        }
    }
}
