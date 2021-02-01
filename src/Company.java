import java.util.*;

public class Company {

   /* Company shows the operation of company in static context
      List of workers

   */


    static List<Worker> company2020 = new LinkedList();
    //static TreeSet<String> printableCompany2020 = new TreeSet();


    public static void initialize () {
        ListIterator<Worker> iterator = company2020.listIterator();
        Manager w1 = new Manager("Marian", "Bonka", 1.0, 2000);
        Manager w2 = new Manager("Albert", "Berthold", 1.0, 1200);
        PhysicalWorker pw1 = new PhysicalWorker("Johny", "DeVito", 0.5, 60);
        PhysicalWorker pw2 = new PhysicalWorker("Alberto", "Gil", 1.5, 190);
        PhysicalWorker pw3 = new PhysicalWorker("Fijodor", "Dostaj", 1.0, 160);
        PhysicalWorker pw4 = new PhysicalWorker("Dmytry", "Chvekov", 0.5, 60);
        PhysicalWorker pw5 = new PhysicalWorker("Wadim", "Sotrokin", 0.5, 90);
        PhysicalWorker pw6 = new PhysicalWorker("Adriano", "Mariani", 1.5, 220);

        company2020.add(w1);
        company2020.add(w2);
        company2020.add(pw1);
        company2020.add(pw2);
        company2020.add(pw3);
        company2020.add(pw4);
        company2020.add(pw5);
        company2020.add(pw6);
    }


    public static Worker find(String surname) {
        return company2020.stream()
                .filter(worker -> surname.equals(worker.getSurname())).findAny().orElse(null);
    }


    public static void displaySorted () {
        TreeSet<String> printableCompany2020 = new TreeSet();
        for (Worker w: company2020) {
            printableCompany2020.add(w.printable());
        }
        System.out.println(printableCompany2020);
    }



    // Main method to test
    public static void main(String[] args) {
        /*
            1st step - initilaze the list (listed as company2020)
            2nd step - sort (stupid way but still the best to copy all elements to TreeMap)
            3rd step - method find (by field 'Surname' of class 'Worker')

        */
        initialize();
        System.out.println(find("Bonka"));
        displaySorted();
        System.out.print(find("Gil".toString()));
    }

}
