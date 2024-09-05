package ageria.U5S5L4.entities.services;

import ageria.U5S5L4.entities.Product;
import ageria.U5S5L4.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product newProduct){
        productRepository.save(newProduct);
    }
}
