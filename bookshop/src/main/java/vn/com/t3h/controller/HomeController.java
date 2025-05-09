package vn.com.t3h.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.t3h.Dao.ListProduct;
import vn.com.t3h.model.Product;

@Controller
public class HomeController {
  ListProduct listProduct = new ListProduct();
  @RequestMapping("/home")
  public String hello(Model model) {
    List<Product> list = listProduct.getProducts();
    model.addAttribute("listProduct", list);
    return "home";
  }
}


