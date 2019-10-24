package com.wyischina.oop;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        String timeString = "";

        if (this.getHour() < 10) {
            timeString += "0";
        }

        timeString += hour;
        timeString += ":";

        if (this.getMinute() < 10) {
            timeString += "0";
        }

        timeString += minute;
        timeString += ":";

        if (this.getSecond() < 10) {
            timeString += "0";
        }

        timeString += second;

        return timeString;
    }

    public Time nextSecond(){
        this.second++;
        return this;
    }

    public Time previousSecond(){
        this.second--;
        return this;
    }
}
