/*
 *@ (#) TestRectangle.java        1.0     29/08/2024
 *
 *Copyright (c) 2024 IUH. All right reserved.
 */
package iuh.fit.se;
/*
 * @description: Lớp này đại diện cho một hình chữ nhật với các phương thức tính diện tích và chu vi.
 * @author:   Hoang Ngoc Hai
 * @date:     29/08/2024
 * @version:     1.0
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
