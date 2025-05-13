package vn.com.t3h.service;

import java.util.List;
import vn.com.t3h.model.Product;

public interface ProductionService {
  public List<Product> getProducts();
  public Product getProduct(int id);

}
