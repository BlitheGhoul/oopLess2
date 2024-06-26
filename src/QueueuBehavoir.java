public interface QueueuBehavoir {
    void takeInQueueu (Actor aktor);
    void takeOrders(); // Сделать заказы
    void giveOrders(); // Забрать заказы
    void releaseFromQueue(); // Покинуть очередь
}
