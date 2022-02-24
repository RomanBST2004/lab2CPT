public class Point3d extends Point2d {
    public static void main(String[] args) { // метод, выводящая все простые числа в диапазоне цикла for 
        Point3d firstPoint = new Point3d (2, 3, 45); //создает точку (6.5, 3.45, 7.2)
        Point3d secondPoint = new Point3d (2, 3, 6); //создает точку (2,3,4)
        Point3d thirdPoint = new Point3d (15, 15, 15); //создает точку (9.77, 4, 9.67)
        System.out.println("x coordinate = " + firstPoint.getX() //печать трёх координат точки
                + ", y coordinate = "
                + firstPoint.getY() + ", z coordinate = " + firstPoint.getZ());
        System.out.println("x coordinate = " + secondPoint.getX()
                + ", y coordinate = "
                + secondPoint.getY() + ", z coordinate = " + secondPoint.getZ());
        System.out.println("x coordinate = " + thirdPoint.getX()
                + ", y coordinate = "
                + thirdPoint.getY() + ", z coordinate = " + thirdPoint.getZ());
        System.out.println("Any 2 objects are equals? " + (coordComparison(firstPoint, secondPoint))); // метод coordComparison
        double distanceTo = distanceTo(firstPoint, thirdPoint);
        String formattedDistance = String.format("%.2f", distanceTo); // ограничение на печать до двух знаков после запятой
        System.out.println(formattedDistance + " - distance"); // использование метода distanceTo
        firstPoint.setX(7.79); // изменение координаты по отдельности с помощью метода set
        System.out.println("x coordinate = " + firstPoint.getX());
        
    }
/** координата X **/
//private double xCoord;
/** координата Y **/
//private double yCoord;
/** координата Z **/
private double zCoord;
/** Конструктор инициализации **/
public Point3d (double x, double y, double z) {
xCoord = x;
yCoord = y;
zCoord = z;
}
/** Конструктор по умолчанию. **/
public Point3d () {
//Вызовите конструктор с тремя параметрами и определите источник.
this(0, 0, 0);
}
/** Возвращение координаты X **/
//public double getX () {
//return xCoord;
//}
/** Возвращение координаты Y **/
//public double getY () {
//return yCoord;
//}
/** Возвращение координаты Z **/
public double getZ () {
    return zCoord;
    }
/** Установка значения координаты X **/
//public void setX ( double val) {
//xCoord = val;
//}
/** Установка значения координаты Y **/
//public void setY ( double val) {
//yCoord = val;
//}

/** Установка значения координаты Z **/
public void setZ ( double val) {
zCoord = val;
}
public static boolean coordComparison(Point3d point1, Point3d point2) { // метод, который возвращает true, если хотя бы одна пара 
    if (point1.getX() == point2.getX() & point1.getY() == point2.getY() & point1.getZ() == point2.getZ()) // значений двух точек равна
    return true;
    return false;
}
public static double distanceTo(Point3d point1, Point3d point2) { // метод, которые возвращает расстояние между двумя точками 
    double xa = point1.getX();                                    // с точно до двух знаков после запятой
    double ya = point1.getY(); 
    double za = point1.getZ(); // обозначение переменных "a" для координат первого объекта

    double xb = point2.getX();
    double yb = point2.getY();
    double zb = point2.getZ(); // обозначение переменных "b" для координат второго объекта
    double distance = Math.sqrt( Math.pow((xb-xa),2) + Math.pow((yb-ya),2) + Math.pow((zb-za),2) ); // формула расчёта расстояния
    return distance;
    }
/*public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
    double a = distanceTo(point1, point2);
    double b = distanceTo(point2, point3);
    double c = distanceTo(point1, point3);
    
    double p = (a + b + c)/2;
    double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    return area; 
}*/
}
