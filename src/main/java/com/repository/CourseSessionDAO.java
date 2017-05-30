public class CourseSessionDAO implements IDAO<CourseSession> {
    private static Session session = HibernateUtil.getSessionFactory().openSession();

    public List<CourseSession> getAll() {
        List<CourseSession> list = null;
        try {
            session.beginTransaction();

            Query query = session.createQuery("from CourseSession");
            list = query.list();

            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();

                } catch (HibernateException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch ( HibernateException e3) {
                    e3.printStackTrace();
                }
            }
            return list;
        }
    }

    public CourseSession getFromId(Integer id) {
        CourseSession cs = null;
        try {
            session.beginTransaction();

            cs = (CourseSession) session.get(CourseSession.class, id);

            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException e3) {
                    e3.printStackTrace();
                }
            }
            return cs;
        }
    }

    //TODO Test it
    public void add(CourseSession toAdd) {
        try {
            session.beginTransaction();

            session.merge(toAdd);

            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    //TODO Test it
    public void delete(CourseSession toDelete) {
        try {
            session.beginTransaction();

            session.delete(toDelete);

            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }
}
