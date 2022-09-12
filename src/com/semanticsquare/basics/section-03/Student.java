class Student {
    int id = 1000;
    byte age = 18;
    short rank = 165; 
    long phone = 223_456_7890L;

    // float gpa = 3.8f; //this won't work if its 3.8, b/c then its a double literal
    // double gpa = 3.8; // or 3.8d
    // double gpa = 3.8e4; //38000.0
    double gpa = 3.888888888888888888888888888889999999999 // 3.888888888888889 truncated
    //double has precision of 15 and it gets rounded
    // float gpa = 3.888888888888888888888888888889999999999f //3.8888888

    void compute() {
        int nextId = id + 1;

        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("rank: " + rank);
        System.out.println("phone: " + phone);
        System.out.println("gpa: " + gpa);

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}