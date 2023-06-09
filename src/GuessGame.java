public class GuessGame {
    Player p1;
    Player p2;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");
        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);
            p1.guess();
            p2.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (p1isRight || p2isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки не угадали. Нужно попробывать еще.");
            }

        }
    }
}
