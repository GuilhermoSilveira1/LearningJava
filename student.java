public class student {
    
    String firstname;
    String lastName;
    int expectedGradyear;
    double GPA;
    String declaredMajor;

    public student (String firstname,
    String lastName,
    int expectedGradyear,
    double GPA,
    String declaredMajor) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.expectedGradyear = expectedGradyear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public int incrementExpectedGradYear() {
        return this.expectedGradyear + 1;
    }

}
