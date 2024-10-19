import java.util.Date;

public class Student {
    protected String fullName;
    private Date dateOfBirth;
    protected String id;

    public Student(String fullName, Date dateOfBirth, String id) {
        this.id = id;
    }

    public class Student extends Person {
        private String id;
    }
}
