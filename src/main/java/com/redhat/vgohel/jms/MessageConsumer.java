package com.redhat.vgohel.jms;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class MessageConsumer{

  @Incoming("queueA-transformed")
  public void sinkA(Long msg){
    System.out.println("Message from Transformer : " + msg);
  }

  @Incoming("queueB-transformed")
    public void sinkB(String msg) {
        System.out.println("Message from Transformer: "+msg);

    }
}
