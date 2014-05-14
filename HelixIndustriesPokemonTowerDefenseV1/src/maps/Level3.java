package maps;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Timer;

import attacks.Attack;
import attacks.Ember;

import Mob.Bellsprout;
import Wave.Wave;
import Wave.Wave01;
import Wave.Wave02;
import Wave.Wave03;

import towers.Tower;
import towers.TowerID;
import view.ImageLoader;

import model.Game;
import model.Spawner;
import model.Tile;

public class Level3 extends Map{
	
	ImageLoader loader;

	private BufferedImage background;
	private String backgroundImageURL = "Images/level3 map.png";

	private final int WIDTH = 33;
	private final int HEIGHT = 26;
	
	public Level3(Game theGame){
		super();
		super.setGame(theGame);
		super.height = HEIGHT;
		super.width = WIDTH;

		theGame.setMap(this);
		loader = new ImageLoader();
		buildGrid(WIDTH, HEIGHT);

		try {
			this.background = loader.loadImage("Images/level3 map.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Wave> waves = new ArrayList<Wave>();
		waves.add(new Wave01());
		waves.add(new Wave02());
		waves.add(new Wave03());
		
		
		Spawner spawn = new Spawner(grid[0][11], waves, this);
		super.setSpawner(spawn);
		
		grid[0][11].setNextPathTile(grid[1][11]);
		grid[1][11].setNextPathTile(grid[2][11]);
		grid[2][11].setNextPathTile(grid[3][11]);
		
		super.buildPath();
		super.setLevels(waves.size());


	}

	@Override
	public Image getBackground() {
		// TODO Auto-generated method stub
		return this.background;
	}

}
