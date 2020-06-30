package cuongnn68.color.palette;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
    @RequestMapping(value = {"", "/","/index","/home"})
    public String showIndex() {
        return "home";
    }
}
