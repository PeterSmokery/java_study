import java.io.*;
import java.util.Scanner;
//пока что input.txt не используется

public class homework_first {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите целове число которое хотите возвести в степень: ");
        int a = iScanner.nextInt();
        System.out.printf("введите целую степень в которую хотите возвести: ");
        int b = iScanner.nextInt();
        double res = Math.pow(a, b);
        File f = new File("output.txt");
        if (f.exists() && !f.isDirectory()) {
            System.out.println("файл уже существует.перезаписать?1-да,0-нет");
            Scanner consoleScan = new Scanner(System.in);
            int think = consoleScan.nextInt();
            if (think == 1)
                try (FileWriter fw = new FileWriter("output.txt", false)) {
                    if (a == 0 & b == 0)
                        fw.write("Ответ:не определено");
                    else {
                        fw.write("Ответ:");
                        fw.write(Double.toString(res));
                        fw.flush();
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

        }

    }
}
