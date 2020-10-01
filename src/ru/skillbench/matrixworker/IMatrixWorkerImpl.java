package ru.skillbench.matrixworker;

import java.util.Arrays;

public class IMatrixWorkerImpl implements IMatrixWorker  {
    @Override
    public void print(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }

    @Override
    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        return false;
    }

    @Override
    public double[][] add(double[][] m1, double[][] m2) {
        return new double[0][];
    }

    @Override
    public double[][] subtract(double[][] m1, double[][] m2) {
        return new double[0][];
    }

    @Override
    public double[][] multiply(double[][] m1, double[][] m2) {
        return new double[0][];
    }
}
