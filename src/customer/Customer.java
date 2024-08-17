    
package customer;
import static java.awt.SystemColor.text;
import javax.swing.JDialog;
import ui_screens.Welcome;
import ui_screens.Login;

public class Customer {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        Login l = new Login();
        w.setVisible(true);
        for (int i = 0; i <= 100; i++)
        {
            w.getProgressCountLabel().setText(i+"%");
            w.getProgressBar().setValue(i);
            try{
               Thread.sleep(10);
            } catch(Exception e)
            {
               new JDialog(w, e.getMessage(), true);
            }
         }
         w.setVisible(false);
         l.setVisible(true);
         w.dispose();
    }
}
