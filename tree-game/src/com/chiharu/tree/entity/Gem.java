package com.chiharu.tree.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Gem extends Entity{

	protected int type; //0: water
						//1: light
						// the rest are a mystery...
	
	public Gem(Texture texture,Vector2 curPos, int type) {
		super(texture, curPos, new Vector2(0,0));
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if ((curPos.x <= Gdx.input.getX() && Gdx.input.getX()  <= texture.getWidth() + this.curPos.x) &&
				(this.curPos.y <= adjustedY() && adjustedY() <= texture.getHeight() + this.curPos.y)) {
			if (Gdx.input.isButtonPressed(Buttons.LEFT)){
				System.out.println("x: "+ Gdx.input.getX());
				this.curPos.set(Gdx.input.getX() - texture.getWidth()/2, adjustedY() -  texture.getHeight()/2);
			}
		}
	}

}
