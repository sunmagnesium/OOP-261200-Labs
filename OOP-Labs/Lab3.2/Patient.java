public class Patient {
    // Fields
    private int id;
    private String name;
    private int birthYear;
    private double height; // cm
    private double weight; // kg
    private String bloodGroup;
    private String phoneNumber;

    // Constructor 
    public Patient(int id, String name, int birthYear, double height, double weight) {
        this(id, name, birthYear, height, weight, "Unknown", "Unknown");
    }

    // Constructor 
    public Patient(int id, String name, int birthYear, double height, double weight,String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;

        // Validation for birth year
        if (birthYear >= 1900 && birthYear <= 2024) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Invalid birth year for " + name + ", setting to 1900.");
            this.birthYear = 1900;
        }

        // Validation for height
        if (height >= 30.0 && height <= 300.0) {
            this.height = height;
        } else {
            System.out.println("Invalid height for " + name + ", setting to 0.0.");
            this.height = 0.0;
        }

        // Validation for weight
        if (weight >= 0.5 && weight <= 500.0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight for " + name + ", setting to 0.0.");
            this.weight = 0.0;
        }

        //set bloodGroup and phone Number
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getBirthYear() { return birthYear; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public String getBloodGroup() { return bloodGroup; }
    public String getPhoneNumber() { return phoneNumber; }

    // Get Age
    public int getAge(int currentYear) {
        if (currentYear >= birthYear) {
            return currentYear - birthYear;
        } else {
            System.out.println("Invalid current year for age calculation.");
            return -1;
        }
    }

    // Get BMI
    public double getBMI() {
        if (height <= 0) return -1.0;
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    // Display all patient details
    public void displayDetails(int currentYear) {
        System.out.println("----- Patient Info -----");
        System.out.println("Patient ID: " + id);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("BMI: "+ getBMI());
        System.out.println("------------------------");
    }
}
