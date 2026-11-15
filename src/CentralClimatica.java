import java.util.*;

public class CentralClimatica implements Subject {

    private List<Observer> observadores;
    private double temperatura;
    private double umidade;

    public CentralClimatica(){
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
        System.out.println("Observador cadastrado");
    }

    @Override
    public void removerObservador(Observer observador) {
        if (observadores.remove(observador)) {
            System.out.println("Observador removido");
        }
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(temperatura, umidade);
        }
    }

    public void definirMedicoes(double temperatura, double umidade) {

        if (Double.compare(this.temperatura, temperatura) != 0 ||
                Double.compare(this.umidade, umidade) != 0) {

            this.temperatura = temperatura;
            this.umidade = umidade;

            System.out.println("\nNovas medições registradas");
            notificarObservadores();
        }
    }
}
