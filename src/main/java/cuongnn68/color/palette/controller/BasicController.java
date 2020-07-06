package cuongnn68.color.palette.controller;

import cuongnn68.color.palette.service.ColorPaletteService;
import cuongnn68.color.palette.service.ColorThiefService;
import de.androidpit.colorthief.ColorThief;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Controller
public class BasicController {

    @Autowired
    ColorThiefService colorThiefService;

    @RequestMapping(value = {"", "/","/index","/home"})
    public String showIndex() {
        return "home";
    }

    @RequestMapping(value = "/getPalette", method = RequestMethod.POST)
    public String showImage(Model model, @RequestParam("image") MultipartFile file) throws Exception {
//        ColorPaletteService.getPalette(file);
        System.out.println("Color: ");

        int[][] colorPalate = colorThiefService.getPalette((file));
        for(int[] color : colorPalate) {
            System.out.printf("%X%X%X\n",color[0],color[1],color[2]);
        }
        model.addAttribute("image",file);
        return "image";
    }

}
