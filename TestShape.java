package hinh2;

public class TestShape {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Triangle triangle1=new Triangle(2,4,2);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.toString());
    }
}
