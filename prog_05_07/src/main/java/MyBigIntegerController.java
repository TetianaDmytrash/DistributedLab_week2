import java.util.ArrayList;

public class MyBigIntegerController {
    public static String parseIntInHex(ArrayList<Integer> longDigits){
        String resultHexString = "";
        for(int i = 0; i < longDigits.size(); i++){
            String result = "";
            if(i != 0){
                result = String.format("%04x", longDigits.get(i));
            } else {
                result = Integer.toHexString(longDigits.get(i));
            }
            resultHexString = resultHexString + result;
        }
//        for(Integer i : longDigits){
////            String tmp =Integer.toHexString(i);
////            String result = tmp.length() < 4 ? String.format("%0" + (4 - tmp.length()) + "d%s", 0, tmp) : tmp;
//            String result = String.format("%04x", i);
//            resultHexString = resultHexString + result;
//        }
        return resultHexString;
    }

    public static ArrayList<Integer> parseHexInInt(String strHex){
        ArrayList<Integer> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder(strHex);
        sb.reverse();
        String reversedStr = sb.toString();
        int strLength = reversedStr.length();
        int arrayLength = (int) Math.ceil((double) strLength / 4);
        String[] result = new String[arrayLength];
        int j = 0;

        for (int i = 0; i < strLength; i += 4) {
            result[j++] = reversedStr.substring(i, Math.min(i + 4, strLength));
        }
        for(int i = result.length-1; i >= 0; i--){
            sb = new StringBuilder(result[i]);
            sb.reverse();
            String tmpStr = sb.toString();
            //?
            digits.add((Integer.parseInt(tmpStr, 16))&0xffff);
        }
        return digits;
    }
}
