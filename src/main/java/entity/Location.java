@Entity
public final class Location implements Serializable {
    private Integer id;
    private String city;

    @Id
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getCity() { return this.city; }
    public void setCity(String city) { this.city = city; }
}
