package proxy;

import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProxy implements Connection{
    private Connection connection;

    public ConnectionProxy(Connection connection){
        super();
        this.connection = connection;
    }

    @Override
    public Statement createStatement() throws SQLException{
        return  connection.createStatement();
    }

    @Override
    public void close() throws SQLException{
        System.out.println("把连接归到连接池");
        DataSource.getInstance().recoveryConnection(connection);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
