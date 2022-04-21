
package modelling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author abdel
 */
public class InvHead {
    private int invNum;
    private String customerName;
    private Date invDate;
    private ArrayList<InvLine> lines;  

    public InvHead(int invNum, String customerName, Date invDate) {
        this.invNum = invNum;
        this.customerName = customerName;
        this.invDate = invDate;
        //this.lines = new ArrayList<>();   // eager creation
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        String str = "InvoiceHeader{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}';
        for (InvLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }

    public ArrayList<InvLine> getLines() {
        if (lines == null)
            lines = new ArrayList<>();  // lazy creation
        return lines;
    }

    public void setLines(ArrayList<InvLine> lines) {
        this.lines = lines;
    }

    public double getInvTotal() {
        double total = 0.0;
        for (InvLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public void addInvLine(InvLine line) {
        getLines().add(line);
    }
    
    public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvNum() + "," + df.format(getInvDate()) + "," + getCustomerName();
    }   
    
}
