public class test {
    public static void main(String[] args) {
        int[][] chess= new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;

        for (int[] row : chess) {
            for (int date : row) {
                System.out.print(date + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chess[i][j] != 0) {
                    sum++;
                }
            }
        }
        int[][] sparsearr = new int[sum + 1][3];
        sparsearr[0][0] = 11;
        sparsearr[0][1] = 11;
        sparsearr[0][2] = sum;
        int count =0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chess[i][j] != 0) {
                    count++;
                    sparsearr[count][0] = i;
                    sparsearr[count][1] = j;
                    sparsearr[count][2] = chess[i][j];
                }
            }
        }
        for (int i = 0; i < sparsearr.length; i++) {
            System.out.println(sparsearr[i][0]+" "+sparsearr[i][1]+" "+sparsearr[i][2]);

        }
    }
}


