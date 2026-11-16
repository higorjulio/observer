public class MonitorClimatico implements Observer{

    @Override
    public void atualizar(double temperatura, double umidade){

        System.out.println("\n Monitor Climático ");
        System.out.println("Temperatura atual: " + temperatura + " graus");
        System.out.println("Umidade atual: " + umidade + "%");
    }
}
