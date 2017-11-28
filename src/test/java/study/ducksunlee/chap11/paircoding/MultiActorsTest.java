package study.ducksunlee.chap11.paircoding;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.routing.RoundRobinPool;
import org.junit.Test;

/**
 * Created by LSD on 2017-11-28.
 */
public class MultiActorsTest {

    @Test
    public void execute() {
        final ActorSystem system = ActorSystem.create("actorSystem");
        final ActorRef ref = system
                .actorOf(Props.create(LongRunningActor.class)
                        .withRouter(new RoundRobinPool(3)));

        System.out.println("Sending m1" + Thread.currentThread().getName());
        ref.tell("Message 1 : ", null);
        System.out.println("Sending m2");
        ref.tell("Message 2 : ", null);
        System.out.println("Sending m3");
        ref.tell("Message 3 : ", null);

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
