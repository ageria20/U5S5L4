package ageria.U5S5L4.entities;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

public class Topping extends Product{

    @ManyToOne
    @JoinColumn(name = "pizzaId")
    private Pizza pizzaId;

    public Topping(String description, int kcals, double price) {
        super(price, description, kcals);

    }




    @Override
    public String toString() {
        return "Topping{" +

                '}';
    }
}
