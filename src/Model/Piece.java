package Model;

import java.awt.image.BufferedImage;

public class Piece {
    public int x;
    public int y;
    private BufferedImage itsImage;
    private String itsName;

    public Piece(int x, int y, BufferedImage image, String name)
    {
        this.x = x;
        this.y = y;
        itsImage = image;
        itsName = name;
    }

    public BufferedImage getItsImage() {
        return itsImage;
    }

    public String getItsName() {
        return itsName;
    }
}
