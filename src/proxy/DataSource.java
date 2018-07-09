package proxy;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class DataSource {
    private static LinkedList<Connection> connectionLinkedList = new LinkedList<Connection>();

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection createNewConnection() throws SQLException{
        return (Connection) DriverManager.getConnection("url","username", "password");
    }

    private DataSource(){
        if(connectionLinkedList ==null||connectionLinkedList.size()==0){
            for(int i=0;i<10;i++){
                try{
                    connectionLinkedList.add(createNewConnection());
                }catch (SQLException e){
                    e.getErrorCode();
                }
            }
        }
    }

    public Connection getConnection()throws Exception{
        if(connectionLinkedList.size()>0){
            return new ConnectionProxy(connectionLinkedList.remove());
        }
        return null;
    }
    public void recoveryConnection(Connection connection){
        connectionLinkedList.add(connection);
    }
    public static DataSource getInstance(){
        return DataSourceInstance.dataSource;
    }
    private static class DataSourceInstance{

        private static DataSource dataSource = new DataSource();

    }
}
