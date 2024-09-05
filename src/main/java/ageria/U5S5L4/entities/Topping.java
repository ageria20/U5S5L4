package ageria.U5S5L4.entities;


public class Topping extends Product{



    public Topping(String description, int kcals, double price) {
        super(price, description, kcals);

    }




    @Override
    public String toString() {
        return "Topping{" +

                '}';
    }
}
