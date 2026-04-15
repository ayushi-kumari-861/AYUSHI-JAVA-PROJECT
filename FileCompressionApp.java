import java.util.Scanner;

// Interface
interface CompressionService {
    String compress(String data);
    String decompress(String data);
}

// Class for Compression
class FileCompressor implements CompressionService {

    // Compress using Run-Length Encoding
    public String compress(String data) {
        String result = "";
        int count = 1;

        for (int i = 0; i < data.length(); i++) {

            if (i < data.length() - 1 && data.charAt(i) == data.charAt(i + 1)) {
                count++;
            } else {
                result += data.charAt(i) + "" + count;
                count = 1;
            }
        }
        return result;
    }

    // Decompress back to original string
    public String decompress(String data) {
        String result = "";

        for (int i = 0; i < data.length(); i += 2) {
            char ch = data.charAt(i);
            int count = data.charAt(i + 1) - '0';

            for (int j = 0; j < count; j++) {
                result += ch;
            }
        }
        return result;
    }
}

// Main Class
public class FileCompressionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileCompressor fc = new FileCompressor();

        int choice;

        do {
            System.out.println("\n--- FILE COMPRESSION MENU ---");
            System.out.println("1. Compress String");
            System.out.println("2. Decompress String");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter string: ");
                    String input = sc.nextLine();
                    String compressed = fc.compress(input);
                    System.out.println("Compressed: " + compressed);
                    break;

                case 2:
                    System.out.print("Enter compressed string: ");
                    String comp = sc.nextLine();
                    String decompressed = fc.decompress(comp);
                    System.out.println("Decompressed: " + decompressed);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}