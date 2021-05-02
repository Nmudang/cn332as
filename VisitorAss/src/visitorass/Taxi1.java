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
public class Taxi1 extends Taxi{

    @Override
    public void VisitCustomer(CustomerWoman customer) {
        System.out.println("customer "+customer.toString() + "("+customer.type() + ")"+ " has been visietd by taxi1");
                
    }

    @Override
    public void VisitCustomer(CustomerMan customer) {
        System.out.println("customer "+customer.toString() + "("+customer.type() + ")"+ " has been visietd by taxi1");
    }
    
}
