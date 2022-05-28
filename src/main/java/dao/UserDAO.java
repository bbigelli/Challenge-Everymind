package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAO {
    
    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(User user) throws SQLException{       
                          
        String sql = "INSERT INTO usuario (name,cpf,state,city,adress,complement,email,usuario,senha) values (?,?,?,?,?,?,?,?,?); ";                
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getName());
        statement.setString(2, user.getCpf());
        statement.setString(3, user.getState());
        statement.setString(4, user.getCity());
        statement.setString(5, user.getAdress());
        statement.setString(6, user.getComplement());
        statement.setString(7, user.getEmail());        
        statement.setString(8, user.getUser());
        statement.setString(9, user.getPassword());
        statement.execute();    
    }   

    public boolean verifyUser(User user) throws SQLException {
        
        String sql = "SELECT * FROM usuario WHERE usuario = ? and senha = ? ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUser());
        statement.setString(2, user.getPassword());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
    }    
}
