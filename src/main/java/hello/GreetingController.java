package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

  // annotation ensures HTTP requests to /greeting map to this method
  // add method=GET or similar to narrow mapping to specific verbs
  // @RequestParam binds value of query String param to name param of greeting
  @RequestMapping("/greeting")
  public String greeting( @RequestParam(value="name", required=false, defaultValue="World")
    String name, Model model ) {
    // value of name is added to a Model, to make available to View template
    model.addAttribute( "name", name );
    return "greeting";
  }
}
