@Entity
public final class CourseSession implements Serializable {
    private Integer id;
    private Date startDate;
    private Date endDate;

    @Id
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public Date getStartDate() { return this.startDate; }
    public void setStartDate(Date startDate) {this.startDate = startDate; }

    public Date getEndDate() { return this.endDate; }
    public void setEndDate(Date endDate) {this.endDate = endDate; }

    @OneToOne
    @PrimaryKeyJoinColumn
    public Course getCourse() { return course; }

    @OneToOne
    @PrimaryKeyJoinColumn
    public Location getLocation() { return location; }
}
