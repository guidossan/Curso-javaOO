package JogoXadrez.Chess-Pieces;
import JogoXadrez.Chess.ChessPiece;
public class Rook extends ChessPiece{
   public Rook(Board board, Color color){
        super(board, color);
   }
   @Override
   public String toString(){
    return "R";
   }
}