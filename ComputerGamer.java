class ComputadorGamer {
    private final String processador; // Obrigatório
    private final int ram;            // Obrigatório
    private final String placaVideo;  // Opcional
    private final boolean temRGB;     // Opcional

    private ComputadorGamer(Builder builder) {
        this.processador = builder.processador;
        this.ram = builder.ram;
        this.placaVideo = builder.placaVideo;
        this.temRGB = builder.temRGB;
    }

    public static class Builder {
        private String processador;
        private int ram;
        private String placaVideo = "Integrada";
        private boolean temRGB = false;

        public Builder(String processador, int ram) {
            this.processador = processador;
            this.ram = ram;
        }

        public Builder comPlacaVideo(String placa) {
            this.placaVideo = placa;
            return this;
        }

        public Builder ativarRGB() {
            this.temRGB = true;
            return this;
        }

        public ComputadorGamer build() {
            return new ComputadorGamer(this);
        }
    }
}
