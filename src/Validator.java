
public abstract class Validator {

  protected Board board;

  public void setBoard(Board board) {
    this.board = board;
  }
  
  public abstract boolean isValid(Cell cell);

  public abstract void setOccupied(Cell cell, boolean occupied);
  
}
