import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scnew = new Scanner(System.in);
        int a = scnew.nextInt();
        int b = scnew.nextInt();
        int r = scnew.nextInt();
        double circleArea = 3.14 * (r * r);
        double rectangleArea = a * b;
        if (circleArea > rectangleArea)
            System.out.println("Картонка с данным радиусом закрывает прямоугольник");
        else
            System.out.println("Картонка с данным радиусом не закрывает прямоугольник");

        }
    }

