package com.wyischina.oop;

public class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        if (second >= 59) {
            if (minute >= 59) {
                if (hour >= 23) {
                    return new Time(0, 0, 0);
                }
                return new Time(this.hour + 1, 0, 0);
            }
            return new Time(this.hour, this.minute + 1, 0);
        } else {
            return new Time(this.hour, this.minute, this.second + 1);
        }
    }

    public Time previousSecond() {
        if (second >= 59) {
            if (minute >= 59) {
                return new Time(this.hour - 1, 0, 0);
            }
            return new Time(this.hour, this.minute - 1, 0);
        }
        return new Time(this.hour, this.minute, this.second - 1);
    }
}
