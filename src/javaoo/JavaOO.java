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
public class JavaOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("ola mundo");
        
        Ball b  = new Ball();
        b.name = "celso";
        b.kick();
        
        Person p = new Person();
        p.name = "Celso";
        p.age = 32;
        p.cpf = "33046791895";
        p.say();
        
        System.out.println(p.name);
        System.out.println(Person.walk());
        
    }
    
}
