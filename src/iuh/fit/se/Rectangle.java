/*
 *@ (#) Rectangle.java        1.0     29/08/2024
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

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(){

    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length +width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
}
