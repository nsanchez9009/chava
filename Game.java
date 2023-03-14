// Create board method.
// print board method.
// print pieces method.

public class Game
{
    public void newGame()
    {
        char [][] board = new char[8][8];

        char [] blackPieces = {
            '\u265c',
            '\u265e',
            '\u265d',
            '\u265b',
            '\u265a',
            '\u265d',
            '\u265e',
            '\u265c',
            '\u265f','\u265f','\u265f','\u265f','\u265f','\u265f','\u265f','\u265f'
        };
        
        
        char [] whitePieces = {
            '\u2659','\u2659','\u2659','\u2659','\u2659','\u2659','\u2659','\u2659',
            '\u2656',
            '\u2658',
            '\u2657',
            '\u2654',
            '\u2655',
            '\u2657',
            '\u2658',
            '\u2656'
        };
        
        fillBoard(board, blackPieces, 0);
        fillBlanks(board);
        fillBoard(board, whitePieces, 6);

        printBoard(board);

    }

    public void fillBoard(char [][] board, char [] pieces, int start)
    {
        int piecesIndex = 0;
        
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                board[start][j] = pieces[piecesIndex];
                piecesIndex++;
            }
            start++;
        }
    }

    public void fillBlanks(char [][] board)
    {
        for (int i = 2; i < 6; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard(char [][] board)
    {
        for (int i = 0; i < 8; i++)
        {
            System.out.println("-----------------------------------------");

            for (int j = 0; j < 8; j++)
            {
                System.out.print("| " + board[i][j] + "  ");
            }

            System.out.println("|");
        }

        System.out.println("-----------------------------------------");
    }

    public void makeMove(char [][] board, int x , int y)
    {
        
    }
}
