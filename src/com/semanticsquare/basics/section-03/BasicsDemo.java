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
        System.out.println("Hello, world!!");        // advance cursor to beginning of next line
        System.out.println();                        // print empty line
        System.out.print("Hello, world!!");            // cursor stayed after the printed string
        System.out.println("Hello,");               
        System.out.print(" ");                      // print a space
        System.out.println("world");
    }

    static void primitives() {
        System.out.println("\n\nInside Primitives ...");
        // int intHex = 0x0041; // 65 -> 16 power 0 * 1 + 16 power 1 * 4
        long intHex = 0x0041L;
        System.out.println("intHex: " + intHex);   

        // Java 7 onwards
        // int intBinary = 0b01000001; // 65
        int intBinary = 0b0100_0001; // 65
        System.out.println("intBinary: " + intBinary);  

        int intOctal = 0101; // base 8 so 
        System.out.println("intOctal: " + intOctal);  
    }

    public static void main(String[] args) {
        //we can use these methods directly because they are static methods
        // print();
        primitives();
    }

    
}