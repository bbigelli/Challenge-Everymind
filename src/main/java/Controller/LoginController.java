
package Controller;

import View.MainView;
import View.MenuView;
import dao.Conexao;
import dao.UserDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.User;

public class LoginController {
    
    private MainView view;

    public LoginController(MainView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        //Busca um Usuário da View
        String user = view.getJtfUser().getText();
        String password = view.getJpfPassword().getText();
        
        User userLogin = new User(user, password);
        
        //Verifica se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        UserDAO userDao = new UserDAO(conexao);
        
        boolean verify = userDao.verifyUser(userLogin);
                
        //Se existir vá para Menu
        if(verify){
            MenuView menu = new MenuView();
            menu.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Invalid user or password, do not have user/password? Please register");
        }
               
    }    
}
