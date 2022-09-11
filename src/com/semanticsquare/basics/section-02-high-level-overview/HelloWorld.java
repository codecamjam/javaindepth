
/*
	Originally, we had a file named HelloWorld.java with: class HelloWorld {
	When we ran: javac HelloWorld.java, it created HelloWorld.class
	Then we ran: java HelloWorld and the program ran

	But then he explained that if you rename the class to: Class HelloWorld1 {

	If you follow the same steps, you will see HelloWorld1.class generated

	Case in point: the filename HelloWorld.java did not have to match class HelloWorld1

	BUT.....
	
	If you put the public modifier in front:
	public class HelloWorld1 {
	then you must name the file HelloWorld1.java to match the class name

	Hence we renamed the class back to HelloWorld

	If you have 2 classes in same file, only one class can have public modifier
    Now when I run javac HelloWorld.java, I get: GoodBye.class  HelloWorld.class
*/
public class HelloWorld {
    // if you want to run a program from the cmd line, you need a main metho
	public static void main(String[] args) {
		System.out.println("HelloWorld!");
	}
}

// class GoodBye {
// 	public static void main(String[] args) {
// 		System.out.println("GoodBye!");
// 	}
// }