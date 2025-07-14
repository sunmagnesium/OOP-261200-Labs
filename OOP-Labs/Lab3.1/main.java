public class main {
    public static void main(String[] args) {
    int currentYear = 2024;
  
    // Test valid patient
    Patient validPt = new Patient(1001, "John Doe", 1978, 175.5, 78.0);
    validPt.displayDetails(currentYear);
  
     // Test invalid patient
    Patient invalidPt = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0);
    invalidPt.displayDetails(currentYear);
}
}
