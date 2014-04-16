package towers;

import java.io.File;
import java.util.ArrayList;
import model.Attack;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Ivysaur.java - 
 */

public class Ivysaur extends Tower
{
	private String name;
	private int buyPrice;//Price to place the tower
	private int sellPrice;//Money obtained from selling the tower
	private int upgradePrice;//Cost to upgrade the tower
	private Tower upgraded;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private File image;//Image for the tower
	private String type;//Tower's type
	
	public Ivysaur(ArrayList<Attack> attacks)
	{
		name = "Ivysaur";
		type = "Grass";
		this.attacks = attacks;
		upgraded = new Venusaur(attacks);
	}
}