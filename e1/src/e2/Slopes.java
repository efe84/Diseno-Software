package e2;

public class Slopes {



    public static void illegalArguments(char[][] slopeMap,int right,int down){

        for (int c = 0; c < slopeMap.length; c++) {
            if( slopeMap.length != slopeMap[c].length){
                throw new IllegalArgumentException("nonSquareMap");
            }
        }

        for (int a=0;a<slopeMap.length;a++){
            for (int b=0;b<slopeMap.length;b++){
                if (slopeMap[a][b] != '#' && slopeMap[a][b] != '.'){
                    throw new IllegalArgumentException("invalidCharacters");
                }
            }
        }

        if(right>10 || right<=0 || down>10 || down <=0){
            throw new IllegalArgumentException("numeroInvalido");
        }

    }

    /**
     * Traverses the slope map making the right and down movements and
     * returns the number of trees found along the way .
     * @param slopeMap A square matrix representing the slope with spaces
     * represented as "." and trees represented as "#".
     * @param right Movement to the right
     * @param down Downward movement
     * @return Number of trees
     * @throws IllegalArgumentException if the matrix is incorrect because :
     * - It is not square .
     * - It has characters other than "." and "#"
     * - right >= number of columns or right < 1
     * - down >= number of rows of the matrix or down < 1
     */

    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        int i = 0, j = 0, x, y,cnt=0,filas,columnas;
        int cntarboles = 0;

        Slopes.illegalArguments(slopeMap,right,down);

        for (int d = 0;d<slopeMap.length;d++) {
            for (x = 0; x < right; x++) {
                j++;
                if (j == slopeMap.length) {
                    j = 0;
                }
                if (slopeMap[i][j] == '#') {
                    cntarboles++;
                }
            }
            for (y = 0; y < down; y++) {
                i++;
                if (i == slopeMap.length) {
                    return cntarboles;
                }
                if (slopeMap[i][j] == '#') {
                    cntarboles++;
                }
            }
        }
        return cntarboles;
    }

    /**
     * Traverses the slope map making the right and down movements and
     * returns the number of trees found along the way .
     * Since it " jumps " from the initial position to the final position ,
     * only takes into account the trees on those initial / final positions .
     *
     * Params , return value and thrown expections as in downTheSlope ...
     */

    public static int jumpTheSlope(char[][] slopeMap, int right, int down) {
        int i = 0, j = 0, x, y,cnt=0,filas,columnas;
        int cntarboles = 0;

        Slopes.illegalArguments(slopeMap,right,down);

        for (int d = 0;d<slopeMap.length;d++) {
            for (x = 0; x < right; x++) {
                j++;
                if (j == slopeMap.length) {
                    j = 0;
                }
            }
            for (y = 0; y < down; y++) {
                i++;
                if (i == slopeMap.length) {
                    return cntarboles;
                }
                if (y == down-1) {
                    if (slopeMap[i][j] == '#'){
                        cntarboles++;
                    }
                }
            }
        }
        return cntarboles;
    }
}
