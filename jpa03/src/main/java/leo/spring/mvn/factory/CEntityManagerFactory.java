package leo.spring.mvn.factory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CEntityManagerFactory {

    private static EntityManagerFactory entityManagerFactory;

    /**
     * EntityManagerFactory는 EntityManager를 생성하기 위한 팩토리 인터페이스로 persistence 단위별로 팩토리를 생성
     */
    public static void initialization(){
        entityManagerFactory = Persistence.createEntityManagerFactory("value");
    }

    /**
     * EntityManager 객체를 생성
     * EntityManager 는 Persistence Context와 Entity를 관리
     *
     * @return EntityManager 객체
     */
    public static EntityManager createEntityManger(){
        return entityManagerFactory.createEntityManager();
    }

    /**
     * EntityManagerFactory 객체 종료
     */
    public static void close(){
        entityManagerFactory.close();
    }

}
