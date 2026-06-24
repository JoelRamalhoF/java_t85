import java.util.Scanner;

public class Menu {


    	public static void main(String[] args) {
    		 
    		LojaGame game1 = new LojaGame("Fifa", 320.0f, 1, 3, 18, 2);
    		game1.visualizar();
    			
    		LojaGame game2 = new LojaGame("COD Black OPS", 150.0f, 2, 1, 18, 2);
    		game2.visualizar();
    		
    		LojaGame game3 = new LojaGame("Mortal Kombat", 90.0f, 3, 3, 18, 2);
    		game3.visualizar();
    		
    		
    	}
    }