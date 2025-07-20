 public class HealthRecord {
  // Instance field
  private int height;  // student's height in centimeters
  
  // Constants (static final)
  private static final int MIN_PERMITTED_HEIGHT = 50;
  private static final int MAX_PERMITTED_HEIGHT = 175;
  private static final int DEFAULT_HEIGHT = 100;
  
  // TODO: Initialize appropriately
  // Class-level tracking (static)
  private static int tallestHeight = 120; 
  private static int shortestHeight = 80;

  //Constructure
  public HealthRecord(int height) {
    setHeight(height);
  }

  //Method
   public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {

    // TODO: Validate height is within permitted range
    if (height >= MIN_PERMITTED_HEIGHT && height <= MAX_PERMITTED_HEIGHT) {
      this.height = height;
    } else {
      this.height = DEFAULT_HEIGHT;
    }

    // TODO: Update tallest and shortest heights
    if (this.height > tallestHeight) {
      tallestHeight = this.height;
    }
    if (this.height < shortestHeight) {
      shortestHeight = this.height;
    }
  }

  //Getter
    public static int getTallestHeight() {
      return tallestHeight;
    }
    public static int getShortestHeight(){
      return shortestHeight;
    }

    //Display
    public void displayDetails() {
      System.out.println("Height (cm): " + getHeight());
    }

    public static void displayClassDetails() {
      System.out.println("The tallest height (cm): " + getTallestHeight());
      System.out.println("The shortest height (cm): " + getShortestHeight());
   }
}

