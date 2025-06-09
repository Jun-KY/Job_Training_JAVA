package J25_06_09;

public class String_method {
    public static void main(String[] args){
        String message = "0x120819f5573ac3A530e6172b1581613A09b4b338";

        System.out.println("Length: " + message.length());

        System.out.println("Uppercase: " + message.toUpperCase());

        System.out.println("Lowercase: " + message.toLowerCase());

        System.out.println("subString: " + message.substring(0,7) + "..."
                + message.substring(message.length() - 5));
        System.out.println();
        System.out.println(message.indexOf("5"));

        int count = 0;
        for (int i = 0; i < message.length(); i ++){
            if (message.substring(i,i+1).equals("5")){
                System.out.print(i + " ");
                count++;

            }
        }
        System.out.println("\n"+count);
        System.out.println();
        for (int i = 0; i < message.length(); i ++){
            if (message.charAt(i) == '5'){
                System.out.print(i + " ");
            }
        }
    }
}
