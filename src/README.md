## Explicação do projeto

O Monitor Climático é um sistema que simula uma central de monitoramento climático, responsável por acompanhar alterações de temperatura e umidade

Quando uma nova medição é registrada, os dispositivos cadastrados recebem notificações automaticamente

O projeto possui três observadores:

- AplicativoClima: exibe temperatura e umidade
- MonitorClimatico: apresenta as condições climáticas
- AlertaClimatico: emite alertas quando a temperatura atinge 35°C ou mais

O sistema também permite adicionar e remover observadores durante sua execução

## Justificativa do padrão Observer

O padrão Observer foi escolhido porque permite notificar diferentes objetos automaticamente quando ocorre uma alteração no estado de outro objeto

Ele é adequado ao projeto porque a central climática precisa informar vários dispositivos sobre as mesmas mudanças, sem depender diretamente das implementações de cada um

Principais Vantagens:

- Baixo acoplamento: componentes dependem de interfaces
- Flexibilidade: permite adicionar e remover observadores

### Outros padrões que poderiam ser usados

- Strategy: permite implementar diferentes estratégias de análise das condições climáticas
- Factory Method: poderia centralizar a criação dos diferentes tipos de observadores

Esses padrões não substituem as """notificações""" do Observer