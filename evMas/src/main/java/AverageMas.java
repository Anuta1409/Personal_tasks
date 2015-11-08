/**
 * Created by Anna on 07.11.2015.
 */
/*Найдите среднее арифметическое массива из 10 элементов типа double.*/
public class AverageMas {
    public static void main(String [] args){
        double[] mas = new double[10];
        double mas_sum = 0;
        double mas_aver = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.round(Math.random() * 100);
            System.out.println(mas[i]);

            mas_sum += mas[i];
        }
        System.out.println (mas_sum);
        mas_aver = mas_sum/mas.length;
        System.out.println (mas_aver);
    }

}
