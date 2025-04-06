
package findtriplets;

public class FindTriplets {
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -1, -4};

        for (int x : arr) {
            for (int y : arr) {
                for (int z : arr) {
                    if (x <= y && y <= z && (x + y + z == 2)) {
                        System.out.println("(" + x + ", " + y + ", " + z + ")");
                    }
                }
            }
        }
    }
}







