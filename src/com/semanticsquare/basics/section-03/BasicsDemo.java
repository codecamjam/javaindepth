import java.math.BigDecimal;

class BasicsDemo {
    // 1. Naming rules for classes/methods/variables
        // a. First character: letter, underscore, $
        //    Remaining: letter, underscore, $, numbers
        // b. No reserved keywords
    int id1 = 0;

    // 2. **Java is case-sensitive

    int id = 0;
    int Id = 0;
    int ID = 0;

    void foo() {}
    void Foo() {}

    // 3. Printing to console
    static void print() {
        System.out.println("\n\nInside print...");
        System.out.println("Hello, world!!");        
        System.out.println();                        
        System.out.print("Hello, world!!");           
        System.out.println("Hello,");               
        System.out.print(" ");                  
        System.out.println("world");
    }

    static void primitives() {
        System.out.println("\n\nInside Primitives ...");
        long intHex = 0x0041L;
        System.out.println("intHex: " + intHex);   

        int intBinary = 0b0100_0001; // 65
        System.out.println("intBinary: " + intBinary);  

        int intOctal = 0101; // base 8 so 
        System.out.println("intOctal: " + intOctal);  

        int intChar = 'A'; // prints 65 

        char charInt = 65; // A has to be between 0 and 65535
        System.out.println("charInt: " + charInt);  

        char charHex = 0x0041; // 65
        System.out.println("charHex: " + charHex);  

        char charBinary = 0b0100_0001; // 65
        System.out.println("charBinary: " + charBinary);  
    }

    public static void main(String[] args) {
       
        // System.out.println(1 - 0.9); 
        // System.out.println(0.1 + 0.2);

        // double price = 1000;
        // double discountPercent = 0.9;
        // double discountAmount = price * discountPercent;
        // System.out.println(price - discountAmount); 

        // System.out.println(price * (1 - discountPercent));

        // BigDecimal first = new BigDecimal("0.1");
        // BigDecimal second = new BigDecimal("0.2");
        // System.out.println(first.add(second));

        primitives();
    }

    
}