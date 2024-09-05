package ageria.U5S5L4;


import ageria.U5S5L4.entities.Drink;
import ageria.U5S5L4.entities.Pizza;
import ageria.U5S5L4.entities.Tavolo;
import ageria.U5S5L4.entities.Topping;
import ageria.U5S5L4.enums.TableStatus;
import ageria.U5S5L4.entities.*;
import ageria.U5S5L4.enums.StatoOrdine;
import ageria.U5S5L4.enums.TableStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    public Topping margherita(){
        return  new Topping("margherita", 10, 0.00);
    }

    @Bean(name="prosciutto")
    public Topping getProsciutto(){
        return new Topping("prosciutto", 20, 0.5);
    }

    @Bean(name="wrustel")
    public Topping getWrustel(){
        return new Topping("Wrustel", 20, 0.5);
    }

    @Bean(name="tonnoCipolla")
    public Topping getTonnoCipolla(){
        return new Topping("Tonno e cipolla", 20, 0.5);
    }

    @Bean(name="pinkPizza")
    public Pizza getPinkPizza(){
        return new Pizza( 5, "Pink Pizza", 600, List.of(getProsciutto(), margherita()));
    }

    @Bean(name="coke")
    public Drink getCoke(){
        return new Drink("Coke", 2, 11, 0.33);
    }

    @Bean(name="pizzaWrustel")
    public Pizza getPizzaWrustel(){
        return new Pizza(6.99, "Wrustellara", 900, List.of(getWrustel(),margherita()));
    }

    @Bean(name="pizzaTonnoCipolla")
    public Pizza getPizzaTonnoCipolla(){
        return new Pizza(6.50, "Tonno e Cipolla", 800, List.of(getTonnoCipolla(), margherita()));
    }


    @Bean(name="fanta")
    public Drink getFanta(){
        return new Drink("Fanta", 3, 15, 0.33);
    }

    @Bean(name="beer")
    public Drink getBeer(){
        return new Drink("Ichnusa non filtrata", 5, 25, 0.5);
    }



    @Bean
    @Primary
    public Tavolo tb1(){
        return new Tavolo(1, TableStatus.LIBERO, 2);
    }
    @Bean
    public Tavolo tb2(){
        return new Tavolo(2, TableStatus.LIBERO, 6);
    }
    @Bean
    public Tavolo tb3(){
        return new Tavolo(3, TableStatus.OCCUPATO, 8);
    }



}
