public class DiscMaths {

    public double[] sumatoriaC(double[] x,double[]b) {
        int n = x.length;
        double[] r = new double[n];

        for (int i = 0; i < n; i++) {
            r[i] = (b[0] * Math.pow(x[i], 3) + b[1] * Math.pow(x[i], 2) + b[2] * x[i] + b[3]);
        }
        return r;
    }

    public double[] sumatoriaQ(double[] x,double[]b) {
        int n = x.length;
        double[] r = new double[n];
        for (int i = 0; i < n; i++) {
            r[i] = ((b[0]* Math.pow(x[i],2)) + (b[1] * x[i]) + b[2]);
        }
        return r;
    }

    public double media(double[] y) {
        int n = y.length;
        double r=0;
        for (int i = 0; i < n; i++) {
            r += y[i];

        }
        return r/n;
    }

    public double sumatoriayMediaY(double[] ypronosticos,double yMedia) {
        int n = ypronosticos.length;
        double r=0;
        for (int i = 0; i < n; i++) {
            r += Math.pow((ypronosticos[i]-yMedia),2);
        }
        return r;
    }

}