import java.time.LocalDate;

public class User {
    //Field
    protected String name;
    protected LocalDate dob;

    //Default constructor
    public User(){
        this.name = null;
        this.dob = LocalDate.now(); //current date
    } 
    //Parameterized consturctor
    public User(String name,int year,int month,int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);           
    }
    //Getter and Setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;
    }
    public LocalDate getDob(){
        return dob;
    }
    //Method displayInfo 
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
    //Method isBirthday
       public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == dob.getDayOfMonth()
                && today.getMonth() == dob.getMonth();
    }
    //Method displayHappyBirthday()
    public void displayHappyBirthday() {
    if(isBirthday()){
        System.out.println("Happy birthday " + this.name + "!");
    }
}
    
}
