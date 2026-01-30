package co.com.sst360.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Clase HibernateUtil
 * 
 * Esta clase se encarga de crear y administrar la SessionFactory de Hibernate.
 * 
 * La SessionFactory se crea una sola vez cuando la aplicación se inicia
 * y se utiliza para abrir sesiones hacia la base de datos.
 * 
 * Esta clase lee la configuración desde el archivo hibernate.cfg.xml.
 * 
 * Autor: Alfredo Arregocés
 */
public class HibernateUtil {

    /**
     * SessionFactory es el objeto principal de Hibernate.
     * 
     * Se define como static para que exista una sola instancia
     * durante toda la ejecución de la aplicación.
     */
    private static final SessionFactory sessionFactory = buildSessionFactory();

    /**
     * Método que construye la SessionFactory.
     * 
     * @return SessionFactory configurada con los datos de hibernate.cfg.xml
     */
    private static SessionFactory buildSessionFactory() {
        try {
            // Se crea la configuración de Hibernate
            Configuration configuration = new Configuration();

            // Se carga el archivo hibernate.cfg.xml
            configuration.configure("hibernate.cfg.xml");

            // Se construye la SessionFactory a partir de la configuración
            return configuration.buildSessionFactory();

        } catch (Throwable ex) {
            // Si ocurre un error, se muestra en consola
            System.err.println("Error al crear la SessionFactory de Hibernate.");
            ex.printStackTrace();

            // Se lanza un error grave porque sin Hibernate la aplicación no funciona
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * Método para obtener la SessionFactory desde cualquier parte del proyecto.
     * 
     * @return SessionFactory
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Método para cerrar la SessionFactory cuando la aplicación finaliza.
     */
    public static void shutdown() {
        getSessionFactory().close();
    }
}
