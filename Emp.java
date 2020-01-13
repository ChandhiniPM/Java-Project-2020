/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codecademy;

/**
 *
 * @author USER1
 */
 class Emp {
    static private int id;
    static private String name;
    static class Manager
    {
       static void display()
        {
            System.out.println("ID: "+id+" "+"Name: "+name); 
        }
    }
    
    public static void main(String args[])
    {
//        Emp.Manager em=new Emp.Manager();
//        em.display();
        Emp.Manager.display();
    }
}
