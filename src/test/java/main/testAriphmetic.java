package main;

import org.junit.jupiter.api.Test;

public class testAriphmetic {

    public int[] list1 = new int[]{1,2,3,4,5,6,7,8,56,9,56};
    public int[] list2 = new int[]{1,2,3,4,5,6,7,8,56,9,56};

    @Test
    public void testSub() {
        for (int i: list1){
            for (int j: list2) {
                System.out.println((new Ariphmetic()).sub(i, j));
            }
        }
    }

    @Test
    public void testDiv() {
        for (int i: list1){
            for (int j: list2) {
                System.out.println((new Ariphmetic()).div(i, j));
            }
        }
    }

    @Test
    public void testMod() {
        for (int i: list1){
            for (int j: list2) {
                System.out.println((new Ariphmetic()).mod(i, j));
            }
        }
    }

    @Test
    public void testMul() {
        for (int i: list1){
            for (int j: list2) {
                System.out.println((new Ariphmetic()).mul(i, j));
            }
        }
    }

    @Test
    public void testAdd() {

        for (int i: list1){
            for (int j: list2) {
                System.out.println((new Ariphmetic()).add(i, j));
            }
        }
    }

}
