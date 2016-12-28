/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo;

/**
 *
 * @author Celso André
 */
public class Person {
    public String name;
    public Integer age;
    public String cpf;

    public Person() {
    }
    
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    
    public void say(){
        System.out.println("andando muito");
    }
    public void run(){
        
    }
    
    public static String walk(){
        return "i'm Walking!";
    }
    
}
