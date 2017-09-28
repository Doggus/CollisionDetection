package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
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

    public Entity(CollisionDetection game, float x, float y, int width, int height, float speed, Pixmap p) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.texture = new Texture(p);
        this.pix = p;
    }

    public void update(float delta) {

    }

    public void move(float newX, float newY) {
        x = newX;
        y = newY;
    }

    public void render() {

    }

    public void tileCollision(int tile, int tileX, int tileY, float newX, float newY, Direction direction) {
       // System.out.println("tile collision at: " + tileX + " " + tileY);
        System.out.println(pix.getPixel(0,0));

        if(direction == Direction.U) {
            y = tileY * game.tileSize + game.tileSize;
        }
        else if(direction == Direction.D) {
            y = tileY * game.tileSize - height;
        }
        else if(direction == Direction.L) {
            x = tileX * game.tileSize + game.tileSize;
        }
        else if(direction == Direction.R) {
            x = tileX * game.tileSize - width;
        }
    }


    public void entityCollision(Entity e2, float newX, float newY, Direction direction) {
        //System.out.println("entity collision around: " + newX + " " + newY);
        System.out.println(pix.getPixel(0,0));
        move(newX, newY);
        // could also resolve entity collisions in the same we do tile collision resolution

    }

}
