package hw4;

import java.util.Date;

/**
 * Билет
 */
class Ticket {

    private int id;
    private int customer;
    private Date date;
    private String grcode;
    private boolean enable = true;

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return grcode;
    }

    public boolean isEnable() {
        return enable;
    }
}
