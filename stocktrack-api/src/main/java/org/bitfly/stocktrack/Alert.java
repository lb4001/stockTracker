package org.bitfly.stocktrack;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Alert {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String ticker;
    private int alertType;
    private double alertValue;
    private boolean activeFlag;

    public enum alertTypes {DOLLAR_CHANGE, PERCENT_CHANGE, FLAT_AMOUNNT}

    public Alert() {}

    public Alert(String ticker, int alertType, double alertValue, boolean flag) {
        this.ticker = ticker;
        this.alertType = alertType;
        this.alertValue=alertValue;
        this.activeFlag=flag;
    }

    public Long getId() {
        return this.id;
    }

    public String getTicker() {
        return this.ticker;
    }

    public int getAlertType(){return this.alertType;}

    public double getAlertValue(){return this.alertValue;}

    public boolean getActiveFlag(){return this.activeFlag;}

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAlertType(int alertType){this.alertType = alertType;}

    public void setAlertValue(int alertValue){this.alertValue = alertValue;}

    public void setActiveFlag(boolean activeFlag){this.activeFlag = activeFlag;}

    @Override
    public boolean equals(Object o) {
    //make method
        return true;//compiler complaint
        /*
        if (this == o)
            return true;
        if (!(o instanceof Alert))
            return false;
        Alert alert = (Alert) o;
        return Objects.equals(this.id, Alert.id) && Objects.equals(this.name, Alert.name);
        */
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.ticker);
    }

    @Override
    public String toString() {
        String message = "Alert{" + "id = " + this.id + ", ticker = '" + this.ticker + '\'' + ", alertValue = " + this.alertValue + ", alertType = ";
        if(this.alertType==0)
            message.concat("Dollar Change, activeFlag = " + this .activeFlag + "}\n");
        else
            message.concat("Percent Change, activeFlag = " + this .activeFlag + "}\n");
        return message;
    }
}
