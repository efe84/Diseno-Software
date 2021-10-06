package e2;

public class Slopes {
    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        int cntarboles = 0;
        for (int i = 0; i < 3; i++) {
            if (slopeMap[i][0] == '#') {
                cntarboles++;
            }
            for (int j = 0; j < 1; j++) {
                if (slopeMap[i][j] == '#') {
                    cntarboles++;
                }
            }

        }
        return cntarboles;
    }

    public static int jumpTheSlope(char[][] slopeMap, int right, int down) {
        return 0;
    }
}
