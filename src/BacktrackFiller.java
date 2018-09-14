
public class BacktrackFiller extends Filler {

  int n = 8;
  
  @Override
  public boolean fill() {
      return put();
  }
  
  public boolean put() {
    for(int width = 0; width < board.width; width++) {
      for(int height = 0; height < board.height; height++) {
        Cell cell = board.get(width, height); 
        if(cell.isOccupied())
          continue;
        
        if(cell.isValid()) {
          cell.setOccupied(true);
          
          if(--n == 0)
            return true;
          
          if(put())
            return true;            
          else {
            cell.setOccupied(false);
            n++;
          }
        }
      }
    }
    return false;    
  }
  
}
