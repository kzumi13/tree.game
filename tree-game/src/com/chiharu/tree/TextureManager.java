package com.chiharu.tree;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

//Container class for all textures

public class TextureManager {
	
	public static Texture ENTITY = new Texture(Gdx.files.internal("libgdx.png"));
	public static Texture WATER = new Texture(Gdx.files.internal("water.png"));
	public static Texture LIGHT = new Texture(Gdx.files.internal("light.png"));
}
