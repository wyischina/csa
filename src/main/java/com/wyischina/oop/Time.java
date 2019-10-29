package com.wyischina.oop;

public class Time {
    int hour;
    int minute;
    int second;


    public Time (int hour, int minute, int second) {
        this.hour = 3;
        this.minute = 5;
        this.second = 9;
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
    public void setHour (int hour) {
        this.hour = hour;
    }
    public void setMinute (int minute) {
        this.minute = minute;
    }
    public void setSecond (int second) {
        this.second = second;
    }
    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString () {
        return "hh,mm,ss";
    }
    public Time nextSecond() {
        if (second < 59) {
            return new Time(hour, minute, second + 1);
        } else {
            if (second >= 59) {
                if (minute < 59)
                    return new Time(hour, minute + 1, 0);
            } else {
                if (minute >= 59) {
                    if (hour < 23) {
                        return new Time(hour + 1, 0, 0);
                    } else {
                        if (hour >= 23) {
                            return new Time(0, 0, 0);
                        }
                    }
                }
            }
        }
        return new Time(this.hour, this.minute, this.second +1);
    }
    public Time previousSecond() {
        if (second > 0) {
            return new Time(hour, minute, second-1);
        } else {
            if (second <= 0) {
                if (minute > 0) {
                    return new Time(hour, minute-1, second);
                } else {
                    if (minute <= 0) {
                        if (hour > 0) {
                            return new Time (hour-1, 0, 0);
                        } else {
                            if (hour <= 0) {
                                return new Time(0,0,0);
                            }
                        }
                    }

                }
            }
        }
        return new Time(this.hour, this.minute, this.second-1);
    }
}
