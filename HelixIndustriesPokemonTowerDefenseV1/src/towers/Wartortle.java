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
 * Wartortle.java - 
 */

public class Wartortle extends Tower
{
	private String name;
	private int buyPrice;//Price to place the tower
	private int sellPrice;//Money obtained from selling the tower
	private int upgradePrice;//Cost to upgrade the tower
	private Tower upgraded;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private File image;//Image for the tower
	private String type;//Tower's type
	
	public Wartortle(ArrayList<Attack> attacks)
	{
		name = "Wartortle";
		type = "Water";
		this.attacks = attacks;
		upgraded = new Blastoise(attacks);
	}
}