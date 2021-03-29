package com.paulo.gof.structural.composite;

public class File implements Component{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName() {

        System.out.println(name);

    }
}
