import java.util.*;
class Rank{
    public void ranking(int[] arr){
        Map<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < arr.length; i++) {
    map.put(arr[i], i);
}
int rank_val = 1;
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
arr[entry.getValue()] = rank_val++;
    }
}
}   
class Main
 {
     public static void main(String[] args)
{
    Rank robj = new Rank();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("\n Array size is ::  "+n);
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
System.out.println(“\n Array elements are ::\n”+Arrays.toString(arr));
    robj.ranking(arr);
System.out.println(“\n According to the rank of array elements ::\n”);
    System.out.println(Arrays.toString(arr));
}
}
