
public class LineValidator extends Validator {

  int[] rows;
  int[] columns;
  int[] diag1; // \
  int[] diag2; // /
    
  @Override
  public void setBoard(Board board) {
    this.board = board;
    
    rows = new int[board.height];
    for(int iter = 0; iter < board.height; iter++)
      rows[iter] = 0;
    
    columns = new int[board.width];
    for(int iter = 0; iter < board.width; iter++)
      columns[iter] = 0;
    
    diag1 = new int[board.width + board.height - 1];
    diag2 = new int[board.width + board.height - 1];
    for(int iter = 0; iter < board.width + board.height - 1; iter++) {
      diag1[iter] = 0;
      diag2[iter] = 0;
    }
  }

  int getDiag1(int width, int height) {
    return board.width - width - 1 + height;
  }

  int getDiag2(int width, int height) {
      return height + width;
  }

  @Override
  public boolean isValid(Cell cell) {
    return 
        rows[cell.h] == 0 &&
        columns[cell.w] == 0 &&
        diag1[getDiag1(cell.w, cell.h)] == 0 &&
        diag2[getDiag2(cell.w, cell.h)] == 0;
  }

  @Override
  public void setOccupied(Cell cell, boolean occupied) {
    int value = occupied ? 1 : -1;

    rows[cell.h] += value;
    columns[cell.w] += value;
    diag1[getDiag1(cell.w, cell.h)] += value;
    diag2[getDiag2(cell.w, cell.h)] += value;    
  }
  
  
}
