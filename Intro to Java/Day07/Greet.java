
package javaapplication22;

public class JavaApplication22 {

    public static void main(String[] args) {
        System.out.println("Prepare to be greeted!");
        greet("Anthony");
        greet("Betty");
        greet("Charles");
        greet("Daniel");
        greet("Egret");
        greet("Frank");
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
