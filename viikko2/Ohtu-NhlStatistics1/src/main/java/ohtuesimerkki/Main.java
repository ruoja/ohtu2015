package ohtuesimerkki;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Statistics stats = new Statistics();
=======
        Statistics stats = new Statistics(new PlayerReader("http://nhlstats-2013-14.herokuapp.com/players.txt"));
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
          
        System.out.println("Philadelphia Flyers");
        for (Player player : stats.team("PHI") ) {
            System.out.println( player );
        }
        
        System.out.println("");
        
        System.out.println("Top scorers");
        for (Player player : stats.topScorers(10) ) {
            System.out.println( player );
        }        
    }
}
