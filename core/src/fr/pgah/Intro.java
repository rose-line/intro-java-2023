package fr.pgah;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Intro extends ApplicationAdapter {
  SpriteBatch batch;
  Texture img;

  @Override
  public void create() {
    batch = new SpriteBatch();
    img = new Texture("sio.jpg");
  }

  @Override
  public void render() {
    // ScreenUtils.clear(1, 0, 0, 1);
    batch.begin();
    batch.draw(img, 0, 0);
    batch.end();
  }
}
