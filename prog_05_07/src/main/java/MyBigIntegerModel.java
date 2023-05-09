import java.util.ArrayList;

public class MyBigIntegerModel {
    private ArrayList<Integer> digits;

    public MyBigIntegerModel() {
        this.digits = new ArrayList<>();
    }

    public MyBigIntegerModel(String strDigits) {
        this.digits = new ArrayList<>();
        this.digits = MyBigIntegerController.parseHexInInt(strDigits);
    }

    public void setHex(String strDigits){
        this.digits = MyBigIntegerController.parseHexInInt(strDigits);
    }

    public String getHex(){
        return MyBigIntegerController.parseIntInHex(digits);
    }

    public MyBigIntegerModel(ArrayList<Integer> longDigits) {
        this.digits = longDigits;
    }

    public ArrayList<Integer> getDigits() {
        return digits;
    }

    public void setDigits(ArrayList<Integer> digits) {
        this.digits = digits;
    }

}
