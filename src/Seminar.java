import java.util.ArrayList;

public class Seminar {
    public static void main(String[] args) {
        // Оригинальный код: Использование необобщенного типа ArrayList без указания типа
        // Рефакторинг: Использование generics для указания типа элементов в ArrayList
        ArrayList<Object> arrayList1 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add("ABC");
        arrayList1.add(false);

        // Оригинальный код: Создание списка на основе массива без указания его емкости
        // Рефакторинг: Использование обобщенного MyArrayList с указанной емкостью
        MyArrayList<Integer> myArrayList = new MyArrayList<>(new Integer[100]);
        myArrayList.add(2);
        myArrayList.add(10);
        myArrayList.add(5);
        System.out.println("Количество элементов в моей коллекции: " + myArrayList.size());

        // Создание экземпляров Person, Entity, CreditAccount, DebitAccount и Transaction
        Person person = new Person("FIO #1", "100002340");
        Entity entity = new Entity("NAME #1", "200001212");

        // Оригинальный код: Использование необобщенного типа для CreditAccount и DebitAccount
        // Рефакторинг: Использование generics для указания типа PersonalData для CreditAccount и DebitAccount
        CreditAccount<Person> creditAccount = new CreditAccount<>(person, 30);
        DebitAccount<Entity> debitAccount = new DebitAccount<>(entity, 3000000);

        // Оригинальный код: Использование необобщенного типа для Transaction
        // Рефакторинг: Использование generics для указания типа Account для Transaction
        Transaction<Account> transaction = new Transaction<>(debitAccount, creditAccount, 2000);
        transaction.execute();
    }
}
