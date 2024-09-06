public class Successors {
    public static Position findPosition(int x, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (x == arr[i][j]) {
                    return new Position(i, j);
                }
            }
        }

        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr) {
        Position[][] out = new Position[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                out[i][j] = findPosition(arr[i][j] + 1, arr);
            }
        }

        return out;
    }
}
