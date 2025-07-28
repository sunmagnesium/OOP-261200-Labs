import java.time.LocalDate;

public class Admin extends User {
      public Admin(){
        super();
     }
     public Admin(String name,int year,int month,int day) {
        super(name,year,month,day);
     }
     @Override
     public void displayInfo(){
        super.displayInfo();
        System.out.println("User type:admin");       
     }
    
    public void displayInfo(boolean full){
        if(full){
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }
    }    
    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) {
            int age = LocalDate.now().getYear() - getDob().getYear();
            System.out.println("Happy birthday " + getName() + "! You are " + age + "!");
        }
    }

}
