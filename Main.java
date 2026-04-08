public class Main {
    public static void main(String[] args) {
        // 1. Usando Builder para criar um servidor para o sistema
        ComputadorGamer servidor = new ComputadorGamer.Builder("Ryzen 9", 64)
                .comPlacaVideo("RTX 4090")
                .ativarRGB()
                .build();

        // 2. Usando Factory para gerar a cobrança do cliente
        Documento cobranca = DocumentoFactory.criarDocumento("BOLETO");
        cobranca.gerar();

        // 3. Usando Strategy para definir o frete da venda
        CalculadoraEntrega calc = new CalculadoraEntrega();
        calc.setEstrategia(new EnvioExpresso());
        System.out.println("Frete: R$ " + calc.realizarCalculo(2.5));
        // Seu código antigo do ComputadorGamer (NÃO MEXA AQUI)
        ComputadorGamer pc = new ComputadorGamer.Builder("Intel i9", 32)
                .comPlacaVideo("RTX 3080")
                .build();

        // NOVO PRODUTO ADICIONADO
        Smartphone celular = new Smartphone.Builder("iPhone 15", 256)
                .com5G()
                .naCor("Azul Titânio")
                .build();

        System.out.println(celular.toString());
    }
}