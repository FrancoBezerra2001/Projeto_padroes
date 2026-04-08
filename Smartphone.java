public class Smartphone {
    private final String modelo;    // Obrigatório
    private final int armazenamento; // Obrigatório
    private final boolean tem5G;     // Opcional
    private final String cor;        // Opcional

    private Smartphone(Builder builder) {
        this.modelo = builder.modelo;
        this.armazenamento = builder.armazenamento;
        this.tem5G = builder.tem5G;
        this.cor = builder.cor;
    }

    @Override
    public String toString() {
        return "Smartphone: " + modelo + " (" + armazenamento + "GB), 5G: " + tem5G + ", Cor: " + cor;
    }

    // Builder Interno
    public static class Builder {
        private String modelo;
        private int armazenamento;
        private boolean tem5G = false;
        private String cor = "Preto";

        public Builder(String modelo, int armazenamento) {
            this.modelo = modelo;
            this.armazenamento = armazenamento;
        }

        public Builder com5G() {
            this.tem5G = true;
            return this;
        }

        public Builder naCor(String cor) {
            this.cor = cor;
            return this;
        }

        public Smartphone build() {
            return new Smartphone(this);
        }
    }
}
