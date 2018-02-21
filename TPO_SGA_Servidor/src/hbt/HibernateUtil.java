package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.ArticuloEntity;
import entities.ClienteEntity;
import entities.FacturaEntity;
import entities.ItemFacturaEntity;
import entities.ItemOrdenDeCompraEntity;
import entities.ItemPedidoEntity;
import entities.LoteEntity;
import entities.MovimientoEntity;
import entities.OrdenDeCompraEntity;
import entities.PedidoEntity;
import entities.RemitoEntity;
import entities.UbicacionEntity;
import negocio.ItemRemito;


public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
        try {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
             // config.addAnnotatedClass(ArticuloEntity.class);
             	config.addAnnotatedClass(ClienteEntity.class);
             // config.addAnnotatedClass(FacturaEntity.class);
        	 // config.addAnnotatedClass(ItemFacturaEntity.class);
        	 // config.addAnnotatedClass(ItemOrdenDeCompraEntity.class);
        	 // config.addAnnotatedClass(ItemPedidoEntity.class);
             	config.addAnnotatedClass(ItemRemito.class);
          	 // config.addAnnotatedClass(LoteEntity.class);
             // config.addAnnotatedClass(MovimientoEntity.class);
             // config.addAnnotatedClass(OrdenDeCompraEntity.class);
             // config.addAnnotatedClass(PedidoEntity.class);
             	config.addAnnotatedClass(RemitoEntity.class);
             // config.addAnnotatedClass(UbicacionEntity.class);
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}