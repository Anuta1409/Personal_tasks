/**
 * Created by Anna on 07.11.2015.
 */
public class MasSelect{
    public static void main (String[] args) {

        /* ������� ���������� ��������.
    ������ ����� ��������� � ��������, �� ����� � ����� �� ������� ��� ��������� ������� �� ������ ������� ����.
    ���� ������ ����� ��������, ������� ������� ���� �������� ��������� � ������� ��� ��� � ����.
    (�����������) ������� ��������, ������� �������� ������.*/

        String[] name = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        int minJ = 0;
        int minT = 0;
        for (int i = 0; i < times.length; i++) {
            minT = times[i];
            for (int j = 0; j < times.length; j++) {
                if (minT > times[j]) {
                    minT = times[j];
                    minJ = j;
                }
            }
        }
        System.out.println("winner - " + name[minJ] + " - " + minT);

        int minInd = 0;
        for (int i = 0; i < times.length; i++) {
            minT = times[i];
            minInd = i;
            for (int j = i+1; j < times.length; j++) {
                if (minT > times[j]) {
                    minT = times[j];
                    minInd = j;

                }
            }
            if (i != minInd) {
                int tmp = times[i];//����������������, ����� �� �������� ���������� ��������!!!
                times[i] = times[minInd];
                times[minInd] = tmp;
            }
            System.out.println(times[i]);
        }
    }
}

