package com.andy.junittest.privatemocking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;

import javax.activation.FileDataSource;

public class PrivateMethodDemo {
	public String say(String name) {
        return sayIt(name);
    }

    public String enhancedSay(String firstName, String lastName) {
        return sayIt(firstName, " ", lastName);
    }

    public String sayYear(String name, int years) {
        return doSayYear(years, name);
    }

    private String doSayYear(int years, String name) {
        return "Hello " + name + ", you are " + years + " old.";
    }

    private String sayIt(String firstName, String spacing, String lastName) {
        return "Hello" + firstName + spacing + lastName;
    }

    private String sayIt(String name) {
        return "Hello " + name;
    }

    @SuppressWarnings("unused")
    private String sayIt() {
        return "Hello world";
    }

    public int methodCallingPrimitiveTestMethod() {
        return aTestMethod(10);
    }

    public int methodCallingWrappedTestMethod() {
        return aTestMethod(new Integer(15));
    }

    private int aTestMethod(int aValue) {
        return aValue;
    }

    private Integer aTestMethod(Integer aValue) {
        return aValue;
    }

    public void doArrayStuff(String v) {
        doArrayInternal(new String[]{v});
    }

    private void doArrayInternal(String[] strings) {
    }

    public void doObjectStuff(Object o) {
        doObjectInternal(o);
    }

    private void doObjectInternal(Object o) {
    }

    public int invokeVarArgsMethod(int a, int b) {
        return varArgsMethod(a, b);
    }

    private int varArgsMethod(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    private Reader createReader(File folder, FileDataSource fileDataSource) throws FileNotFoundException {
        return null;
    }
}
