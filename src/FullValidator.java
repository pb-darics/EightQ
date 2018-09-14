
public class FullValidator extends Validator {

  int w, h;
  
  @Override
  public boolean isValid(Cell cell) {
    w = cell.w;
    h = cell.h;
    
    return 
        isValidHorizontal() && 
        isValidVertical() && 
        isValidDiagonal1() && 
        isValidDiagonal2() && 
        isValidDiagonal3() && 
        isValidDiagonal4();
  }
  
  private boolean isValidHorizontal() {
    for(int width = 0; width < board.width; width++) {
      if(board.get(width, h).isOccupied())
          return false;
    }
    return true;
  }

  private boolean isValidVertical() {
    for(int height = 0; height < board.height; height++) {
      if(board.get(w, height).isOccupied())
          return false;
    }
    return true;
  }

  private boolean isValidDiagonal1() {  /*  left top \  */
    int width = w;
    int height = h;
    
    while(width >= 0 && height >= 0) {
      if(board.get(width,  height).isOccupied())
        return false;
      
      width--;
      height--;
    }
    return true;
  }

  private boolean isValidDiagonal2() {  /*  right top /  */
    int width = w;
    int height = h;
    
    while(width < board.width && height >= 0) {
      if(board.get(width,  height).isOccupied())
        return false;
      
      width++;
      height--;
    }
    return true;
  }

  private boolean isValidDiagonal3() {  /*  left bottom /  */
    int width = w;
    int height = h;
    
    while(width >= 0 && height < board.height) {
      if(board.get(width,  height).isOccupied())
        return false;
      
      width--;
      height++;
    }
    return true;
  }

  private boolean isValidDiagonal4() {  /*  right bottom \  */
    int width = w;
    int height = h;
    
    while(width < board.width && height < board.height) {
      if(board.get(width,  height).isOccupied())
        return false;
      
      width++;
      height++;
    }
    return true;
  }

  @Override
  public void setOccupied(Cell cell, boolean occupied) {
  }

}
