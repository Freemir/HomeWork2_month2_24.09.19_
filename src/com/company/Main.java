package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("class2").print();
        createObject("class3").print();
        createObject("class4").print();
    }



    private static Printable createObject(String className) {
        Printable returnClass = null;
        switch (className){
            case "class2":
                returnClass = new Class2("Class2", (short)2);
                break;
            case "class3":
                returnClass = new Class3("Class3", 3);
                break;
            case "class4":
                returnClass = new Class4("Class4", 4);
                break;
        }
        return returnClass;
    }
}
