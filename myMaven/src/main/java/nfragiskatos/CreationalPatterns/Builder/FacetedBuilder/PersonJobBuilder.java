package nfragiskatos.CreationalPatterns.Builder.FacetedBuilder;

public class PersonJobBuilder extends PersonBuilder{
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String company) {
        person.companyName = company;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}
