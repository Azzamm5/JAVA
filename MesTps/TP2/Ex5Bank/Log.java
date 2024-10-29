package MesTps.TP2.Ex5Bank;

import java.time.LocalDate;
import java.time.LocalTime;

public class Log {
    private LocalDate date;
    private LocalTime time;
    private TypeLog type;
    private String message;


    // Getters
    public LocalDate getDate() {
        return date;
    }
    public LocalTime getTime() {
        return time;
    }
    public TypeLog getType() {
        return type;
    }
    public String getMessage() {
        return message;
    }



    // Setters
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public void setType(TypeLog type) {
        this.type = type;
    }
    public void setMessage(String message) {
        this.message = message;
    }



    // Constructeur
    public Log(LocalDate date, String msg) {
        this.date = date;
        this.message = msg;
    }
    public Log(LocalTime time, String msg, TypeLog type,LocalDate date) {
        this.date = date;
        this.time = time;
        this.message = msg;
        this.type = type;
    }
}

