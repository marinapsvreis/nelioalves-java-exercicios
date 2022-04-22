package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null; //conecta
		Statement st = null; //consulta 
		ResultSet rs = null; //resultado
		
		try {
			conn = DB.getConnection(); //conectando ao banco de dados
			
			st = conn.createStatement(); //criando o statement
			
			rs = st.executeQuery("select * from department"); //executando o comando SQL
			
			while(rs.next()) { //indo até acabar as linhas
				System.out.println(rs.getInt("Id") + ", " + rs.getString("name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally{
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
