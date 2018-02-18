package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.ClienteEntity;
import entities.CuentaCorrienteEntity;


public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
        try {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
             // config.addAnnotatedClass(ArticuloEntity.class);
             config.addAnnotatedClass(ClienteEntity.class);
             // config.addAnnotatedClass(ComprobanteEntity.class);
             config.addAnnotatedClass(CuentaCorrienteEntity.class);
             /*config.addAnnotatedClass(FacturaEntity.class);
             config.addAnnotatedClass(ItemFacturaEntity.class);
             config.addAnnotatedClass(ItemOrdenDeCompraEntity.class);
             config.addAnnotatedClass(ItemPedidoEntity.class);
             config.addAnnotatedClass(LoteEntity.class);
             config.addAnnotatedClass(MovimientoEntity.class);
             config.addAnnotatedClass(MovimientoAutomaticoEntity.class);
             config.addAnnotatedClass(MovimientoPorAjusteEntity.class); 
             config.addAnnotatedClass(OrdenDeCompraEntity.class);
             config.addAnnotatedClass(PedidoEntity.class);
             config.addAnnotatedClass(RemitoEntity.class);
             config.addAnnotatedClass(StockEntity.class);
             config.addAnnotatedClass(UbicacionEntity.class);*/
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