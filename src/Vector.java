/**
 * Created by Julia on 06.04.2015.
 */
public class Vector {
    String name;
    double x;
    double y;
    double z;

    public Vector(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.z = 0;
        this.name = name;
    }

    public Vector(double x, double y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if(z == 0) {
            return "Вектор "+name+" {" + x + ", " + y + "}\n";
        }
        else {
            return "Вектор "+name+" {" + x + ", " + y + ", "+z+"}\n";
        }
    }

    public static Vector composeVector(double xbeg, double ybeg, double xend, double yend, String name) {
        return new Vector(xend-xbeg,yend-ybeg, name);
    }

    //Скалярное произведение
    public static double dotProduct(Vector a,Vector b){
        return a.getX()*b.getX()+a.getY()*b.getY()+a.getZ()*b.getZ();
    }
    //Векторное произведение
    public static Vector crossProduct(Vector a,Vector b,String name){
        Vector rez=new Vector((a.getY()*b.getZ()-a.getZ()*b.getY()),
                -(a.getX()*b.getZ()-a.getZ()*b.getX()),
                (a.getX()*b.getY()-a.getY()*b.getX()),name);
        return rez;
    }


    public static Vector composeVector(double xbeg, double ybeg,double zbeg, double xend, double yend, double zend, String name) {
        return new Vector(xend-xbeg,yend-ybeg,zend-zbeg, name);
    }


}
