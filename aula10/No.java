
public class No {
    private int value;
    private No nextNo, prevNo;

    public No(int value) {
        this.value = value;
        prevNo = nextNo = null;
    }

    public No copia() {
        return new No(value);
    }

    public int getValue() {
        return value;
    }

/*     public void setValue(int value) {
        this.value = value;
    } */

    public No getNextNo() {
        return nextNo;
    }
    
    public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }

    public No getPrevNo() {
        return prevNo;
    }

    public void setPrevNo(No prevNo) {
        this.prevNo = prevNo;
    }

}
