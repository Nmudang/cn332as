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
public class CustomerMan extends Customer{

    public CustomerMan(String name) {
        super(name);
    }

    @Override
    public void Accept(Taxi taxi) {
        taxi.VisitCustomer(this);
    }

    
    public String type() {
        return "Man";
    }
    
}
