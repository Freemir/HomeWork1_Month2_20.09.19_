package com.company;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Level_2 objectA = new Level_2("Word1", 1, EnumVariable.ENUM_VARIABLE_1, new Variable(1.1, 1.2f));
        System.out.println(ANSI_RED + objectA.getString() + " " + objectA.getNumber() + " " + objectA.getEnumVariable() + " " + objectA.getVariable().getaDouble() + " " + objectA.getVariable().getaFloat() + ANSI_RESET);
        Level_3 objectB = new Level_3("Word2", 2, EnumVariable.ENUM_VARIABLE_2, new Variable(2.01, 3.02f));
        System.out.println(ANSI_GREEN + objectB.getString() + " " + objectB.getNumber() + " " + objectB.getEnumVariable() + " " + objectB.getVariable().getaDouble() + " " + objectB.getVariable().getaFloat() + ANSI_RESET);
        Level_3 objectC = new Level_3("Word3", 3, EnumVariable.ENUM_VARIABLE_3, new Variable(3.001, 3.002f));
        System.out.println(ANSI_BLUE + objectC.getString() + " " + objectC.getNumber() + " " + objectC.getEnumVariable() + " " + objectC.getVariable().getaDouble() + " " + objectC.getVariable().getaFloat() + ANSI_RESET);
    }
}
