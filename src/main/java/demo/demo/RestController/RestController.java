package demo.demo.RestController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class RestController {
    //@RequestMapping maps all HTTP operations(GET, POST, PUT)
    @RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
    
}
