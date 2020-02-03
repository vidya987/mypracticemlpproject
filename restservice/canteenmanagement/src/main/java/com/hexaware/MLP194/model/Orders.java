package main.java.com.hexaware.MLP194.model;
/**
 * Order class used to display wallet information.
 * @author hexware
 */
public class Orders{
    private int ordId; 
    private String status; 
    private int cusId;
    private int vdrId;
    private String ordHty;
/**
   * @param argwltPt teo initialise wallet point
   * @param argwltNo to initialise wallt number
   * @param argcusId to initialise customer id
*/

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cusId;
        result = prime * result + ((ordHty == null) ? 0 : ordHty.hashCode());
        result = prime * result + ordId;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + vdrId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (cusId != other.cusId)
            return false;
        if (ordHty == null) {
            if (other.ordHty != null)
                return false;
        } else if (!ordHty.equals(other.ordHty))
            return false;
        if (ordId != other.ordId)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (vdrId != other.vdrId)
            return false;
        return true;
    }
/**
 * @return to get the order id.
 */
    public int getOrdId() {
        return ordId;
    }
/**
 * @param to set the order id
 */

    public void setOrdId(int ordId) {
        this.ordId = ordId;
    }
/**
 * @return to get the order status
 */
    public String getStatus() {
        return status;
    }
/**
 * @param to set the order status.
 */

    public void setStatus(String status) {
        this.status = status;
    }
/**
 * @return to get the customer id.
 */
    public int getCusId() {
        return cusId;
    }
/**
 * @param to set the customer id
 */
    public void setCusId(int cusId) {
        this.cusId = cusId;
    }
/**
 * @return to get the vendor id
 */
    public int getVdrId() {
        return vdrId;
    }
/**
 * @param to set the vendor id.
 */
    public void setVdrId(int vdrId) {
        this.vdrId = vdrId;
    }
/**
 * @return to get the order history.
 */
    public String getOrdHty() {
        return ordHty;
    }
/**
 * @param to set the order history
 */
    public void setOrdHty(String ordHty) {
        this.ordHty = ordHty;
    }
/**
 * Default Constructor
 */
    public Orders() {
    }
/**
 * @param to initialise order id
 * @param to initialise order status
 * @param to initialise customer id
 * @param to initialise vendor id
 * @param to initialise order history
 */

    public Orders(int ordId, String status, int cusId, int vdrId, String ordHty) {
        this.ordId = ordId;
        this.status = status;
        this.cusId = cusId;
        this.vdrId = vdrId;
        this.ordHty = ordHty;
    }
}