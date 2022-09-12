class Student {
    int id = 1000;
    // int id = "CAM"; NOPE!
    // int id; // 0
    // id = 1000 // ERROR: you cant have assignment statements at class level

    // int id = 1000;
    // int nextId = id + 1;

    // BOTH STATIC AND INSTANCE VARIABLES ARE DECLARED AT CLASS LEVEL
    // AND THEY GET DEFAULT VALUES 

    void compute() {
        // local variables don't get default values
        // int id; this causes an error because it wasn't initialized

        // this is fine
        // int id;
        // id = 1000;
        //id = "Cam" NOPE, should be int
        id = 1000; // this is fine too
        int nextId = id + 1;

        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}