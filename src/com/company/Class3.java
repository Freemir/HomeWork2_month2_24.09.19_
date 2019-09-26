package com.company;

public class Class3 extends Class1 implements Printable{
    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public Class3(String name, int anInt) {
        setName(name);
        this.anInt = anInt;
    }

    @Override
    public void print() {
        System.out.println(getName() + " int number " + getAnInt());
    }
}
