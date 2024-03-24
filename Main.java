package SimulatedAnnealing;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    static Random rnd = new Random();
    static int[][] dist = {{0,2,4,3,5},{2,0,7,6,2},{4,7,0,3,4},{3,6,3,0,8},{5,2,4,8,0}};
    public static void main(String[] args) {

        int dim = 5;
        int[] cList = {1,2,3,4,5};
        int[] current= new int[5];

        int[] sMin;
        double fMin;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int val : cList) {
            list.add(val);
        }

        for(int j=0;j<dim-1;j++) {
            int i = rnd.nextInt(list.size());
            current[j] = list.get(i);
            list.remove(i);
        }
        current[dim-1]=list.get(0);

        final double TEMPERATURE = 100;
        final double TEMPERATURE_coefficient = 0.99;
        final double M=10;
        double t= TEMPERATURE;

        fMin= Evaluate(current);
        sMin = current.clone();

        System.out.println("initial fitness value :"+ fMin);

        for(int i=0;i<100;i++) {
            t= t * TEMPERATURE_coefficient;
            for(int m=0;m<M;m++) {
                int[] sNew = Movement(current);
                double fCurrent =  Evaluate(current);
                double nfCurrent =  Evaluate(sNew);
                if (nfCurrent< fCurrent) {
                    current = sNew;
                } else {
                    double delta = nfCurrent-fCurrent;
                    double r = Math.random();
                    double probability = Math.exp(-delta/t);
                    if (r < probability) {
                        current = sNew;
                    }
                }

                if (fMin> Evaluate(current)) {
                    fMin= Evaluate(current);
                    sMin = current.clone();
                }
            }
            System.out.println("Step " + i +" :"+ Evaluate(current));


        }
        for(int j=0;j<sMin.length;j++) {
            System.out.print( ","+sMin[j]);
        }
        System.out.println("\n");
        System.out.println(Evaluate(sMin));


    }
    public static double Evaluate(int[] arr) {
        double ret =0;
        for(int i=0;i<arr.length-1;i++) {
            ret =ret + dist[arr[i]-1][arr[i+1]-1];
        }

        return ret;
    }

    public static int[] Movement(int[] arr) {
        int[] ret= new int[5];
        for(int j=0;j<arr.length;j++) {
            ret[j] = arr[j];
        }

        int i=0,j=0;
        while(i==j) {
            i= rnd.nextInt(arr.length);
            j= rnd.nextInt(arr.length);
        }
        int temp = ret[j];
        ret[j]=ret[i];
        ret[i]=temp;
        return ret;
    }
}
