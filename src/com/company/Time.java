package com.company;

public class Time {

    private int hr;
    private int min;
    private int seconds;

    public Time() {

    }

    public Time(int hr, int min, int seconds) {
        this.hr = hr;
        this.min = min;
        this.seconds = seconds;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void checksSetTime() {
        if (hr > 24 || min > 60 || seconds > 60) {
            System.out.println("input is incorrect");
        }
    }

    public void displaysData() {
        System.out.println("hr = " + hr);
        System.out.println("min = " + min);
        System.out.println("seconds = " + seconds);

    }

}
