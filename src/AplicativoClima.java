public class AplicativoClima implements Observer{

    @Override
    public void atualizar(double temperatura, double umidade){

        System.out.println("\n Aplicativo de Clima ");
        System.out.println("Temperatura: " + temperatura + " graus");
        System.out.println("Umidade: " + umidade + "%");
    }
}
