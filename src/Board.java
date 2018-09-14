
public class Board {

  public final int width = 8;
  public final int height = 8;
  
  Cell[][] board;
  
  public Board(Validator validator) {
    board = new Cell[width][height];
    
    for(int w = 0; w < width; w++) {
      for(int h = 0; h < height; h++) {
        board[w][h] = new Cell(validator, w, h);
      }
    }
  }
  
  public Cell get(int width, int height) {
    return board[width][height];
  }
  
  public void print() {
    for(int h = 0; h < height; h++) {
      String line = "";
      for(int w = 0; w < width; w++) {
        line += board[w][h].isOccupied() ? "[X]" : "[ ]";
      }
      System.out.println(line);
    }
  }
  
}
