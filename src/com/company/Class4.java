package com.company;

public class Class4 extends Class1 implements Printable{
    private long aLong;

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public Class4(String name, long aLong) {
        setName(name);
        this.aLong = aLong;
    }

    @Override
    public void print() {
        System.out.println(getName() + " long number " + getaLong());
    }
}
