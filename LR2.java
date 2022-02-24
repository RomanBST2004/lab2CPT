public class LR2 {
    public static void main(String[] args) { // метод, выводящая все простые числа в диапазоне цикла for 
        Point3d firstPoint = new Point3d (2, 3, 4);// создает точку (6.5, 3.45, 7.2)
        Point3d secondPoint = new Point3d (2, 3, 4);// создает точку (2,3,4)
        Point3d thirdPoint = new Point3d (9.77, 4, 3.67); // создает точку (9.77, 4, 9.67)
        System.out.println("x coordinate = " + firstPoint.getX() // печать трёх координат точки
                + ", y coordinate = "
                + firstPoint.getY() + ", z coordinate = " + firstPoint.getZ());
       System.out.println("x coordinate = " + secondPoint.getX()
                + ", y coordinate = "
                + secondPoint.getY() + ", z coordinate = " + secondPoint.getZ());
        System.out.println("x coordinate = " + thirdPoint.getX()
                + ", y coordinate = "
                + thirdPoint.getY() + ", z coordinate = " + thirdPoint.getZ());
        if ((Point3d.coordComparison(firstPoint, secondPoint) | Point3d.coordComparison(firstPoint, thirdPoint) | // проверка равенства двух точек
            Point3d.coordComparison(secondPoint, thirdPoint))  == true) {
            System.out.println("Значения двух точек равны! Я отказываюсь считать площадь!");
        }
        else {
            double Area = computeArea(firstPoint, secondPoint, thirdPoint);
            String formattedArea = String.format("%.2f", Area); // ограничение на печать до двух знаков после запятой
            System.out.println(formattedArea + " - area");
        }
    }
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) { // метод для расчёта площади треугольника 
    double a = Point3d.distanceTo(point1, point2); // вычисление расстояния с помощью метода из класса Point3d
    double b = Point3d.distanceTo(point2, point3);
    double c = Point3d.distanceTo(point1, point3);
    
    double p = (a + b + c)/2; // формула полупериметра 
    double area = Math.sqrt(p*(p-a)*(p-b)*(p-c)); // формула Герона
    return area; 
    }
}
