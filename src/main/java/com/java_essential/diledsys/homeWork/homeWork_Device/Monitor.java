package com.java_essential.diledsys.homeWork.homeWork_Device;

public class Monitor {
   private int resoutionX;
   private int getResoutionY;

    public Monitor(int resoutionX, int getResoutionY) {
        this.resoutionX = resoutionX;
        this.getResoutionY = getResoutionY;
    }

    @Override
    public String toString() {
        return "Monitor:" +
                "resoutionX= " + resoutionX +
                "getResoutionY= " + getResoutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;

        Monitor monitor = (Monitor) o;

        if (resoutionX != monitor.resoutionX) return false;
        return getResoutionY == monitor.getResoutionY;
    }

    @Override
    public int hashCode() {
        int result = resoutionX;
        result = 31 * result + getResoutionY;
        return result;
    }
}
