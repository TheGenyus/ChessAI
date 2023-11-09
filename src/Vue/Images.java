package Vue;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Images {
    private final BufferedImage pionBImage;
    private final BufferedImage pionNImage;
    private final BufferedImage tourBImage;
    private final BufferedImage tourNImage;
    private final BufferedImage reineBImage;
    private final BufferedImage reineNImage;
    private final BufferedImage roiBImage;
    private final BufferedImage roiNImage;
    private final BufferedImage fouBImage;
    private final BufferedImage fouNImage;
    private final BufferedImage chevalBImage;
    private final BufferedImage chevalNImage;

    public Images()
    {
        pionBImage = loadImage("ressources/pionB.png");
        pionNImage = loadImage("ressources/pionN.png");
        tourBImage = loadImage("ressources/tourB.png");
        tourNImage = loadImage("ressources/tourN.png");
        fouBImage = loadImage("ressources/fouB.png");
        fouNImage = loadImage("ressources/fouN.png");
        roiBImage = loadImage("ressources/roiB.png");
        roiNImage = loadImage("ressources/roiN.png");
        reineBImage = loadImage("ressources/reineB.png");
        reineNImage = loadImage("ressources/reineN.png");
        chevalBImage = loadImage("ressources/chevalB.png");
        chevalNImage = loadImage("ressources/chevalN.png");
    }

    public static BufferedImage loadImage(String filePath) {
        try {
            return ImageIO.read(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public BufferedImage getPionBImage() {
        return pionBImage;
    }

    public BufferedImage getPionNImage() {
        return pionNImage;
    }

    public BufferedImage getTourBImage() {
        return tourBImage;
    }

    public BufferedImage getTourNImage() {
        return tourNImage;
    }

    public BufferedImage getReineBImage() {
        return reineBImage;
    }

    public BufferedImage getReineNImage() {
        return reineNImage;
    }

    public BufferedImage getRoiBImage() {
        return roiBImage;
    }

    public BufferedImage getRoiNImage() {
        return roiNImage;
    }

    public BufferedImage getFouBImage() {
        return fouBImage;
    }

    public BufferedImage getFouNImage() {
        return fouNImage;
    }

    public BufferedImage getChevalBImage() {
        return chevalBImage;
    }

    public BufferedImage getChevalNImage() {
        return chevalNImage;
    }
}
