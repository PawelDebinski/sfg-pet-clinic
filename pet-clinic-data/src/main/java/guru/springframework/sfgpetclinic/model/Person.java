package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{

    // == fields ==
    private String firstName;
    private String lastName;

    // == public methods ==
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
