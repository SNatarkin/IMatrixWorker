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
        double[][] subtractMatrix = new double[m1.length][];
        for (int i = 0; i < subtractMatrix.length; i++) {
            subtractMatrix[i] = m1[i].clone();
            for (int j = 0; j < subtractMatrix[i].length; j++) {
                subtractMatrix[i][j] -= m2[i][j];
            }
        }
        return subtractMatrix;
    }

    @Override
    public double[][] multiply(double[][] m1, double[][] m2) {
        double[][] multiplyMatrix = new double[m1.length][m2[0].length];
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                multiplyMatrix[i][j] = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    multiplyMatrix[i][j] += m1[i][k] * m2[k][j];

                }
            }
        }
        return multiplyMatrix;
    }


}

