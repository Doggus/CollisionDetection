package com.mygdx.game;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.CollisionDetection.Direction;

public class Entity {
    public CollisionDetection game;
    public float x;
    public float y;
    public float dx;
    public float dy;
    public int width;
    public int height;
    public float speed;
    public Texture texture;
    public Pixmap pix;

    public Entity(CollisionDetection game, float x, float y, int width, int height, float speed, Texture tex) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.texture = tex;

        if (!tex.getTextureData().isPrepared())
        {
            tex.getTextureData().prepare();
        }
        this.pix = tex.getTextureData().consumePixmap();
    }

    public void update(float delta) {

    }

    public void move(float newX, float newY) {
        x = newX;
        y = newY;
    }

    public void render() {

    }

    public void tileCollision(int tile, int tileX, int tileY, float newX, float newY, Direction direction) { // sasha told me old code was unnecessary
        System.out.println("tile collision at: " + tileX + " " + tileY);
    }


    public void entityCollision(Entity e2, float newX, float newY, Direction direction) {
        System.out.println("entity collision around: " + newX + " " + newY);
        //move(newX, newY);
        //could also resolve entity collisions in the same we do tile collision resolution
    }


}
