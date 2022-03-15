/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo3;
import javax.swing.*;

public class tampilan extends JFrame{
    JLabel Username = new JLabel("Username : "); 
    JTextField user = new JTextField (15);
    JLabel Password = new JLabel("Password : ");
    JPasswordField pass = new JPasswordField(15);
    JButton login = new JButton("Login");
    JButton cancel = new JButton("Cancel");
    
    public tampilan() {
      
       setTitle("Login");
       setSize(250,200);
       
       setLayout(null);
       
       add(Username);
       add(user);
       add(Password);
       add(pass);
       add(login);
       add(cancel);
       
       
       Username.setBounds(25, 20, 95, 25);
       user.setBounds(105, 20, 95, 25);
       Password.setBounds(25, 50, 95, 25);
       pass.setBounds(105, 50, 95, 25);
       login.setBounds(23, 100, 75, 25);
       cancel.setBounds(123, 100, 75, 25);
       
       
       setVisible(true);
    }
}
