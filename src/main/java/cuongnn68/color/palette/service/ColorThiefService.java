package cuongnn68.color.palette.service;

import de.androidpit.colorthief.ColorThief;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;

@Service
public class ColorThiefService {
    public int[] getColor(MultipartFile file){
        try{
            BufferedImage image = getBufferImage(file);
            return ColorThief.getColor(image);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("image suck");
            return new int[]{};
        }
    }

    public int[][] getPalette(MultipartFile file) {
        try{
            BufferedImage image = getBufferImage(file);
            return ColorThief.getPalette(image,10);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("image suck");
            return new int[][]{};
        }
    }

    private BufferedImage getBufferImage(MultipartFile file) throws IOException {
        ImageInputStream imageStream = ImageIO.createImageInputStream(file.getInputStream());
        Iterator iteratorImage = ImageIO.getImageReaders(imageStream);

        if (!iteratorImage.hasNext())
        {
            System.out.println("Cannot load the specified file "+ file.getName());
            System.exit(1);
        }
        ImageReader imageReader = (ImageReader)iteratorImage.next();
        imageReader.setInput(imageStream);

        return imageReader.read(0);
    }

}
