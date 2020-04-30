package nfragiskatos.StructuralPatterns.Proxy.Exercise;

public class ResponsiblePerson {

    private Person person;

    public ResponsiblePerson(Person person) {
        this.person = person;
    }

    public int getAge() {
        return person.getAge();
    }

    public void setAge(int age) {
        person.setAge(age);
    }

    public String drink() {
        if (person.getAge() < 18) {
            return "too young";
        }
        return person.drink();
    }

    public String drive() {
        if (person.getAge() < 16) {
            return "too young";
        }
        return person.drive();
    }

    public String drinkAndDrive() {
        return "dead";
    }
}
