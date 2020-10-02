package ru.skillbench.matrixworker;

import java.util.Arrays;

public class IMatrixWorkerImpl implements IMatrixWorker {
    @Override
    public void print(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }

    }

    @Override
    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length == m2[i].length) {
                continue;
            }
            return false;
        }
        return true;
    }

    @Override
    public double[][] add(double[][] m1, double[][] m2) {
        double[][] sumMatrix = new double[m1.length][];
        for (int i = 0; i < sumMatrix.length; i++) {
            sumMatrix[i] = m1[i].clone();
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] += m2[i][j];
            }
        }


        return sumMatrix;
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
