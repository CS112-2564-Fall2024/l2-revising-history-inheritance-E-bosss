public class HistoricalEvent {

    private String description;
    private Date eventDate = new Date();

    //CONSTRUCTOR
    public HistoricalEvent(String description, Date eventDate) {
        this.description = description;
        this.eventDate = eventDate;
    }

    // GETTERS/SETTERS
    public String getDescription() {
        return description;
    }

    public void setDescrption(String description) {
        this.description = description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    //toString
    public String toString() {
        return "On "  + eventDate + ": "  + description;
    }
}
