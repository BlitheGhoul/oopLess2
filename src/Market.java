import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueuBehavoir{

    public List<Actor> actors = new ArrayList<>();
    public List<String> orders = new ArrayList<>();
    public List<Actor> queueToOrder = new ArrayList<>();;
    //private Queue<Actor> queueToGiveOrder = new LinkedList<>();
    @Override
    public void acceptToMarket(Actor actor) {//1
        actors.add(actor);

    }

    @Override
    public void releaseFromMarket(Actor actor) {//6
        actors.removeFirst();

    }

    @Override
    public void update(String order) {
        if (actors.get(0).isTakeOrder) {
            orders.remove(order);
        } else orders.add(order);
    }

    @Override
    public void takeInQueueu(Actor aktor) {//2
        queueToOrder.add(aktor);

    }

    @Override
    public void takeOrders() {//4
        queueToOrder.get(0).setTakeOrder(true);
        update(queueToOrder.get(0).order);

    }

    @Override
    public void giveOrders() { //3
        queueToOrder.get(0).setMakeOrder(true);
        update(queueToOrder.get(0).order);


    }

    @Override
    public void releaseFromQueue() {//5
        queueToOrder.remove(0);

    }
}