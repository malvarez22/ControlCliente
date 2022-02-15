package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";                    
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        ds.setInitialSize(50);
        return (DataSource) ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();        
    } 
    
    public static void close(ResultSet res) throws SQLException{  
        try{
            res.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }        
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        try{
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection con) throws SQLException{
        try{
            con.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    
}
