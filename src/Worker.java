public abstract class Worker {

    String name;
    String surname;
    double etat;

    public Worker(String name, String surname, double etat)
    {
        this.name=name;
        this.surname=surname;
        this.etat=etat;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}' + "\n";
    }

    String getSurname () {
        return surname;
    }

    public String printable () {
        return surname + " " + name ;
    }
}
