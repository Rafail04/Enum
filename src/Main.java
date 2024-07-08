import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    }
    enum Days {
        monday, tuesday, wednesday, day;

        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Days day = Days.valueOf(sc.nextLine());

            switch (day) {
                case monday:
                    System.out.println("monday");
                    break;
                case tuesday:
                    System.out.println("tuesday");
                    break;
                case wednesday:
                    System.out.println("wednesday");
            }
        }

}

