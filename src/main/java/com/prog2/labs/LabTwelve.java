package com.prog2.labs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
        HashSet<Integer> set = new HashSet();
        
        int counter = 0;
        
        set.add(findDistance(points[0], points[1]));
        if (!set.add(findDistance(points[0], points[2]))) {
            System.out.println("false");
            counter = 1;
        }
        if (!set.add(findDistance(points[1], points[2]))) {
            System.out.println("false again");
            counter = 2;
        }
        return counter;
    }

    public static int findDistance(int[] p1, int[] p2) {
        return (int) Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }

}
