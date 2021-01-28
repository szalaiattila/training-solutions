package introdate;

import java.time.*;

public class Performance {

    private String artist;
    private LocalDate date;
    private LocalTime start;
    private LocalTime end;

    public Performance (String artist,LocalDate date, LocalTime start, LocalTime end);{
        this.artist = artist;
                this.date = date;
                        this.start = start;
                                this.end = end;
    }

    public String getArtist() {
        return artist;
    }
    public String getDate(){
        return date;
    }
    public String getKezdes(){
        return artist + ":" + "start" + "-" + "end";
    }

}

