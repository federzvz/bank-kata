package Classes;

public class Date {
    int day,mounth,year;
    String date;

    public Date() {
        this.date="0/0/0000";
        this.day=0;
        this.mounth=0;
        this.year=0;
    }

    public Date(String dateParam) {
        this.date = dateParam;
        String[] values = dateParam.split("/");
        this.day = Integer.parseInt(values[0]);
        this.mounth = Integer.parseInt(values[1]);
        this.year = Integer.parseInt(values[2]);
    }

    public int getDay() {return day;}

    public void setDay(int day) {this.day = day;}

    public int getMounth() {return mounth;}

    public void setMounth(int mounth) {this.mounth = mounth;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getDate() {return date;}

    public void setDate(String date) {this.date = date;}
}
