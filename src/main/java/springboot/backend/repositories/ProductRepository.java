package springboot.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import springboot.backend.entities.Product;

@CrossOrigin(origins = "http://127.0.0.1:5173")
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository <Product, Long> {
}
