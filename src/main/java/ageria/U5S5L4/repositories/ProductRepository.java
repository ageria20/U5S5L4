package ageria.U5S5L4.repositories;

import ageria.U5S5L4.entities.Drink;
import ageria.U5S5L4.entities.Product;
import ageria.U5S5L4.entities.Topping;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



    Product findByDescription(String description);

    @Query("SELECT d FROM Drink d WHERE d.lt = :lt")
    List<Drink> findDrinkByLt(double lt);

    boolean existsByDescription(String description);


}