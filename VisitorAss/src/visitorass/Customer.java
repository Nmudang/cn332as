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
abstract class Customer {

    public String name;
    
    public Customer(String name){
        this.name = name;
    }

    public abstract void Accept(Taxi taxi);
    public abstract String type();

    public String toString() {
        return name;
    }
}
