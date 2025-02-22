public class Time {
    private int hrs;
    private int mins;
    private int secs;

    public Time() {         //default constructor
        hrs = 0;
        mins = 0;
        secs = 0;

    }

    public Time(int h, int m, int s) {
        hrs = h;
        mins = m;          //alternate constructor
        secs = s;
    }

    public int getHours() {
        return hrs;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return mins;
    }

    public void setTime(int h, int m, int s) {
        hrs = (h >= 0 && h < 24) ? h : 0;
        mins = (m >= 0 && m < 60) ? m : 0;
        secs = (s >= 0 && s < 60) ? s : 0;
    }

    public void printTimeMilitary() {
        System.out.print((hrs < 10 ? "0" : "") + hrs + ":");
        System.out.print((mins < 10 ? "0" : "") + mins + ":");
        System.out.print((secs < 10 ? "0" : "") + secs);
    }

    public void printTimeStandard() {
        System.out.print((hrs == 0 || hrs == 12 ? 12 : hrs % 12) + ":");
        System.out.print((mins < 10 ? "0" : "") + mins + ":");
        System.out.print((secs < 10 ? "0" : "") + secs + " ");
        System.out.print((hrs < 12 ? "AM" : "PM"));
    }

    public String toString() {
        return hrs + ":" + mins + ":" + secs;
    }

    public boolean equals(Time t) {
        return (hrs == t.hrs && mins == t.mins && secs == t.secs);
    }

    public boolean notEquals(Time t ){
        return !(hrs == t.hrs && mins == t.mins && secs == t.secs);
    }

    public boolean lessOrEquals(Time t){
        return (hrs < t.hrs) || (hrs == t.hrs && mins < t.mins) || (hrs == t.hrs && mins == t.mins && secs <= t.secs);
    }

    public boolean lessThan(Time t) {
        return (hrs < t.hrs || hrs == t.hrs && mins < t.mins || hrs == t.hrs && mins == t.mins && secs < t.secs);
    }
    public boolean greaterThan(Time t){
        return (hrs > t.hrs) ||(hrs == t.hrs && mins > t.mins) ||(hrs == t.hrs && mins == t.mins && secs > t.secs);
}
    public boolean greaterThanOrEquals(Time t){
        return (hrs > t.hrs) ||(hrs == t.hrs && mins > t.mins) ||(hrs == t.hrs && mins == t.mins && secs >= t.secs);
    }
    
    public void advanceHrs() {
        hrs = (hrs + 1) % 24;
    }
    public void advanceMins(){
        mins = (mins +1)%60;
        if(mins == 0){
            advanceHrs();
       }
    }
    public void advanceSecs(){
        secs = (secs +1)%60;
        if(secs == 0){
            advanceMins();
       }
    }

    public void copy(Time t) {
        hrs = t.hrs;
        mins = t.mins;
        secs = t.secs;
    }
    public Time getCopy() {
       
        return new Time(hrs, mins, secs);
        } 
}