package com.semanticsquare.basicstest;

import java.util.ArrayList;
import com.semanticsquare.basics.BasicsDemo;

/*
    SO I MADE A NEW FOLDER basicsTest and placed this file in there
    My CLASSPATH envar is not set.

    I ran javac BasicsDemoTest.java and got this error:
    javac BasicsDemoTest.java   

    BasicsDemoTest.java:4: error: package com.semanticsquare.basics does not exist
    import com.semanticsquare.basics.BasicsDemo;
                                    ^
    BasicsDemoTest.java:8: error: cannot find symbol
            new BasicsDemo().foo();
                ^
    symbol:   class BasicsDemo
    location: class BasicsDemoTest
    2 errors

    -----------------------------------------

    says it cannot import BasicsDemo 
    so it cannot locate this classfile
    because its not in the classpath

    So it is trying to compile 
    com.semanticsquare.basics.BasicsDemo.java file 
    but when it is trying to compile. it encounters
    the statement:
    import com.semanticsquare.basics.BasicsDemo;

    but it cant locate it in CLASSPATH

    So it will look in the current directory (basicsTest)
    and try to find that directory structure 
    (/com/semanticsquare/basics/BasicsDemo) in there

    so even if we have
    set classpath=C:\dheeru this wont work cuz it doesnt
    have that this particular dir structure.

    it is only inside javaindepth/src so if that is there, then it would work
    cuz then it would be able to find BasicsDemo class in that directory 

    --------------------------------------

    NOTICE WE DID NOT HAVE AN ISSUE IMPORTING ARRAY LIST

    that is because that belongs to the java library
    so to locate the classes in the java library, it does not 
    make use of classpath, but user defined classes or sometimes
    we may download some 3rd party java libraries, those
    have to go into classpath

    TLDR: classpath is for locating class files and those class files
    are user defined class files.






*/

public class BasicsDemoTest {
    public static void main(String[] args) {
        new BasicsDemo().foo();
    }
}