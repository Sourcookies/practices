
public class test {
    public static void main(String[] args) {
        int[][] chessArr1= new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;

        for (int[] row : chessArr1) {
            for (int date : row) {
                System.out.print(date + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
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
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparsearr[count][0] = i;
                    sparsearr[count][1] = j;
                    sparsearr[count][2] = chessArr1[i][j];
                }
            }
        }
        for (int[] row : sparsearr)  {
            for(int date : row) {
                System.out.print(date + "\t");
            }
            System.out.println();
        }
        int[][] chessArr2 = new int[sparsearr[0][0]][sparsearr[0][1]];
        for (int i = 1; i < sparsearr.length ; i++) {
            chessArr2[sparsearr[i][0]][sparsearr[i][1]] = sparsearr[i][2];
        }
        System.out.println("===恢复后的原数组===");
        for (int [] row :chessArr2) {
            for(int date : row){
                System.out.print(date + "\t");
            }
            System.out.println();

        }
    }

}


