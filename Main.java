import java.util.Scanner;

public class Main {

    public static void emojiWorldIntro() {
        System.out.println("🕊️💵🪬🎉🍕🎬☀️🏈🛼🎹☀️❤️");
        System.out.println("🚦 Emoji 😎🎢🌍🐙 World 🚦");
        System.out.println("🌊👑🦊🐠🍇🍄🎂🥎⛳️🏎️💨🐲");
    }

    public static void spacer() {
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int columns;
        int rows;
        String emoji;

        // methods
        emojiWorldIntro();
        spacer();

        while (true) {

            // emoji input
            spacer();
            System.out.print("Enter 🚥 Columns: ");
            columns = scan.nextInt();
            System.out.print("Enter 🚦 Rows: ");
            rows = scan.nextInt();
            System.out.print("Enter 🦖 Emoji: ");
            emoji = scan.next();
            spacer();

            if (columns == -1 || rows == -1 || emoji.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for stopping by... 'til next time! 👋🏽👋👋🏻\n");
                emojiWorldIntro();
                break;
            }

            // emoji loop
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print(emoji);
                }

                spacer();

            }
        }
    }
}