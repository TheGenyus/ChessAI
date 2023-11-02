package Model;

public class Board {
    public int [][] boardTab = new int[8][8];

    public Board()
    {
        for(int x = 0 ; x < 8 ; x++)
        {
            for(int y = 0 ; y < 8 ; y++)
            {
                this.boardTab[x][y] = 0;
            }
        }
    }
}
