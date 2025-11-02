package warehouse.ssa.interfaces.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/ping")
    public String getPing() {return "Hello World from Products!";}
}
