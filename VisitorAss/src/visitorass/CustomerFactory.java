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
public class CustomerFactory {
    public static Customer customerWoman(String name){
        return new CustomerWoman(name);
    }
    
    public static Customer customerMan(String name){
        return new CustomerMan(name);
    }
    
}
