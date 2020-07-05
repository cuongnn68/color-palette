package cuongnn68.color.palette.controller;

import cuongnn68.color.palette.service.ColorPaletteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Controller
public class BasicController {
    @RequestMapping(value = {"", "/","/index","/home"})
    public String showIndex() {
        return "home";
    }

    @RequestMapping(value = "/getPalette", method = RequestMethod.POST)
    public String showImage(Model model, @RequestParam("image") MultipartFile file) throws Exception {
        ColorPaletteService.getPalette(file);
        model.addAttribute("image",file);
        return "image";
    }

}
