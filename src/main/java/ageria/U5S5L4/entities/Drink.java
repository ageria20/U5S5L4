package ageria.U5S5L4.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("drink")
public class Drink extends Product{
    private double lt;

    public Drink(String description, double price, int kcals, double lt) {
        super(price, description, kcals);
        this.lt = lt;
    }



    public double getLt() {
        return lt;
    }

    public void setLt(double lt) {
        this.lt = lt;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "lt=" + lt +
                '}';
    }
}
