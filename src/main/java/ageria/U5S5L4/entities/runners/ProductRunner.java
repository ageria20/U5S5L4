package ageria.U5S5L4.entities.runners;


import ageria.U5S5L4.ProductConfig;
import ageria.U5S5L4.entities.Drink;
import ageria.U5S5L4.entities.Pizza;
import ageria.U5S5L4.entities.Topping;
import ageria.U5S5L4.entities.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {




    @Autowired
    private ProductService ps;

    @Autowired
    private ProductConfig pc;


    @Override
    public void run(String... args) throws Exception {

        Pizza pinkPizza = pc.getPinkPizza();
        Pizza wrustelPizza = pc.getPizzaWrustel();
        Pizza pizzaTonnoCipolla = pc.getPizzaTonnoCipolla();

        Topping margherita = pc.margherita();
        Topping prosciutto = pc.getProsciutto();
        Topping wrustel = pc.getWrustel();
        Topping tonnoCipolla = pc.getTonnoCipolla();

        Drink beer = pc.getBeer();
        Drink coke = pc.getCoke();
        Drink fanta = pc.getFanta();

        

    }
}
