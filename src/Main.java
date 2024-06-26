//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human first = new Human("Olga"); // Человек по имени Ольга
        first.myOrder("Ananas"); // Ольга хочет ананас
        Market magazin = new Market(); // Ольга видит магазин, с интригующим названием "Магазин"

        magazin.acceptToMarket(first); // Ольга вошла в Магазин и стала его посетителем
        System.out.println("Посетители магазина: " + magazin.actors); // Посмотрим список
        // посетителей Магазина

        magazin.takeInQueueu(first);// Ольга встала в очередь, у прилавка
        System.out.println("Очередь у прилавка: " + magazin.queueToOrder);// Посмотрим как много
        // человек в очереди

        magazin.giveOrders();// Так как кроме Ольги у прилавка никого нет,
        // она сразу называет свой заказ, а продавец запрашивает товар в терминале
        System.out.println("Заказы: " + magazin.orders);// Посмотрим как много заказов Магазина,
        // сейчас ожидают сборки

        magazin.takeOrders();// Вот, заказ готов. Его выносят Ольге в красивой упаковке.
        // Продавец отмечает в терминале выдачу заказа
        System.out.println("Заказы: " + magazin.orders);// Посмотрим как много заказов Магазина,
        // сейчас ожидают сборки

        magazin.releaseFromQueue();//Довольная Ольга отходит от прилавка и проверяет заказ.
        System.out.println("Очередь у прилавка: " + magazin.queueToOrder);// Посмотрим как много
        // человек сейчас у прилавка

        magazin.releaseFromMarket(first);//Убедившись в том, что ей выдали Ананас,
        // Ольга покидает магазин
        System.out.println("Посетители магазина: " + magazin.actors); // Посмотрим список
        // посетителей Магазина
    }
}