package com.company;

public class Level_1 {
    private String string;
    private int number;
    private EnumVariable enumVariable;
    private Variable variable;

    public String getString() {
        return string;
    }

    public int getNumber() {
        return number;
    }

    public EnumVariable getEnumVariable() {
        return enumVariable;
    }

    public Variable getVariable() {
        return variable;
    }

    public Level_1(String string, int number, EnumVariable enumVariable, Variable variable) {
        this.string = string;
        this.number = number;
        this.enumVariable = enumVariable;
        this.variable = variable;
    }
}
