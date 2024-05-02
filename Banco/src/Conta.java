public abstract class Conta implements IConta {
    
        private static final int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;

        protected int agencia;
        protected int numero;
        protected Double saldo;
    
        public Conta(){
            agencia = Conta.AGENCIA_PADRAO;
            numero = SEQUENCIAL++;
            saldo = 0.0;
        }

        //implementação dos metodos da interface
        @Override
        public void sacar(double valor) {
            saldo -= valor;
        }

        @Override
        public void depositar(double valor) {
            saldo += valor;
        }

        @Override
        public void transferir(double valor, IConta contaDestino) {
           this.sacar(valor);
           contaDestino.depositar(valor);
    
    
        }


         //getters
        public int getAgencia() {
            return agencia;
        }
    
        public Double getSaldo() {
            return saldo;
        }
    
        public int getNumero() {
            return numero;
        }
       
        public void sacar(){
        }
    
        public void depositar(){
        }
    
        public void transferir(){
        }

        protected void dadosConta(){
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Mumero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
        }
    
    
}
