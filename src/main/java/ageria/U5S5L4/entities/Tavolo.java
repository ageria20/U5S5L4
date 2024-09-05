package ageria.U5S5L4.entities;

import ageria.U5S5L4.enums.TableStatus;
import ageria.U5S5L4.enums.TableStatus;


public class Tavolo {

    private int tbNum;
    private TableStatus tableStatus;
    private int coperti;

    public Tavolo(int tbNum, TableStatus tableStatus, int coperti) {
        this.tbNum = tbNum;
        this.tableStatus = tableStatus;
        this.coperti = coperti;
    }



    public int getTbNum() {
        return tbNum;
    }

    public void setTbNum(int tbNum) {
        this.tbNum = tbNum;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }
}
