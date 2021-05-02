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
public abstract class Taxi
{
    public Taxi()
    {

    }

    public abstract void VisitCustomer(CustomerWoman customerWoman);
    public abstract void VisitCustomer(CustomerMan customerMan);
  //  public abstract void VisitCustomer(Customer richCustomer);
}
