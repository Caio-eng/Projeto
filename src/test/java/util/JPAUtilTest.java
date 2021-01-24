package util;

import javax.persistence.EntityManager;

import org.junit.Test;

public class JPAUtilTest {
	@Test
	public void getEntityManeger() {
	 	EntityManager sessao = JPAUtil.getEntityManager();
	 	sessao.close();
	}

}
