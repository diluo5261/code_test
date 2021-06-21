import java.util.Comparator;

public class CompareByBirthday implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

       int minYear =  o1.getBirthday().getYear() - o2.getBirthday().getYear();
       if (minYear != 0){
           return minYear;
       }
        int minMonth = o1.getBirthday().getMonth() - o1.getBirthday().getMonth();
       if (minMonth != 0){

           return minMonth;
       }

       return o1.getBirthday().getDay() - o2.getBirthday().getDay();

    }
}
