package study.ducksunlee.chap11.paircoding;

import akka.actor.UntypedActor;

/**
 * Created by LSD on 2017-11-28.
 */
public class LongRunningActor extends UntypedActor {
    @Override
    public void onReceive(Object message) {
        System.out.printf("Being run on ActorRef(Thread name : %s): %s%n", Thread.currentThread().getName(), getSelf());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Received %s%n", message);
    }
}
