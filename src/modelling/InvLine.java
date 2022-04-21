
package modelling;
/**
 *
 * @author abdel
 */
public class InvLine {
    
private String itemName;
private double itemPrice;
private int itemCount;
private double lineTotal;
private InvHead header;

    public InvLine(String itemName, double itemPrice, int itemCount, InvHead header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.header = header;
        this.setLineTotal(this.itemCount*this.itemPrice);
    }

     
    public InvHead getHeader() {
        return header;
    }

    public void setHeader(InvHead header) {
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getLineTotal(){
        return lineTotal;
    }

    private void setLineTotal(double lineTotal) {
this.lineTotal = lineTotal;
  }
     public String getDataAsCSV() {
        return "" + getHeader().getInvNum() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
    }
}
