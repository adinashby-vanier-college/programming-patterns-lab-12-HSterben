package com.prog2.labs;

import java.util.HashMap;

/**
 * @author adinashby
 *
 */
public class LabTwelve {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static int numberOfBoomerangs(int[][] points) {
        if (points.length != 3) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap();
        boolean start = true;

        int distance;
        for (int i = 0; i < 3; i++) {
            if (start) {
                map.put(findDistance(points[0], points[2]), 1);
                start = false;
            } else {
                distance = findDistance(points[i], points[i - 1]);
                if (map.containsKey(distance)) {
                    map.put(distance, (map.get(distance) + 1));
                } else {
                    map.put(distance, 1);
                }
            }
        }
        for (int i : map.values()) {
            switch(i) {
                case 3:
                    return 6;
                case 2:
                    return 2;
            }
        }
        return 0;
    }

    public static int findDistance(int[] p1, int[] p2) {
        return (int) Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }

}
