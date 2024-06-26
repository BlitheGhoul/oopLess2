import java.util.List;

    public interface MarketBehaviour {
        void acceptToMarket(Actor actor);// заходит в магазин
        void releaseFromMarket(Actor actor);//  выходит из магазина
        void update(String order);// обновить(?)
    }

