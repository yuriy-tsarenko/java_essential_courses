package com.java_essential.diledsys.homeWork.homeWork_Device;

public class EthernetAdapter {
    private int speead;
    private String mac;

    public EthernetAdapter(int speead, String mac) {
        this.speead = speead;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter:" + "\n"+
                "speead= " + speead +
                "mac= " + mac +  "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speead != that.speead) return false;
        return mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        int result = speead;
        result = 31 * result + mac.hashCode();
        return result;
    }
}
