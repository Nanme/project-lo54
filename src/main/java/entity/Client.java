@Entity
public final class Client implements Serializable {
    private Integer id;
    private String lastName;
    private String firstName;
    private String address;
    private String email;
    private String phone;
    //private CourseSession courseSession;

    @Id
    public Integer getId() { return this.id; }
    public void setId(Integer id) {this.id = id; }

    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getAddress() { return this.address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return this.phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @OneToOne
    @PrimaryKeyJoinColumn
    public CourseSession getCourseSession() { return courseSession; }

}
