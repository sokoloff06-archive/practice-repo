/**
 * Created by Vitaly Sokolov on 15.11.2016.
 */

import java.sql.*;


public class DBController {

	private String DB_URL = "jdbc:mysql://localhost/addressbook?autoReconnect=true&useSSL=false";
	private String DB_USER = "AddrBook";
	private String DB_PASS = "poi_098";

	private Connection conn;

	//constructor
	DBController() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		this.conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}

	public ResultSet selectAll() throws SQLException {
		String sql = "select id ,firstName, lastName, phoneNum from persons;";
		Statement statement = conn.createStatement();
		ResultSet res = statement.executeQuery(sql);
		//statement.close();
		return res;
	}

	public int insert(String firstName, String lastName, String  phoneNum) throws SQLException {
		String sql = "insert into persons (firstName, lastName, phoneNum) values (?, ?, ?);";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, firstName);
		statement.setString(2, lastName);
		statement.setString(3, phoneNum);
		return statement.executeUpdate();
	}

	public ResultSet booleanSearch(String firstName, String lastName, String phoneNum) throws SQLException {
		String sql = "select firstName, lastName, phoneNum from persons where firstName = ? AND lastName = ? OR phoneNum = ?;";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, firstName);
		statement.setString(2, lastName);
		statement.setString(3, phoneNum);
		return statement.executeQuery();
	}

	public int delete(int id) throws SQLException {
		String sql = "delete from persons where id = ?;";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, id);
		return statement.executeUpdate();
	}

	public ResultSet selectLike(String filter) throws SQLException {
		filter = "%"+filter+"%";
		String sql = "select id, firstName, lastName, phoneNum from persons where firstName like ? OR lastName like ? OR phoneNum like ?;";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, filter);
		statement.setString(2, filter);
		statement.setString(3, filter);
		return statement.executeQuery();
	}


}
