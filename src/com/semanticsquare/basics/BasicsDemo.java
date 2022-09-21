package com.semanticsquare.basics;

/*
	
	So if I navigate to the following directory:
	javaindepth/src/com/semanticsquare/basics

	and run java BasicsDemo - compiles and gives me BasicsDemo.class
	and then run javac BasicsDemo.java - ERROR
	I get an error because I have
	"package com.semanticsquare.basics;" at the top.
	So instead I would navigate to 
	javaindepth/src/
	and now execute this command:
	java com.semanticsquare.basics.BasicsDemo
	and it works prints WOW

	under the hood, what the java interpretor is doing is it 
	checks if the env var classpath has been set or not
	so in the 2nd chapter we looked at classpath envar
	and we said a classpath envar is specific to java.

	It is used for locating class files, used both by java compiler
	and the JVM (interpretor) so thats the first thing it does
	is it checks whether or not there is a classpath envar.

	PATH AND CLASSPATH ARE DIFFERENT!

	Path is a generic thing, its also an envar. its useful
	for running the executables itself.
	so if you want to execute the javac and java commands,
	then those executables should be located from one of the paths
	in the path envar.

	But classpath is just specific to java and its for locating classfiles
	for the jvm and java compiler.

	in this example, jvm is trying to locate this particular classfile,
	BasicsDemo.class

	The first thing that happens is it checks if the classpath has been set or not.

	if classpath envar hasnt been set, since this command is run/executed in the src directory, 

	jvm will check within this directory src if it has this directory structure.
	so its going to check src if it has this structure which would have class BasicsDemo
	(src/com/semanticsquare/basics/BasicsDemo)

	and it does that in whatever current directory the java command is being executed.

	That is when the classpath is not there.

	he does this: set classpath 
	and its filled with all kinds of stuff
	BUT HE IS ON WINDOWS

	A UNIX BASED MACHINE LIKE MAC OR UBUNTU, THEN THE COMMAND IS:
	echo ${CLASSPATH}

	Below command are specific to Linux & Mac OS. You can also once again view the
	lecture titled Setting Classpath Environment Variable in Section 2 to see the
	process on Mac OS and it would be quite similar on Linux too.
	1. View existing classpath
	echo ${CLASSPATH}
	2. Set classpath
	export CLASSPATH=<sequence of paths>
	For <sequence of paths>, on Linux you may have to set it as follows.
	.:/root/javaindepth/src
	For <sequence of paths>, on Mac OS you may have to set it as follows.
	.:/Users/admin/javaindepth/src 

	ANYWAYS, BACK TO THE LECTURE!!!!!!!!!!!!!!!

	In his case, he has the classpath set (he's on windows)

	So classpath is there, so what jvm is going to do is look
	at each path in the classpath and scan classpath value
	and it will check each of these paths in it and see if 
	it can locate src/com/semanticsquare/basics/

	IMPORTANT: . means current path

	So in his classpath he has:  .:C\Users\dheeru\.m2\repository\yadayadayada

	JVM will see a dot and check the current directory src and if the BasicsDemo is
	part of that directory structure


	SO IF CLASSPATH HAS NOT BEEN SET (MINE HAS NOT BEEN SET)
	then it also looks in the current directory.  

	But for his case, he has a dot up front, thats why his classpath found that directory
	structure

	THIS COMMAND CLEARS THE CLASS PATH FOR THE CURRENT TERMINAL SESSION:
	classpath= 

	ON UNIX, YOU WOULD DO THIS:
	export CLASSPATH=.:root/javaindepth/src

	DOT . only works if we are running from src
	cuz it has the desired directory structure.

	---------------------------------------------

	java com.semanticsquare.basics.BasicsDemo

	Now let's say I want to execute this command successfully
	from anywhere on my machine, then i  would have to 

	set the classpath up until /src 

	SO FOR THIS DIRECTORY, I CAN RUN THIS COMMAND:
	javac -classpath ~/Desktop/javaindepth/src/ BasicsDemoTest.java

	AND IT WORKED!

	but setting classpath like that is not permanent
	It is only for that command



	-------------------------------------

	TO COMPILE ALL JAVA FILES IN SECTION-03-04-05 DIRECTORY:
	navigate to that directory and run:
	*.java
*/

