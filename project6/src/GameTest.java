/**
 * Tester of the entire FreeCell Game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class GameTest{
    public static void main(String[] args) {
		GameModel game = new GameModel();
		System.out.println(game.toString());
		
		Tableau t1 = new Tableau();
		FreeCell f1 = new FreeCell();
		HomeCell h1 = new HomeCell();
	}
	
}
