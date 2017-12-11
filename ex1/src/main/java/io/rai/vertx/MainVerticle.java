package io.rai.vertx;

import io.rai.vertx.verticle.MyFirstVerticle;
import io.rai.vertx.verticle.MySecondVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

/**
 * Created by rai on 2017/12/10.
 */
public class MainVerticle extends AbstractVerticle{

  @Override
  public void start() {
    vertx.deployVerticle(MyFirstVerticle.class.getName());
    vertx.deployVerticle(MySecondVerticle.class.getName());
  }
}
