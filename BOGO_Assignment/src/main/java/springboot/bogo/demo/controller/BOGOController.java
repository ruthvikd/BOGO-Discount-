package springboot.bogo.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.bogo.demo.services.BOGOResponse;
import springboot.bogo.demo.services.BOGOService;

@RestController
@RequestMapping("/api/bogo")
public class BOGOController {
@Autowired
private BOGOService bogoService;
@PostMapping("/calculate")
 public BOGOResponse calculateDiscounts(@RequestBody List<Integer> prices) {
	        return bogoService.calculateDiscounts(prices);
	    }
}
