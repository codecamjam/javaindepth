class Student {
    int id = 1000;
    byte age = 18;
    short rank = 165; 
    long phone = 223_456_7890L;

    double gpa = 3.8;

    // char degree = 'B';
    // char degree = '\u0042'; // has to be lowercase and valid number
    char degree = '\u0000'; // default null char same as char degree;
    // char degree = ' '; //cant be ''

    void compute() {
        int nextId = id + 1;

        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("rank: " + rank);
        System.out.println("phone: " + phone);
        System.out.println("gpa: " + gpa);
        System.out.println("degree: " + degree);


    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}