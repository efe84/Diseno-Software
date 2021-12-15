package e3;

public class TopicOfInterest {
    public String interest;
    public String toString(){
        return this.getTopicOfInterest();
    }
    public TopicOfInterest(String interest){
        this.interest = interest;
    }
    public String getTopicOfInterest(){
        return interest;
    }
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof TopicOfInterest)) return false;
        return this.interest.equals(((TopicOfInterest)o).interest);
    }
}
