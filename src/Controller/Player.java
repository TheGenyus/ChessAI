package Controller;

import Model.Piece;
import Vue.Images;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private ArrayList<Piece> itsPieces;
    private ArrayList<Piece> itsDeadPieces;
    private final boolean white;
    private final Images itsImages;

    public Player(boolean white)
    {
        itsPieces = new ArrayList<Piece>();
        itsDeadPieces = new ArrayList<Piece>();
        itsImages = new Images();
        this.white = white;
        InitPiece();
    }

    private void InitPiece()
    {
        int cellHeight = 565 / 8;
        int cellWidth = 590 / 8;
        if(white)
        {
            itsPieces.add(new Piece(0, cellHeight * 6, itsImages.getPionBImage(), "p1"));
            itsPieces.add(new Piece(cellWidth, cellHeight * 6, itsImages.getPionBImage(), "p2"));
            itsPieces.add(new Piece(cellWidth * 2, cellHeight * 6, itsImages.getPionBImage(), "p3"));
            itsPieces.add(new Piece(cellWidth * 3, cellHeight * 6, itsImages.getPionBImage(), "p4"));
            itsPieces.add(new Piece(cellWidth * 4, cellHeight * 6, itsImages.getPionBImage(), "p5"));
            itsPieces.add(new Piece(cellWidth * 5, cellHeight * 6, itsImages.getPionBImage(), "p6"));
            itsPieces.add(new Piece(cellWidth * 6, cellHeight * 6, itsImages.getPionBImage(), "p7"));
            itsPieces.add(new Piece(cellWidth * 7, cellHeight * 6, itsImages.getPionBImage(), "p8"));

            itsPieces.add(new Piece(0, cellHeight * 7, itsImages.getTourBImage(), "t1"));
            itsPieces.add(new Piece(cellWidth * 7, cellHeight * 7, itsImages.getTourBImage(), "t2"));

            itsPieces.add(new Piece(cellWidth * 2, cellHeight * 7, itsImages.getFouBImage(), "f1"));
            itsPieces.add(new Piece(cellWidth * 5, cellHeight * 7, itsImages.getFouBImage(), "f2"));

            itsPieces.add(new Piece(cellWidth, cellHeight * 7, itsImages.getChevalBImage(), "c1"));
            itsPieces.add(new Piece(cellWidth * 6, cellHeight * 7, itsImages.getChevalBImage(), "c2"));

            itsPieces.add(new Piece(cellWidth * 4, cellHeight * 7, itsImages.getRoiBImage(), "ro"));
            itsPieces.add(new Piece(cellWidth * 3, cellHeight * 7, itsImages.getReineBImage(), "re"));
        }
        else
        {
            itsPieces.add(new Piece(0, cellHeight, itsImages.getPionNImage(), "p1"));
            itsPieces.add(new Piece(cellWidth, cellHeight, itsImages.getPionNImage(), "p2"));
            itsPieces.add(new Piece(cellWidth * 2, cellHeight, itsImages.getPionNImage(), "p3"));
            itsPieces.add(new Piece(cellWidth * 3, cellHeight, itsImages.getPionNImage(), "p4"));
            itsPieces.add(new Piece(cellWidth * 4, cellHeight, itsImages.getPionNImage(), "p5"));
            itsPieces.add(new Piece(cellWidth * 5, cellHeight, itsImages.getPionNImage(), "p6"));
            itsPieces.add(new Piece(cellWidth * 6, cellHeight, itsImages.getPionNImage(), "p7"));
            itsPieces.add(new Piece(cellWidth * 7, cellHeight, itsImages.getPionNImage(), "p8"));

            itsPieces.add(new Piece(0, 0, itsImages.getTourNImage(), "t1"));
            itsPieces.add(new Piece(cellWidth * 7, 0, itsImages.getTourNImage(), "t2"));

            itsPieces.add(new Piece(cellWidth * 2, 0, itsImages.getFouNImage(), "f1"));
            itsPieces.add(new Piece(cellWidth * 5, 0, itsImages.getFouNImage(), "f2"));

            itsPieces.add(new Piece(cellWidth, 0, itsImages.getChevalNImage(), "c1"));
            itsPieces.add(new Piece(cellWidth * 6, 0, itsImages.getChevalNImage(), "c2"));

            itsPieces.add(new Piece(cellWidth * 4, 0, itsImages.getRoiNImage(), "ro"));
            itsPieces.add(new Piece(cellWidth * 3, 0, itsImages.getReineNImage(), "re"));
        }
    }

    public void changePiece(String name, int x, int y)
    {
        for(Piece piece : itsPieces)
        {
            if(Objects.equals(piece.getItsName(), name))
            {
                piece.x = x;
                piece.y = y;
            }
        }
    }

    public String getPiece(int x, int y)
    {
        for(Piece piece : itsPieces)
        {
            if(x == piece.x && y == piece.y)
            {
                return piece.getItsName();
            }
        }
        return null;
    }

    public ArrayList<Piece> getItsPieces() {
        return itsPieces;
    }
}
