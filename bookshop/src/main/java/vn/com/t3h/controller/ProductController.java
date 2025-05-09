package vn.com.t3h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.com.t3h.Dao.ListProduct;
import vn.com.t3h.model.Product;


@Controller
public class ProductController {
  private ListProduct listProduct = new ListProduct();

  @GetMapping("/production-detail")
  public String detail(@RequestParam("id") int id, Model model) {
    Product product = null;
    for(Product p : listProduct.getProducts()){
      if(p.getId() == id){
        product = p;
        break;
      }
    }
    if(product == null){
      return "error";
    }
    model.addAttribute("product", product);

    return "production-detail";
  }
}
