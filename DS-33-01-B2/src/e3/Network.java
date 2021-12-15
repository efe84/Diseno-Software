package e3;
import java.util.*;


public class Network implements NetworkManager{
    public int MAX = 5;
    String[][] tabla = new String[MAX][MAX];

    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterests) {
        int i,j,n=0;
        String interes;

        for (i=0;i<MAX;i++){
            if(tabla[i][0] == null) {
                for (j = 0; j < MAX && j<=topicOfInterests.size(); j++) {
                    if (j == 0) {
                        tabla[i][j] = user;
                    }else{
                        interes = topicOfInterests.get(n).getTopicOfInterest();
                        tabla[i][j] = interes;
                        n++;
                    }
                }
                break;
            }
        }
    }

    @Override
    public void removeUser(String user) {
        int i,j;
        for (i=0;i<MAX && tabla[i][0] != null;i++){
            if(tabla[i][0] == user){
                tabla[i][0] = null;
                for(j=0;j<MAX && tabla[i][j] != null;j++){
                    tabla[i][j] = null;
                }
            }
        }
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        int i,j;
        for(i=0;i<MAX;i++){
            if(tabla[i][0] == user) {
                for (j = 0; j < MAX; j++) {
                    if (tabla[i][j] == null) {
                        tabla[i][j] = topicOfInterest.getTopicOfInterest();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        int i,j;
        for (i=0;i<MAX;i++){
            if(tabla[i][0] == user){
                for (j=0;j<MAX;j++){
                    if(tabla[i][j] == topicOfInterest.getTopicOfInterest()){
                        tabla[i][j] = null;
                    }
                }
            }
        }

    }

    @Override
    public List<String> getUsers() {
        int i;
        List<String> ListaUsuarios = new ArrayList<>();
        for (i=0;i<MAX && (tabla[i][0] != null || tabla[i+1][0] != null);i++) {
            if (tabla[i][0] == null) {
            } else{
                ListaUsuarios.add(tabla[i][0]);
            }
        }
        return ListaUsuarios;
    }

    @Override
    public List<TopicOfInterest> getIterests() {
        int i,j;
        List<TopicOfInterest> ListaIntereses = new ArrayList<>();
        for (i=0;i<MAX && (tabla[i][0] != null || tabla[i+1][0] != null);i++) {
            for (j=1;j<MAX && tabla[i][j] != null;j++){
                //ListaIntereses.add(tabla[i][j]);
            }
        }
        return ListaIntereses;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        return null;
    }


}
