
public abstract class Filler {

  protected Board board;

  public void setBoard(Board board) {
    this.board = board;
  }
  
  public abstract boolean fill();

}
