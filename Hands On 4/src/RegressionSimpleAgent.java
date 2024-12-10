import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Random;

public class RegressionSimpleAgent extends Agent {
    protected void setup() {
        double [] x = {23, 26, 30, 34, 43, 48, 52, 57, 58};
        double [] y = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};

        Regresion regresion = new Regresion(x, y);
        regresion.ecuacion();

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("Correlacion: " + regresion.getCorrelacion());
                System.out.println("Coeficiente de determinacion: " + regresion.getDeterminacion());

                double[] predicciones = {10, 20, 30, 40, 50};
                for (int i = 0; i < predicciones.length; i++) {
                    double prediccion = regresion.resultado(predicciones[i]);
                    System.out.println("Prediccion para Advertising = " + predicciones[i] + ": " + prediccion);
                }
            }
        });
    }
}
