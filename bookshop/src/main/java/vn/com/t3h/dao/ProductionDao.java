package vn.com.t3h.dao;

import java.util.List;
import vn.com.t3h.model.Product;

public interface ProductionDao {
  public List<Product> getAll();
  public Product getProductById(int id);

}
