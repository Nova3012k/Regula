public class Regresion {
    private double beta0, beta1, correl, deter;

    public Regresion(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0.0, sumY = 0.0;
        double numerador = 0.0, denominador = 0.0;
        double sumA = 0.0, sumB = 0.0;

        for (int i = 0; i < n; i++) {
            sumY += y[i];
            sumX += x[i];
        }

        double mediaX = sumX / n;
        double mediaY = sumY / n;

        for (int i = 0; i < n; i++) {
            numerador += (x[i] - mediaX) * (y[i] - mediaY);
            denominador += (x[i] - mediaX) * (x[i] - mediaX);
        }

        beta1 = numerador / denominador;
        beta0 = mediaY - beta1 * mediaX;

        for (int i = 0; i < n; i++) {
            double auxY = resultado(x[i]);
            sumA += (y[i] - mediaY) * (y[i] - mediaY);
            sumB += (y[i] - auxY) * (y[i] - auxY);
        }

        deter = 1 - sumB / sumA;
        correl = Math.sqrt(deter);
    }

    public double resultado(double x) {
        return beta0 + beta1 * x;
    }

    public void ecuacion() {
        System.out.println("Ecuacion de regresion lineal. Y = " + beta0 + " + " + beta1 + " * x");
    }

    public double getCorrelacion() {
        return correl;
    }

    public double getDeterminacion() {
        return deter;
    }
}
