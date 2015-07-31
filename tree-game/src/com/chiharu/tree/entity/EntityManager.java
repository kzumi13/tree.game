package com.chiharu.tree.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.chiharu.tree.TextureManager;

//when a block dies, give it a destination and then have it spawn and move to destination	

public class EntityManager {
	
	private final int AMOUNTY = 8, AMOUNTX = 8;
	
	private Entity[][] entities= new Entity[AMOUNTY][AMOUNTX];
	private final int offset = 15; //pixel offset for game board 
	private int min = 0,
				max = 2;
	
	public EntityManager() {
		//@ TODO put fill this out
		int x = offset, y = offset;
		
		for (int i = 0; i < AMOUNTY; i+=1) {
			for(int j = 0; j < AMOUNTX; j+=1) {
				System.out.println("generated: " + x + " " + y);
				entities[i][j] = genRandom(new Vector2(x,y));
				x = x + TextureManager.WATER.getWidth() + offset;
			}
			x = offset;
			y = y + TextureManager.WATER.getHeight() + offset;
		}
		
	}
	
	public void update(){
		for (Entity[] ee: entities) {
			for(Entity e: ee ){
				if (e != null)
					e.update();
			}
		}
		
	}
	
	public void render(SpriteBatch sb) {
		for (Entity[] ee: entities) {
			for (Entity e: ee ) {
				if (e != null)
					e.render(sb);
			}
		}
	}
	
	private Gem genRandom(Vector2 curPos){
		int rand = min + (int)(Math.random()*max);
		switch (rand) {
			case 0: 	return new Gem(TextureManager.WATER, curPos, 0);
			case 1:		return new Gem(TextureManager.LIGHT, curPos, 1);
			default:	return new Gem(TextureManager.WATER, curPos, 0);
			
		}
	}
	
}
