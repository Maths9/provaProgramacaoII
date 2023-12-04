public class Controle {
    private int Codigo;
    private boolean ativo;

    public Controle(int codigo, boolean ativo) {
        Codigo = codigo;
        this.ativo = ativo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
