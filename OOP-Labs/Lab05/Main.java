import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
      
        int todayMonth = LocalDate.now().getMonthValue();
        int todayDay = LocalDate.now().getDayOfMonth();

        User john = new User("John", 1954, todayMonth, todayDay);
        Admin nicolas = new Admin("Nicolas", 1964, todayMonth, todayDay);

        john.displayHappyBirthday();      // Happy birthday John!
        nicolas.displayHappyBirthday();   // Happy birthday Nicolas! You are XX!
    }
}
