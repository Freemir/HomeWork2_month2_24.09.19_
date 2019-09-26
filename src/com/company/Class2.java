package com.company;

public class Class2 extends Class1 implements Printable{
    private short aShort;

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public Class2(String name, short aShort) {
        setName(name);
        this.aShort = aShort;
    }

    @Override
    public void print() {
        System.out.println(getName() + " short number " + getaShort());
    }
}
