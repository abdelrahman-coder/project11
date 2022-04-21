
package viewing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author abdel
 */
public class HeadDialog extends JDialog{
private JTextField customerNameField;
    private JTextField invDateField;
    private JLabel customerNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;

    public HeadDialog(InvFrame frame) {

        customerNameLbl = new JLabel("Customer Name:");
        customerNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
 
        okBtn.setActionCommand("create Inv OK");
        cancelBtn.setActionCommand("create Inv Cancel");
       okBtn.addActionListener(frame.getListener());
         cancelBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateField);
        add(customerNameLbl);
        add(customerNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return customerNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }

    
}
