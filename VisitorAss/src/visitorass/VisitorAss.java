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
public class VisitorAss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi t1 = VisitorFactory.taxi1();
        Taxi t2 = VisitorFactory.taxi2();
        Customer c1 = CustomerFactory.customerWoman("Wonie");
        c1.Accept(t1);
        Customer c2 = CustomerFactory.customerMan("Wonwoo");
        c2.Accept(t1);
        Customer c3 = CustomerFactory.customerWoman("Minnie");
        c3.Accept(t2);
        Customer c4 = CustomerFactory.customerMan("Mingyu");
        c4.Accept(t2);
    }
    
}
