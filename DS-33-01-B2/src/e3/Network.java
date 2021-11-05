package e3;

import java.util.List;

interface intNetwork{
    void addUser(String user, List<TopicOfInterest> topicOfInterests);
    void removeUser(String user);
    void addInterest(String user, TopicOfInterest topicOfInterest);
    List<String> getUsers();
    List<TopicOfInterest> getIterests();
    List<TopicOfInterest> getInterstsUser(String user);
}
public class Network {
}
