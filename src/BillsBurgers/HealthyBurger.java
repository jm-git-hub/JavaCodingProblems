package BillsBurgers;
/*
And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price.
The names are type String and the prices are type double. The constructor for this class accepts two(2) parameters for meat and price.
Those are set in the constructor along with an appropriate name for the type of burger.
 */
public class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown rye");
    }

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;

    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger(){
        double burgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null){
            burgerPrice+=this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null){
            burgerPrice+=this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return burgerPrice;
    }
}
