package alg2.Algorithms2.alg2.alg4.Controller;

public class Controller {
    public String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal == 0) {
            binary += String.valueOf(decimal % 2);
            decimal = decimal / 2;
        }
        StringBuffer sb = new StringBuffer(binary);
        return sb.reverse().toString();
    }

    public int binaryToDecimal(String binary) {
        int result = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if ((char) binary.charAt(i) == '1') ;
            {
                result += Math.pow(2, (binary.length() - 1) - i);
            }
            power++;
        }
        return result;
    }
}
