package com.chiharu.tree.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.chiharu.tree.MainGame;

public abstract class Entity {
	protected Texture texture;
	protected Vector2 curPos,		//position of entity
					initPos,		//the initial position of the entity before being moved by cursor
					direction;	//current direction of entity's movement
	

	public Entity(Texture texture, Vector2 curPos, Vector2 direction){
		this.texture = texture;
		this.curPos = curPos;
		this.initPos = curPos;
		this.direction = direction;
	}
	
	
	public abstract void update();
	/*
	public void update(){
		if ((curPos.x <= Gdx.input.getX() && Gdx.input.getX()  <= texture.getWidth() + curPos.x) &&
				(curPos.y <= adjustedY() && adjustedY() <= texture.getHeight() + curPos.y)) {
			if (Gdx.input.isButtonPressed(Buttons.LEFT)){
				System.out.println("x: "+ Gdx.input.getX());
				this.curPos.set(Gdx.input.getX() - texture.getWidth()/2, adjustedY() -  texture.getHeight()/2);
			}
		}
	}
	*/
	
	//get the normalized y coordinate for the cursor
	public int adjustedY(){
		return MainGame.HEIGHT -  Gdx.input.getY();
	}
	
	
	public void render(SpriteBatch sb) {
		sb.draw(texture, curPos.x, curPos.y);
	}
	
	public Vector2 getCurrentPosition() {
		return curPos;
	}
	
	public Vector2 getInitialPosition(){
		return initPos;
	}
	
	public void setCurrentPosition(Vector2 curPos) {
		this.curPos = curPos;
	}
	
	public void setInitialPosition(Vector2 initPos){
		this.initPos = initPos;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(curPos.x, curPos.y, texture.getWidth(), texture.getHeight());
	}
	
	public void setDirection(float x, float y) {
		direction.set(x, y);
	}
}
