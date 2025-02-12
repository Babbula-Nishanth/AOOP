

public class MinMax {
    public static void main(String args[]) {
        Integer[] array = {1, 2, 3, 4, 5};
        MMGeneric<Integer> mm = new MMGeneric<>(); 
        System.out.println("Min: " + mm.findMin(array));
        System.out.println("Max: " + mm.findMax(array));
    }
}
