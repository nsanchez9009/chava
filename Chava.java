import java.util.Scanner;

public enum Piece {
    WHITE_ROOK("Wrook"),
    WHITE_KNIGHT("Wknight"),
    WHITE_BISHOP("Wbishop"),
    WHITE_QUEEN("Wqueen"),
    WHITE_KING("Wking"),
    WHITE_PAWN("Wpawn"),
    BLACK_ROOK("Brook"),
    BLACK_KNIGHT(),
    BLACK_BISHOP(),
    BLACK_KING(),
    BLACK_QUEEN(),
    BLACK_PAWN(),




} 

public class Chava {
    public static void main(String [] args)
    {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Start game? (Y/N): ");
        
        // String gameQuestion = scanner.nextLine();

        // char answer = (gameQuestion.length() > 0) ? Character.toLowerCase(gameQuestion.charAt(0)) : '0'; 

        
        // while (answer != 'y')
        // {
        //     System.out.print("Start game? (Y/N): ");
        //     gameQuestion = scanner.nextLine();
        //     System.out.print(gameQuestion);
        //     answer = (gameQuestion.length() > 0) ? gameQuestion.charAt(0) : '0';
        // }
        // scanner.close();

        Game game = new Game();
        game.newGame();
        
        

        
    }
    
}