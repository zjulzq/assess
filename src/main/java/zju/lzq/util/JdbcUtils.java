package zju.lzq.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JdbcUtils {

	private static Log log = LogFactory.getLog(JdbcUtils.class);

	public static void close(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			log.warn("can not close ResultSet");
			throw new RuntimeException(e);
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				log.warn("can not close Statement");
				throw new RuntimeException(e);
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					log.warn("can not close connection");
					throw new RuntimeException(e);
				}
			}
		}
	}
}
