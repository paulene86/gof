package com.paulo.gof.structural.composite;


import java.util.List;


public class Directory implements Component{

    private String name;

    private List<Component> children ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    @Override
    public void printName() {
        System.out.println(name+"->");
        children.forEach(Component::printName);

    }
}
