package Wave;

import java.awt.image.BufferedImage;

import Mob.GravelerMob;
import Mob.Machop;
import Mob.Marowak;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Onix;
import Mob.Zubat;

public class Wave44 extends Wave{

	private int delay = 400;
	private int level = 44;
	

	public Wave44(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 3000; i++){
			if(i % 8 == 0)
				add(m.buildMob(MobID.ONIX));
			else if(i % 7 == 0)
				add(m.buildMob(MobID.MACHOP));
			else if(i % 6 == 0)
				add(m.buildMob(MobID.GRAVELER));
			else if(i % 5 == 0)
				add(m.buildMob(MobID.MAROWAK));
			else
				add(m.buildMob(MobID.ZUBAT));
		}
	}

}