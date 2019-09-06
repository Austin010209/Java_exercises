public class PizzaTest
{
    public static void main(String[] args)
    {
        Pizza pyro = new Pizza("Cheese", 9.25);
        Pizza dominos = null;
        dominos = pyro;
        dominos.setPrice(12.5);
        double cost = pyro.getPrice();
        System.out.println("Cost of a pyro pizza: " + cost);
        dominos.setPrice(234.5);
        cost = dominos.getPrice();
        System.out.println("Cost of a pyro pizza: " + cost);
        System.out.println(pyro);
        System.out.println(dominos);
    }
}
