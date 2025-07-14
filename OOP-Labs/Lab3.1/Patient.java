public class Patient {
    private int id;        // patient's ID
    private String name;   // patient's full name
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms
    // Constructor with validation
    public Patient(int id, String name, int birthYear, double height, double weight) {
        this.id = id;
        this.name = name;

        // Validate birth year
        if (birthYear >= 1900 && birthYear <= 2024) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Invalid birth year for " + name + " setting to 1900.");
            this.birthYear = 1900;
        }

        // Validate height
       if(height>=30 && height<=300){
            this.height = height;
       }else{
            System.out.println("Invalid height for "+name+"setting to 160CM");
       }

        // Validate weight
        if (weight >= 0.5 && weight <= 500.0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight for " + name + ", setting to 0.0KG");
            this.weight = 0.0;
        }
    }

    //Getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }
    public int getAge(int currentYear) {
           if (currentYear >= birthYear) {
            return currentYear - birthYear;
           }else{
            System.out.println("Invalid current year for age calculation.");
            return -1;
        }
    }
    public void displayDetails(int currentYear) {
    System.out.println("-----  Info   -----");
    System.out.println("Patient Name: " + name);
    System.out.println("Patient Age: " + getAge(currentYear));
    System.out.println("Patient Height (cm): " + height);
    System.out.println("Patient Weight (kg): " + weight);
    System.out.println("-------------------");
}
}