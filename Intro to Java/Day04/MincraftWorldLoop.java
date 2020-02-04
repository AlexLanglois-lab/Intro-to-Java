package javaapplication7;

public class JavaApplication7 {

    /**
     * Walking across all possible squares in a Minecraft server.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<30000000; ++i) {
            for (int j=0; j<30000000; ++j) {
                for (int k=0; k<256; ++k) {
                    System.out.println("k: " + k);
                }
                System.out.println("j: " + j);
            }
            System.out.println("i: " + i);
        }
    }
}
