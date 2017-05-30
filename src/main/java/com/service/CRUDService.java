public final class CRUDService {
    private final CourseDAO courseDAO = new CourseDAO();
    private final ClientDAO clientDAO = new ClientDAO();
    private final CourseSessionDAO courseSessionDAO = new CourseSessionDAO();
    private final LocationDAO locationDAO = new LocationDAO();

    public void addCourse(String code, String title) {
        //TODO Write function
    }

    public void addCourseSession(Date startDate, Date endDate, Course course, Location Location) {
        //TODO Write function
    }

    public void addLocation (String city) {
        //TODO Write function
    }

    public void deleteCourse(String code, String title) {
        //TODO Write function
    }

    public void deleteClient(String lastName, String firstName, String address,
                        String email, String phone, CourseSession courseSession) {
        //TODO Write function
    }

    public void deleteCourseSession(Date startDate, Date, endDate, Course course,
                               Location location) {
        //TODO Write function
    }

    public void deleteLocation(String city) {
        //TODO Write function
    }

    public List<Location> getLocations() {
        //TODO Write function
    }
}
