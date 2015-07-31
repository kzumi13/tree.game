package com.chiharu.tree.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.chiharu.tree.camera.OrthoCamera;
import com.chiharu.tree.entity.EntityManager;

public class GameScreen extends Screen {

	private OrthoCamera camera;
	private EntityManager entityManager;
	
	@Override
	public void create() {
		camera = new OrthoCamera();
		entityManager = new EntityManager();
	}
	
	@Override
	public void update(){
		camera.update();
		entityManager.update();
	}

	@Override
	public void render(SpriteBatch sb) {
		sb.setProjectionMatrix(camera.combined);
		sb.begin();
		entityManager.render(sb);
		sb.end();
		
	}

	@Override
	public void resise(int width, int height) {
		camera.resize();
	}

	@Override
	public void dispose() {	
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	

}
