package ageria.U5S5L4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("pizza")
public class Pizza extends Product{



    @OneToMany(mappedBy = "pizzaId")
    private List<Topping> topping;

    public Pizza(){
        super();
    }

    public Pizza(double price, String description, int kcals, List<Topping> topping) {
        super(price, description, kcals);
        this.topping = topping;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + topping +
                '}';
    }
}
