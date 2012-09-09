package zju.lzq.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.XADataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

import zju.lzq.dao.NameDao;
import zju.lzq.entity.Name;
import zju.lzq.util.JdbcUtils;

public class Test {
	private static Log log = LogFactory.getLog(Test.class);

	private static Connection conn = null;
	private static Statement st = null;
	private static ResultSet rs = null;

	public static void main(String[] args) {
		// testJdbc();
		// testDateSource();
		testS3Hibernate();

	}

	private static void testJdbc() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			log.warn("can not find the driver");
			throw new RuntimeException(e);
		}

		try {
			log.info("initialize connection");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.1.3:1521:orcl", "lzq", "3021");
			st = conn.createStatement();
			rs = st.executeQuery("select * from test");
			while (rs.next()) {
				System.out.println(rs.getObject(1));
				System.out.println(rs.getObject(2));
				System.out.println(rs.getObject(3));
			}
		} catch (SQLException e) {
			log.warn(e.getMessage());
		} finally {
			JdbcUtils.close(rs, st, conn);
			log.info("close connection");
		}
	}

	private static void testDateSource() {
		XADataSource dataSource = SingletonS2Container
				.getComponent(XADataSource.class);

		try {
			log.info("initialize connection");
			conn = dataSource.getXAConnection().getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from test");
			while (rs.next()) {
				System.out.println(rs.getObject(1));
				System.out.println(rs.getObject(2));
				System.out.println(rs.getObject(3));
			}
		} catch (SQLException e) {
			log.warn(e.getMessage());
		} finally {
			JdbcUtils.close(rs, st, conn);
			log.info("close connection");
		}
	}

	private static void testS3Hibernate() {
		final String PATH = "Name.dicon";
		S2Container container = S2ContainerFactory.create(PATH);
		container.init();
		try {
			NameDao dao = (NameDao) container.getComponent(NameDao.class);
			Name name = new Name();
			name.setFamilyName("李");
			name.setFirstName("志强");
			dao.save(name);
		} finally {
			container.destroy();
		}
	}
}
