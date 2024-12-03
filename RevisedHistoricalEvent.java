public class RevisedHistoricalEvent extends HistoricalEvent {

    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent(String description, Date eventDate, String revisedDescription, String citation) {
        super(description, eventDate);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }
    
    // SETTERS/GETTERS

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    @Override
    public String toString() {
        return "The following 'history' was told for many years:\n\n" 
            + super.toString() +  "\n\n"
            +  "By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong\n" 
            + "Here is the revised history:\n" 
            + revisedDescription + "\n\n" 
                + "Source: " + citation;
    }
}
