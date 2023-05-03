package Chapter6;
import java.util.Random;

public class RandomString {

	    public static String generateRandomString(int length) {
	        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        Random random = new Random();
	        char[] text = new char[length];
	        for (int i = 0; i < length; i++) {
	            text[i] = characters.charAt(random.nextInt(characters.length()));
	        }
	        return new String(text);
	    }

	    public static void main(String[] args) {
	        int length = 10;
	        String randomString = generateRandomString(length);
	        System.out.println("Random String of length " + length + ": " + randomString);
	    }
	}

