public class AlertaClimatico implements Observer{

    @Override
    public void atualizar(double temperatura, double umidade){

        System.out.println("\n Alerta Climático ");

        if (temperatura >= 35){
            System.out.println("Cuidado! A temperatura está muito alta.");
        } else {
            System.out.println("A temperatura está normal.");
        }
    }
}
