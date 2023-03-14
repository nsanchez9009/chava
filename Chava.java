import java.util.Scanner;

public enum ChessPiece {
    // Black pieces
    BLACK_KING('\u265A'),
    BLACK_QUEEN('\u265B'),
    BLACK_ROOK('\u265C'),
    BLACK_BISHOP('\u265D'),
    BLACK_KNIGHT('\u265E'),
    BLACK_PAWN('\u265F'),
    
    // White pieces
    WHITE_KING('\u2654'),
    WHITE_QUEEN('\u2655'),
    WHITE_ROOK('\u2656'),
    WHITE_BISHOP('\u2657'),
    WHITE_KNIGHT('\u2658'),
    WHITE_PAWN('\u2659')
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