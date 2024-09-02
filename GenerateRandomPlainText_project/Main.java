import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Input your plain text: ");
        String plain_text = input.nextLine();

        int get_index = plain_text.length();
        if(get_index < 3){
            System.err.println("Invalid! Plain text must be more than 3 words");
        } else {
            char[] generate_encryptd = new char[get_index];

            for (int i = 0; i < get_index; i++) {
                char originalChar = plain_text.charAt(i);
                int shiftedValue = originalChar + rand.nextInt(get_index);
                generate_encryptd[i] = (char) shiftedValue;
            }

            String final_output = String.valueOf(generate_encryptd);
            System.out.println("Encrypted text: " + final_output);
        }
    }
}
