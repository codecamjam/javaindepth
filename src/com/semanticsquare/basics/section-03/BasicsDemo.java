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

    public static void main(String[] args) {
        print();

        // 4. Comments or Disabling Code - I already know this of course

        // 5. Arithmetic Operations

        int i = 6;
        int j = 2;

        System.out.println(i + j); //8
        System.out.println(i - j); //4
        System.out.println(i * j); //12
        System.out.println(i / j); //3
        System.out.println(i % j); //0
    }

    
}