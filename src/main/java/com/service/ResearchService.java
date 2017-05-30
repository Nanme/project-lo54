public final class ResearchService {
    private final CourseSessionDAO courseSessionDAO = new CourseSessionDAO();
    private final CourseDAO courseDAO = new CourseDAO();
    private final LocationDAO locationDAO = new LocationDAO();

    public List<Course> FindByKeyword (String Keyword) {
        //TODO Write function
    }

    public List<Course> FindByDate (Date date){
        //TODO Write function
    }

    public List<Course> FindByLocation (Location loc){
        //TODO Write function
    }

    public List<CourseSession> FindByCourse (Course course){
        //TODO Write function
    }

}
