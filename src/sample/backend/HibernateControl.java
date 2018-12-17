package sample.backend;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.jdbc.Work;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * This class will be used to create connection between classes and Database
 */
public class HibernateControl {
    HibernateControl(){};
    public void connect() throws HibernateException{
        try {
            StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();

            Metadata metadata = new MetadataSources(standardServiceRegistry)
                    .addAnnotatedClass(Employee.class).buildMetadata();

            SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

            Connection c = sessionFactory.getSessionFactoryOptions().getServiceRegistry()
                    .getService(ConnectionProvider.class).getConnection();

            Session sesh = null;
            try {
                sesh = sessionFactory.getCurrentSession();
            } catch (HibernateError he) {
                System.out.println(he.toString());
                sesh = sessionFactory.openSession();
            }
            Transaction tx = sesh.beginTransaction();

            // save new employee sesh.save();

            sesh.doWork(new Work() {
                @Override
                public void execute(Connection connection) throws SQLException {
                    //connection accessible here
                    System.out.println(connection.getMetaData().getDatabaseProductName());
                }
            });
        } catch (HibernateException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
