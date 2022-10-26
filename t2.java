//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.


import java.util.Random;

public class t2 {
    public static void main(String[] args) {
        int[] arr1;
        arr1=massiv1();
        System.out.println("Первый массив: ");
        for(int i = 0; i < 10; i++){
            System.out.println(arr1[i]);
        }
        int[] arr2;
        arr2=massiv2();
        System.out.println("Второй массив: ");
        for(int i = 0; i < 10; i++){
            System.out.println(arr2[i]);
        }
        int[] arr3;
        arr3=massiv3(arr1,arr2);
        System.out.println("Результат: ");
        for(int i = 0; i < 10; i++){
            System.out.println(arr3[i]);
        }
    }

    public static int[] massiv1(){
        Random Rand=new Random();
        int[] a1=new int[10];
        for(int i=0; i<a1.length;i++)
            a1[i]=Rand.nextInt(100);
        return a1;

    }

    public static int[] massiv2(){
        Random Rand=new Random();
        int[] a2=new int[10];
        for(int i=0; i<a2.length;i++)
            a2[i]=Rand.nextInt(100);
        return a2;
    }


    public static int[] massiv3(int[] a1, int[] a2){
        Random m = new Random();
        int n = 0;
        if (a1.length == a2.length){
            n = a1.length;
        }else
            System.out.println("Длина массивов отличается.Выполнить задачу не возможно");

        int[] a3 = new int[n];

        for(int i=0;i<n;i++){
            if (m.nextInt(2) == 1) { a3[i] = a1[i] - a2[i];
            }
        }


        return a3;


    }


}

    
