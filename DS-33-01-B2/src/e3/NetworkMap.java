package e3;

import java.security.Key;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class NetworkMap implements NetworkManager {

    private HashMap<String,List<TopicOfInterest>> newMap;

    public NetworkMap(){
        newMap = new HashMap<>();
    }

    public String toString(){
        String concat = "";
        for(String user : this.getUsers()){
            concat += String.format("%s%s ", user, this.getInterestsUser(user));
        }
        return concat;
    }

    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterests) {
        this.newMap.put(user,topicOfInterests);
    }

    @Override
    public void removeUser(String user) {
        newMap.remove(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        newMap.get(user).add(topicOfInterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
         newMap.get(user).remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {
        return new ArrayList<>(newMap.keySet());
    }

    @Override
    public List<TopicOfInterest> getIterests() {
        List<TopicOfInterest> listaUsers = new ArrayList<>();
        for(String usuario : newMap.keySet()){
            for(TopicOfInterest interes: newMap.get(usuario)){
                if(!listaUsers.contains(interes)){
                    listaUsers.add(interes);
                }
            }
        }
        return listaUsers;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        return newMap.get(user);
    }
}
