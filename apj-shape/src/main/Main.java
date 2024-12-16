package main;

import com.codegym.Circle;
import com.codegym.Rectangle;
import service.Resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Resizeable[] shapes = new Resizeable[2];

        // Tạo các hình với kích thước ban đầu
        shapes[0] = new Circle(5.0); // Bán kính 5.0
        shapes[1] = new Rectangle(4.0, 6.0); // Rộng 4.0, dài 6.0

        // Duyệt qua từng hình và thay đổi kích thước
        for (Resizeable shape : shapes) {
            double randomPercent = 1 + random.nextInt(100); // Tỉ lệ ngẫu nhiên 1-100%
            System.out.println("Before resize:");
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Circle area: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Rectangle area: " + rectangle.getArea());
            }

            // Resize hình
            shape.resize(randomPercent);

            System.out.println("Resize by " + randomPercent + "%");
            System.out.println("After resize:");
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Circle area: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Rectangle area: " + rectangle.getArea());
            }

            System.out.println();
        }
    }
}
