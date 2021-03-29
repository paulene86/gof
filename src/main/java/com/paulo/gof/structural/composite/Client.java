package com.paulo.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main (String args[]){

        //children
        File file1 = new File();
        file1.setName("apuntes.txt");
        File file2 = new File();
        file2.setName("denuncia.pdf");
        File file3 = new File();
        file3.setName("porno.mpeg4");
        File file4 = new File();
        file4.setName("cuentas.xls");

        //Directories
        Directory directory1 = new Directory();
        directory1.setName("directory1");
        List<Component> children0 = new ArrayList<>();
        children0.add(file1);
        children0.add(file2);
        children0.add(file3);
        directory1.setChildren(children0);

        Directory mainDirectory = new Directory();
        mainDirectory.setName("mainDirectory");

        List<Component> children1 = new ArrayList<>();
        children1.add(directory1);
        children1.add(file4);

        mainDirectory.setChildren(children1);

        mainDirectory.printName();



    }
}
