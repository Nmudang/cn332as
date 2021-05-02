/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorass;

/**
 *
 * @author User
 */
public class VisitorFactory
{
    public static Taxi taxi1(){
        return new Taxi1();
    }
    
    public static Taxi taxi2(){
        return new Taxi2();
    }
}

