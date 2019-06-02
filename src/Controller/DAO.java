package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public Connection con ;
	protected DAO() {
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName = db_SinhVien ; user = sonhai ; password = sa");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
