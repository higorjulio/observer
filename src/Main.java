public class Main {

    public static void main(String[] args) {

        CentralClimatica central = new CentralClimatica();

        //observadores
        AplicativoClima aplicativo = new AplicativoClima();
        MonitorClimatico monitor = new MonitorClimatico();
        AlertaClimatico alerta = new AlertaClimatico();

        System.out.println("--- CADASTRANDO OBSERVADORES");

        central.adicionarObservador(aplicativo);
        central.adicionarObservador(monitor);
        central.adicionarObservador(alerta);

        System.out.println("\n--- PRIMEIRA ATUALIZACAO");

        central.definirMedicoes(25.0, 60.0);

        System.out.println("\n--- SEGUNDA ATUALIZACAO");

        central.definirMedicoes(38.0, 45.0);

        //remove o observador
        System.out.println("\n");
        central.removerObservador(monitor);

        System.out.println("\n--- TERCEIRA ATUALIZACAO");

        central.definirMedicoes(30.0, 70.0);

    }
}
