package com.wyischina.oop;

public class Time {
    int hour;
    int minute;
    int second;

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
    public String nextSecond(){
        this.second++;
        if(this.second >=59){
            this.minute++;
            this.second = this.second-60;
            if(this.minute >= 59){
                this.hour++;
                this.minute = 0;
                if(this.hour >= 23){
                    this.hour = 0;
                    this.minute = 0;
                    this.second = 0;
                }
            }
            return this.hour+":"+this.minute+":"+this.second;
        } else{
            return this.hour+":"+this.minute+":"+this.second;
        }
    }

    public String previousSecond(){
        this.second--;
        if(this.second <0){
            this.minute--;
            this.second = 60 + this.second;
            if(this.minute < 0){
                this.hour--;
                this.minute = 60 + this.minute;
                if(this.hour < 0){
                    this.hour = 23;
                    this.minute = 59;
                    this.second = 59;
                }
            }
            return this.hour+":"+this.minute+":"+this.second;
        } else{
            return this.hour+":"+this.minute+":"+this.second;
        }
    }


    public String toString(){
        return this.hour+":"+this.minute+":"+this.second;
    }
}
