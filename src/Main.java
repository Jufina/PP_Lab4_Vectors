/**
 * Created by Julia on 06.04.2015.
 */
public class Main {
    public static void main(String args[]) {
        //Тестирование функции создания вектора
        Vector A = new Vector(2.0, 1.5, "A");
        Vector B = new Vector(2.0, 1.5,-3,"B");
        Vector C,D;
        C=Vector.composeVector(2,-7,11,-5,"C");
        D=Vector.composeVector(2,5,3,4,1,6,"D");
        System.out.println("Созданы следующие вектора :");
        System.out.println(C);
        System.out.println(D);



        //Тестирование функции вычисления умножения вектора на число
        System.out.println("---------------------------------------------");
        System.out.println("l=2, l*A. В результате получаем "+Vector.multiple(A, 2, "A2"));
        System.out.println("l=-1.5, l*A. В результате получаем "+Vector.multiple(A, -1.5, "A3") + "");

        //Тестирование функции вычисления длины вектора
        System.out.println("---------------------------------------------");
        System.out.println("Длина вектора А : "+Vector.lengthVector(A) + "");

        //Тестирование функции смешанного произведения
        System.out.println("---------------------------------------------");
        System.out.println("Смешанное произведение B,C,D : "+Vector.tripleProduct(B, C, D));

        //Тестирование функции вычисления угла
        System.out.println("Угол между C и D : "+Vector.angle(C, D));
        //Тестирование функции вычисления скалярного произведения
        System.out.println("Скалярное произведение C,D : "+Vector.dotProduct(C, D));
        //Тестирование функции вычисления векторного произведения
        System.out.println("В результате векторного произведения получен : "+Vector.crossProduct(C, D,"VP").toString());


        //Тестирование функции сложения
        System.out.println(Vector.sum(C,D,"сложения").toString());

        //Тестирование функции вычитания
        System.out.println(Vector.sub(C,D,"вычитания").toString());
        System.out.println("---------------------------------------------");

    }
}
