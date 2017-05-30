package com.repository;

import com.entity.Course;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by renaud on 12/05/2017.
 */
public final class CourseDAO implements IDAO<Course>{
    private static Session session = HibernateUtil.getSessionFactory().openSession();

    //TODO Test it
    public List<Course> getAll() {
        List<Course> list = null;
        try {
            session.beginTransaction();

            Query query = session.createQuery("from Course");
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

    //TODO Test it
    public Course getFromId(Integer id) {
        Course cou = null;
        try {
            session.beginTransaction();

            cou = (Course) session.get(Course.class, id);

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
            return cou;
        }
    }

    //TODO Test it
    public void add(Course toAdd) {
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
    public void delete(Course toDelete) {
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
