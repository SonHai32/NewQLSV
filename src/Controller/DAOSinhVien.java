package Controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.SinhVien;
public class DAOSinhVien extends DAO{
	private ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
	
	public boolean addSinhVien(Model.SinhVien x) {
		String sql = ("INSERT INTO sinhvien(id , masv , hotensv , ngaysinh , phai , noisinh , malop , makh)"
				    + "VALUES(?,?,?,?,?,?,?,?)");
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, x.getID());
		ps.setString(2, x.getMaSinhVien());
		ps.setString(3, x.getHoTen());
		ps.setString(4, x.getNgaySinh());
		ps.setString(5, x.getGioiTinh());
		ps.setString(6, x.getNoiSinh());
		ps.setString(7, x.getMaLop());
		ps.setString(8, x.getMaKhoa());
		
		return ps.executeUpdate() > 0 ;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public boolean updateSinhVien(Model.SinhVien x ) {
		String sql = "UPDATE sinhvien "
				   + "set masv = ? ,"
				   + "hotensv = ? ,"
				   + "ngaysinh = ? ,"
				   + "gioitinh = ? ,"
				   + "noisinh = ? ,"
				   + "malop = ? ,"
				   + "makh = ? , ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getMaSinhVien());
			ps.setString(2, x.getHoTen());
			ps.setString(3, x.getNgaySinh());
			ps.setString(4, x.getGioiTinh());
			ps.setString(5, x.getNoiSinh());
			ps.setString(6, x.getMaLop());
			ps.setString(7, x.getMaKhoa());
			
			return ps.executeUpdate() > 0 ;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
	
	public boolean deleteSinhVien(Model.SinhVien x) {
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM sinhvien WHERE id = " + x.getID());
			
			return ps.executeUpdate() > 0 ;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
	
	public ArrayList<SinhVien> getListSinhVien(String sql) {
		try {
			Statement sta = con.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			
			while(rs.next()) {
				SinhVien x = new SinhVien();
				x.setID(rs.getInt("id"));
				x.setMaSinhVien(rs.getString("masv"));
				x.setHoTen(rs.getString("hotensv"));
				x.setNgaySinh(rs.getString("ngaysinh"));
				x.setGioiTinh(rs.getString("phai"));
				x.setNoiSinh(rs.getString("noisinh"));
				x.setMaLop(rs.getString("malop"));
				x.setMaKhoa(rs.getString("makh"));
				listSinhVien.add(x);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return listSinhVien;
	}
	
	
	
	
}
