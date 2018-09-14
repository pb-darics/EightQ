import java.text.DecimalFormat;

public class EightQ {

  private static DecimalFormat df = new DecimalFormat(".##");

  private Board board;
  
  public static void main(String[] args) {
    new EightQ(new PullingFiller(), new LineValidator());
  }
  
  private EightQ(Filler filler, Validator validator) {
    board = new Board(validator);
    filler.setBoard(board);
    validator.setBoard(board);
    
    long startTime = System.nanoTime();
    boolean success = filler.fill();
    long endTime = System.nanoTime();
    
    double duration = (endTime - startTime) / 1000.0 / 1000.0;
    
    if(success)
      System.out.println("Successful in " + df.format(duration) + " ms");
    else
      System.out.println("Unsuccessful");
    
    board.print();
  }

}
