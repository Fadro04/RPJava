public class test {
    public static void main(String[] args) {
        int ar4[][][][] = new int[100][100][100][100];
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                for (int c = 0; c < 100; c++) {
                    for (int d = 0; d < 100; d++) {
                        ar4[a][b][c][d] = new java.util.Random().nextInt(99) + 1;
                    }
                }
            }
        }
        double e = 0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        System.out.println(ar4[a][b][c][d]);
                        e = e + ar4[a][b][c][d];
                    }
                }
            }
        }
        System.out.println("Durch = " + (e/10000));
    }
}
