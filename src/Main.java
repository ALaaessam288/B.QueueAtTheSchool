import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();
        char[] queue = s.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < x - 1 ; j++) {
                if (queue[j] == 'B' && queue[j + 1] == 'G') {
                    char temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                    j++;
                }
            }
        }

        System.out.println(new String(queue));
    }
}
//GBBGBBBGGGGGBBGGBBBBGGGBBBGBBBGGBGGBGBBBGGBGGBGGBG
//GGBGBGBGBGBGGGBBGBGBGBGBBBGBGBGBGBGBGBGBGBGBGGBBGB
//GGBGBGBGBGBGGGBBGBGBGBGBBBGBGBGBGBGBGBGBGBGBGGBGBB