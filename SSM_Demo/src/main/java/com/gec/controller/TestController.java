package com.gec.controller;

import com.gec.domain.Product;
import com.gec.domain.User;
import com.gec.service.Impl.UserServiceImpl;
import com.gec.service.ProductService;
import com.gec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author mhh
 * 2020/8/15 0015 - 下午 3:57
 */
@Controller
public class TestController {

    @Autowired
    private ProductService ps;

    @RequestMapping("product")
    public String productList(Model model){
        List<Product> productList = ps.findAllProduct();
        model.addAttribute("productList", productList);

        return "productList";
    }

    @RequestMapping("/itemEdit.action/{id}")
    public String itemEdit(@PathVariable(value = "id") String id, Model model){
        Product product = ps.findProductById(Integer.parseInt(id));
        model.addAttribute("item", product);

        return "productItem1";
    }
}
