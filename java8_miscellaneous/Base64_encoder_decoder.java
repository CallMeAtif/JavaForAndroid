package java8_miscellaneous;

import java.util.Base64;

public class Base64_encoder_decoder {
    public static String encode(String str){
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(str.getBytes());
        return new String(encoded);
    }
    public static String decode(String str){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(str.getBytes());
        return new String(decoded);
    }
    public static void main(String[] args) {
        String s = encode("AtifSlaps&^%$ #");
        System.out.println(decode(s));

    }


}
