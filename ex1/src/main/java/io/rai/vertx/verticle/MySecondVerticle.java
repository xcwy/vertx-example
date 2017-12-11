package io.rai.vertx.verticle;

import io.vertx.core.AbstractVerticle;

/**
 * Created by rai on 2017/12/10.
 */
public class MySecondVerticle extends AbstractVerticle {

  public void start() {
    vertx.createHttpServer().requestHandler(req -> {
      req.response()
          .putHeader("content-type", "text/plain")
          .end("Hello vert.x!");
    }).listen(8090);
  }

}