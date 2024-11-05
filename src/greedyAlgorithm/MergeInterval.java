package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {
    /*
    static class Pair<K,V>{
        private K first;
        private V second;

        public Pair(){}

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }
        public K getFirst() {
            return first;
        }
        public V getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "["+first + "," + second + "]";
        }
    }
    */
    public static void main(String[] args) {
        int [][]pair = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int []ans = mergeInterval(pair);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeInterval(int[][] pair) {
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int length =1 ;
        int lastPairEnd = pair[0][1];
//        System.out.println(pair[0][0]+" , "+lastPairEnd);
        for(int i=1; i<pair.length; i++) {
            if(pair[i][0] > lastPairEnd) {
                lastPairEnd = pair[i][1];
//                System.out.println(pair[i][0]+" , "+lastPairEnd);
                length++;
            }
        }
        return new int[]{pair[0][0],lastPairEnd};
    }

    static void printArr(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}








