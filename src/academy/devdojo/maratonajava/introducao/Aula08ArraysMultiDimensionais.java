package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultiDimensionais {
    public static void main(String[] args) {
        int[][] arraysdeint = new int[3][];
        arraysdeint[0] = new int[2];
        arraysdeint[1] = new int[]{1,2,3};
        arraysdeint[2] = new int[6];

        for (int[] arraybase : arraysdeint) {
            for (int num : arraybase) {
                System.out.println(num);

            }
        }

    }

}
