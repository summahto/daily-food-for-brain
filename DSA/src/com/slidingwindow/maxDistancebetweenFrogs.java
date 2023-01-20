package com.slidingwindow;

public class maxDistancebetweenFrogs {

    public static void main(String[] args) {
        int [] a = {3,3,3,4,4,5,5,-3,6 };

        System.out.println(solution(a));
    }

    public static int solution(int [] blocks) {
        if (blocks.length == 0) {
            return 0;
        }
        int i = 0;
        int curPeakIndex = i + 1;
        int prevPeakIndex = i;
        int repeatPeaks = 0;
        int maxDist = 0;
        boolean bUp = false;
        for (; i < blocks.length - 1; i++) {
            if (blocks[i + 1] >= blocks[i]) {
                curPeakIndex = i + 1;
                if (blocks[i + 1] == blocks[i]) {
                    ++repeatPeaks;
                }
                else {
                    bUp = true;
                    if (repeatPeaks > 0) {
                        repeatPeaks = 0;
                    }
                }
            }
            else
            {
                if (bUp) {
                    prevPeakIndex = curPeakIndex - repeatPeaks;
                    bUp = false;
                    repeatPeaks = 0;
                }
                curPeakIndex = i + 1;
            }
            maxDist = (maxDist <= (curPeakIndex - prevPeakIndex + 1)) ? (curPeakIndex - prevPeakIndex + 1) : maxDist;
        }
        return maxDist;
    }


}
