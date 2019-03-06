package com.sectoreye.easy;

/**
 * Created by sectoreye on 2019-03-04.
 */
public class LargestTimeFromDigits {

    public String largestTimeFromDigits(int[] A) {
        if (A == null || A.length <= 0) {
            return "empty";
        }

        int[] resultHourMax = new int[]{-1,-1,-1,-1};
        int[] backupInt = new int[]{-1,-1,-1,-1};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < A.length; i++) {
            if (2 >= A[i] && resultHourMax[0] < A[i]) {
                if (resultHourMax[0] > -1) {
                    backupInt[0] = resultHourMax[0];
                    resultHourMax[0] = A[i];
                } else {
                    resultHourMax[0] = A[i];
                }
            }

            if (3 >= A[i] && resultHourMax[1] < A[i]) {
                if (resultHourMax[1] > -1 && backupInt[1] > ) {
                    backupInt[1] = resultHourMax[1];
                    resultHourMax[1] = A[i];
                } else {
                    resultHourMax[1] = A[i];
                }
            }

            if (5 >= A[i] && resultHourMax[2] < A[i]) {
                if (resultHourMax[2] > -1) {
                    backupInt[2] = resultHourMax[2];
                }
                resultHourMax[2] = A[i];
            }

            if (9 >= A[i] && resultHourMax[3] < A[i]) {
                if (resultHourMax[3] > -1) {
                    backupInt[3] = resultHourMax[2];
                }
                resultHourMax[3] = A[i];
            }
        }

        for(int i = 0; i < resultHourMax.length; i++) {


            if (i == 2) {
                result.append(":");
            } else if (resultHourMax[i] == -1) {
                return "empty";
            }

            result.append(resultHourMax[i]);
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        LargestTimeFromDigits largestTimeFromDigits = new LargestTimeFromDigits();
        int[] A = new int[]{1,2,3,4};
        System.out.println(largestTimeFromDigits.largestTimeFromDigits(A));
    }
}
