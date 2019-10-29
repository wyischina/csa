package OOP;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
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
        return this.hour + ":" + this.minute + ":" + this.second;
    }
    public Time nextSecond(){
        if (second >= 59){
            new Time (this.hour, this.minute + 1, 0);
            if(minute >= 59){
                return new Time (this.hour + 1, 0, 0);
            }else{
                return new Time(this.hour, this.minute +1, 0);
            }
        }else{
            return new Time(this.hour, this.minute, this.second +1);
        }
    }
    public Time previousSecond(){
        if(second <= 0){
            new Time(this.hour, this.minute -1, this.second = 59);
            if(minute <= 1){
                return new Time(this.hour -1, 59, 59 );
            }else{
                return new Time(this.hour, this.minute -1, 59);
            }
        }else{
            return new Time(this.hour, this.minute, this.second - 1);
        }
    }


}
