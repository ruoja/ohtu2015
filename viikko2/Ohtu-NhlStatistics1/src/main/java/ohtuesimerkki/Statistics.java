package ohtuesimerkki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Statistics {

    private List<Player> players;

<<<<<<< HEAD
    public Statistics() {
        PlayerReader reader = new PlayerReader("http://nhlstats-2013-14.herokuapp.com/players.txt");
        players = reader.getPlayers();       
=======
    public Statistics(Reader reader) {
        Reader playerReader = reader;
        players = playerReader.getPlayers();       
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
    }

    public Player search(String name) {
        for (Player player : players) {
            if (player.getName().contains(name)) {
                return player;
            }
        }

        return null;
    }

    public List<Player> team(String teamName) {
        ArrayList<Player> playersOfTeam = new ArrayList<Player>();
        
        for (Player player : players) {
            if ( player.getTeam().equals(teamName)) {
                playersOfTeam.add(player);
            }
        }
        
        return playersOfTeam;
    }

    public List<Player> topScorers(int howMany) {
        Collections.sort(players);
        ArrayList<Player> topScorers = new ArrayList<Player>();
        Iterator<Player> playerIterator = players.iterator();
        
<<<<<<< HEAD
        while (howMany>=0) {
=======
        while (howMany>0) {
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
            topScorers.add( playerIterator.next() );            
            howMany--;
        }
        
        return topScorers;
    }

}
