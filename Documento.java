// Produto Abstrato
interface Documento {
    void gerar();
}

// Produtos Concretos
class Boleto implements Documento {
    public void gerar() { System.out.println("Gerando PDF de Boleto Bancário..."); }
}

class NotaFiscal implements Documento {
    public void gerar() { System.out.println("Emitindo Nota Fiscal no sistema do governo..."); }
}

// A Fábrica
class DocumentoFactory {
    public static Documento criarDocumento(String tipo) {
        if (tipo.equalsIgnoreCase("BOLETO")) return new Boleto();
        if (tipo.equalsIgnoreCase("NF")) return new NotaFiscal();
        throw new IllegalArgumentException("Tipo de documento desconhecido");
    }
}