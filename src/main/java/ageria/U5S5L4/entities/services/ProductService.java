package ageria.U5S5L4.entities.services;

import ageria.U5S5L4.entities.Drink;
import ageria.U5S5L4.entities.Product;
import ageria.U5S5L4.entities.exceptions.NotFoundExceptionName;
import ageria.U5S5L4.entities.exceptions.NotFoundExceptionById;
import ageria.U5S5L4.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product newProduct){
        productRepository.save(newProduct);
    }

    public Product findById(long id){
        return productRepository.findById(id).orElseThrow(() -> new NotFoundExceptionById(id));
    }

    public void findByIdAndUpdate(long id, String name){
        Product found = this.findById(id);
        found.setDescription(name);
        productRepository.save(found);
        System.out.println("Prodotto con id: " + id + " e nome: " + name +  " e' stato asggiornato");
    }

    public Product findyProductByName(String name){
        return productRepository.findByDescription(name);
    }


    public List<Drink> getDrinkByLt(double lt){
        return productRepository.findDrinkByLt(lt);
    }
}
