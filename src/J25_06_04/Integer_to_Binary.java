package J25_06_04;

public class Integer_to_Binary {
    public static void main(String[] args){

        int num = 121231323;
        String binaryString = Integer.toBinaryString(num);
        String hexString = Integer.toHexString(num);
        String octString = Integer.toOctalString(num);
        System.out.println("Binary: " + binaryString);
        System.out.println("Hexadecimal: " + hexString);
        System.out.println("Octal: " + octString);
    }
}