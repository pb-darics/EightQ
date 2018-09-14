public class Cell {

  private boolean occupied;
  
  int w;
  int h;
  
  private Validator validator;  
  
  public Cell(Validator validator, int width, int height) {
    occupied = false;
    w = width;
    h = height;
    this.validator = validator;
  }
  
  public boolean isOccupied() {
    return occupied;
  }
  
  public void setOccupied(boolean occupied) {
    this.occupied = occupied;
    validator.setOccupied(this, occupied);
  }
  
  public boolean isValid() {
    return validator.isValid(this);
  }
  
}
