class Student {
    // keep in mind id and age and rank are assigned using an int literal
    int id = 1000;
    // int id = 1000L; // incompatible types: possible lossy conversion from long to int
    // byte age = 18;
    byte age = 1_8; // can't do _18 or 18_
    // byte rank = 165; // error: incompatible types: possible lossy conversion from int to byte [-128, 127]
    short rank = 165; 
    // int [-2^(31) - 2^(31) - 1 
    // int phone = 2234567890; // error: integer number too large
    // long literal
    // int phone = 2234567890L; // error: incompatible types: possible lossy conversion from long to int
    // long phone = 2234567890L;
    long phone = 223_456_7890L; // can add underscores for readability (if you want)

    //ALL 8 PRIMITIVES HAVE BOX PRIMITIVE TYPES 
    int minValue = Integer.MIN_VALUE; //-2^(31)
    int maxValue = Integer.MAX_VALUE; //-2^(31) - 1
    // byte minValue = Byte.MIN_VALUE; // -128
    // byte maxValue = Byte.MAX_VALUE; // 127

    void compute() {
        int nextId = id + 1;

        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("rank: " + rank);
        System.out.println("phone: " + phone);
        System.out.println("minValue: " + minValue);
        System.out.println("maxValue: " + maxValue);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}