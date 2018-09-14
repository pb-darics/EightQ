
public class SimpleFiller extends Filler {

  @Override
  public boolean fill() {
    for(int n = 8; n >= 1; n--) {
      if(!findPlaceForOne())
        return false;
    }
    return true;
  }
  
  public boolean findPlaceForOne() {
    for(int width = 0; width < board.width; width++) {
      for(int height = 0; height < board.height; height++) {
        Cell cell = board.get(width, height); 
        if(cell.isOccupied()) {
          System.out.println("Cell occupied: [" + width + "," + height + "]");
          continue;
        }
        
        if(cell.isValid()) {
          cell.setOccupied(true);
          System.out.println("Cell valid: [" + width + "," + height + "]");
          return true;
        }
        System.out.println("Cell is not valid: [" + width + "," + height + "]");
      }
    }
    return false;
  }
  
}
