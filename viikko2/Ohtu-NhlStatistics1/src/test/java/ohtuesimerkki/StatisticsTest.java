
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class StatisticsTest {
    
    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    @Before
    public void setUp() throws Exception {
        stats = new Statistics(readerStub);
    }

    @Test
    public void findPlayerbyName() {
        Player player = stats.search("Kurri");
        assertEquals("EDM", player.getTeam());
        assertEquals(37, player.getGoals());
        assertEquals(53, player.getAssists());
        assertEquals(null, stats.search("Luukkainen"));
    }
    
    @Test
    public void findPlayersInTeam() {
        List players = stats.team("EDM");
        assertEquals(3, players.size());
    }
    
    @Test
    public void findTopScorers() {
        assertEquals(2, stats.topScorers(2).size());
    }
    
}
