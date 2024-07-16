package gr.aueb.cf.ch12;

/**
 * java beans or POJO (Playing Old Java Object)
 */

public class Student {
    private int id;
    private String firstname;
    private String lastname;


    /**
     * Default constructor. Populates the state
     * of a (@link student) to default values
     */
    public Student() {

    }

    /**
     * Overloaded constructor. Populates the state
     * of the instance based on specific values that
     * given
     *
     * @param id        the id of the student
     * @param firstname the firstname of the student
     * @param lastname  the lastname of the student
     */
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }
}
