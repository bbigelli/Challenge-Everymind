package Controller;

import View.FormRegisterView;
import dao.Conexao;
import dao.UserDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

public class FormRegisterController {
    
    private FormRegisterView view;

    public FormRegisterController(FormRegisterView view) {
        this.view = view;
    }
    
    public void saveUser(){
        
      String name = view.getJtfName().getText();
      String cpf = view.getJtfCpf().getText();
      String state = view.getJtfState().getText();
      String city = view.getJtfCity().getText();
      String adress = view.getJtfAdress().getText();
      String complement = view.getJtfComplement().getText();
      String email = view.getJtfEmail().getText();
      String user = view.getJtfUser().getText();
      String password = view.getJpfPassword().getText();        
        
      User userRegister = new User(name, cpf, state, city, adress, complement, email, user, password);           
      
      try{
          Connection conexao = new Conexao().getConnection();
          UserDAO userDao = new UserDAO(conexao);
          userDao.insert(userRegister);
          
          JOptionPane.showMessageDialog(null, "User successfully created");
          
      } catch(SQLException ex){
          Logger.getLogger(FormRegisterView.class.getName()).log(Level.SEVERE, null, ex);
      }  
    }    
}