public class BasicsDemo {

	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
		System.out.println();                 // Print empty line
		System.out.print("Hello, world!!");   // Cursor stayed after the printed string
		System.out.println("Hello,");
		System.out.print(" ");                // Print a space
		System.out.print("world!!");
	}

	static void primitives() {
		System.out.println("\n\nInside primitives ..."); 
		// literals demo
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intChar = 'A'; // holds decimal equivalent, which is 65
		System.out.println("intChar: " + intChar);
		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore: " + intUnderscore);
		
		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; // binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);	  		  	  
	}

	static void typeCasting() {
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		//int x = y;
		int x = (int)y;
		
		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte)123456;
		System.out.println("narrowdByte: " + narrowdByte); 
		
		// Truncation
		int iTruncated = (int)0.99;
		System.out.println("iTruncated: " + iTruncated); 
		
		// Implicit cast (int to long)
		y = x;
		
		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar; 
		System.out.println("iInt: " + iInt);
		
		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
		System.out.println("cChar: " + cChar);
	}

	static void arrays() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
		System.out.println("myArray.length: " + myArray.length);
		System.out.println("myArray[1]: " + myArray[1]);
		System.out.println("myArray[7]: " + myArray[7]);	   
	}

	static void threeDimensionalArrays() {
		System.out.println("\nInside threeDimensionalArrays ...");
		int[][][] unitsSold = new int[][][]{ 
											{ // New York
												{0,0,0,0}, // Jan
												{0,0,0,0}, // Feb
												{0,0,0,0}, // Mar
												{0,850,0,0}// Apr	
											},
											{ // San Francisco
												{0,0,0,0}, // Jan
												{0,0,0,0}, // Feb
												{0,0,0,0}, // Mar
												{0,0,0,0}  // Apr
											},
											{ 
												{0,0,0,0},
												{0,0,0,0},
												{0,0,0,0},
												{0,0,0,0}
											},
											{
												{0,0,0,0},
												{0,0,0,0},
												{0,0,0,0},
												{0,0,0,0}
											}
											};
									
		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}	

	static void varargsOverload(boolean b, int i, int j, int k){
		System.out.println("\nInside varargsOverload without varargs ...");
	}
	static void varargsOverload(boolean b, int... list){
		System.out.println("\nInside varargsOverload with varargs ...");
		System.out.println("list.length: " + list.length);
	}	

	static void charTypePromotion() {
		System.out.println("\nInside charTypePromotion ...");
		char char1 = 50; // Will be assigned corresponding UTF16 value 2
		System.out.println("char1: " + char1); 
		System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
		System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
		System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
	}

	static void bitwiseOperators() {
		System.out.println("\nInside bitwiseOperators ...");
		int x = 1;
		int y = 3;
		
		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));
			
		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal		
		
		// Since bitwise work only on Integer types, following will not compile
		//double d1 = 3.14;
		//double d2 = 5.15;
		//System.out.println("d1 | d2: " + (d1 | d2));
	}

	static void switchExample() {
		System.out.println("\nInside switchExample ...");
		int month = 3;
		switch (month) {
			case 1: System.out.println("January");
					break;
			case 2: System.out.println("February");
					break;
			case 3: System.out.println("March");
					break;
			default: System.out.println("April");
		}
	}

	static void labeledBreak() {
		System.out.println("\nInside labeledBreak ...");
		int num = 0;
		
		outermost: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {    
				if (i == 5 && j == 5) {
					break outermost;
				}
				num++;
			}
		}
		
		System.out.println("num: " + num); // prints 55		
	}

	static void labeledContinue() {
		System.out.println("\nInside labeledContinue ...");
		int num = 0;
		
		outermost: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {    
				if (i == 5 && j == 5) {
					continue outermost;
				}
				num++;
			}
		}
		
		System.out.println("num: " + num); // prints 55		
	}

	public void foo() {
		System.out.println("Inside foo ...");
	}
		
	public static void main(String[] args) {
		System.out.println("WOW");
	}       
}