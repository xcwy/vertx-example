package io.rai.vertx.verticle;

import io.vertx.core.AbstractVerticle;

/**
 * Created by rai on 2017/12/10.
 */
public class MyFirstVerticle extends AbstractVerticle {

  public void start() {
    vertx.createHttpServer().requestHandler(req -> {
      req.response()
          .putHeader("content-type", "text/plain")
          .end("Hello World!");
    }).listen(8080);
  }

}