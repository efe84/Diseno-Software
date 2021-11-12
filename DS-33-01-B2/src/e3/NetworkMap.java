package e3;

import java.security.Key;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class NetworkMap implements NetworkManager {

    private HashMap<String,List<TopicOfInterest>> newMap= new HashMap<String,List<TopicOfInterest>>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterests) {
        newMap.put(user,topicOfInterests);
    }

    @Override
    public void removeUser(String user) {
        newMap.remove(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {

    }

    @Override
    public List<String> getUsers() {
        return new ArrayList<>(newMap.keySet());
    }

    @Override
    public List<TopicOfInterest> getIterests() {
        return null;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        return null;
    }
}
