
public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected String order;
    public Actor(String name){
        this.name = name;
    }
    public abstract String getName();
}