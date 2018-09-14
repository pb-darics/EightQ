
public class PullingFiller extends Filler {

  int n = 8;
  
  int i;
  
  @Override
  public boolean fill() {
    i = 0;
    return putv(0);
  }
  
  boolean putv(int w) {
    for(int h = 0; h < board.height; h++) {
      Cell cell = board.get(w, h);
      if(cell.isOccupied())
        continue;
      
      if(!cell.isValid())
        continue;
      
      cell.setOccupied(true);
      n--;

      System.out.println("I:" + (i++) + ", N:"+ n + ", W:" + w + ", H:" + h);
      board.print();

      if(n != 0 && w <= board.width - 1) {
        if(putv(w+1))
          return true;
      }
      cell.setOccupied(false);
      n++;
    }
    return false;
  }
  
}
