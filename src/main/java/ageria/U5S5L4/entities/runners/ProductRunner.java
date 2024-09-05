package ageria.U5S5L4.entities.runners;


import ageria.U5S5L4.ProductConfig;
import ageria.U5S5L4.entities.Drink;
import ageria.U5S5L4.entities.Pizza;
import ageria.U5S5L4.entities.Topping;
import ageria.U5S5L4.entities.exceptions.ValidationException;
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
    private Topping prosciutto;

    @Autowired
    private Topping margherita;
    @Autowired
    private Topping wrustel;

    @Autowired
    private Topping tonnoCipolla;

    @Autowired
    private Pizza pinkPizza;

    @Autowired
    private Pizza pizzaTonnoCipolla;

    @Autowired
    private Pizza pizzaWrustel;

    @Autowired
    private Drink beer;

    @Autowired
    private Drink coke;

    @Autowired
    private Drink fanta;

    @Override
    public void run(String... args) throws Exception {

//        ps.saveProduct(margherita);
//        ps.saveProduct(prosciutto);
//        ps.saveProduct(wrustel);
//        ps.saveProduct(tonnoCipolla);
//
//        ps.saveProduct(pinkPizza);
//        ps.saveProduct(pizzaWrustel);
//        ps.saveProduct(pizzaTonnoCipolla);
//
//
//        ps.saveProduct(beer);
//        ps.saveProduct(coke);
//        ps.saveProduct(fanta);

        // Trova tutti i prodotti che corrispondono alla descrizione data
        System.out.println(ps.findyProductByName("margherita"));


        ps.getDrinkByLt(0.33).forEach(System.out::println);

        ps.findByIdAndUpdate(3, "CipoTonno");



    }
}
