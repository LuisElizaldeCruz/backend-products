package springboot.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springboot.backend.entities.Product;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository <Product, Long> {
}
