package com.company;

public class Main {

    public static void main(String[] args) {
	    User user1 = new User();
	    user1.setName("Vasya");
	    user1.setAge(16);
	    User user2 = new User();
        user2.setName("Vasya");
        user2.setAge(-16);
        // user1 не равно user2, поскольку ссылки user1 и user2 указывают на разные области памяти
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        // обязательно должно соблюдаться правило,
        // если x.equals(y) == true, то и
        // x.hashCode() == y.hashCode() == true
        // но это не тождественно правилу
        // x.hashCode() == y.hashCode() == true, то
        // и x.equals(y) должен возвращать true
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        if (user1.hashCode() == user2.hashCode()) {
            if (user1.equals(user2)) {
                System.out.println("user1 == user2");
            } else {
                System.out.println("user1 != user2");
            }
        }
        User user3 = user2;
        // x.equals(y) == y.equals(x)   !!!ВАЖНО
        System.out.println(user3.equals(user2));
        System.out.println(user3.hashCode());
        System.out.println(user1.getClass());
        System.out.println(user1.toString());
        //
        new UserFactory()
                .signIn(" some@mail.ru")
                .sendMessage(": hello!")
                .deactivate()
                .sendMessage("How are you?")
                .activate()
                .sendMessage(": Hey!")
                .signOut();
    }
}
