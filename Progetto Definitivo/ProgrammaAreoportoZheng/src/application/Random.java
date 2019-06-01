package application;

import java.io.Serializable;

public class Random implements Serializable{
	
	public Random() {
		
	}
	public Random(long seed)
	{
		 Random rnd = new Random();
		 rnd.setSeed(seed);
	}
	public void setSeed(long seed)
	{
		
	}
}
