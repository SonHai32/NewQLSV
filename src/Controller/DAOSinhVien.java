package Controller;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.SinhVien;
public class DAOSinhVien extends DAO{
	private ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
	
	public ArrayList<SinhVien> getListSinhVien(String sql) {
		try {
			Statement sta = con.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			
			while(rs.next()) {
				SinhVien x = new SinhVien();
				x.setID(rs.getString("id"));
				x.setMaSinhVien(rs.getString("masv"));
				x.setHoTen(rs.getString("hotensv"));
				x.setNgaySinh(rs.getString("ngaysinh"));
				x.setGioiTinh(rs.getString("phai"));
				x.setNoiSinh(rs.getString("noisinh"));
				x.setMalop(rs.getString("malop"));
				x.setMaKhoa(rs.getString("makh"));
				listSinhVien.add(x);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return listSinhVien;
	}
	
}
