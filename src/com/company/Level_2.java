package com.company;

public class Level_2 extends Level_1{
    public Level_2(String string, int number, EnumVariable enumVariable, Variable variable) {
        super(string, number, enumVariable, variable);
    }

    void doSomething (){
        System.out.println("Write method");
    }

    void doSomething (String string){
        System.out.println("Get String" + string);
    }
    void doSomething (int number){
        System.out.println("Get Int" + number);
    }

    final void doSomething (String string, int number){
        System.out.println("Get String and Int " + string + " " + number);
    }
}
