public abstract class JogoIA {

    // Template Method
    public final void OrdemIA() {
        colisao();
        atirar();
        mover();
    }

    private void colisao() {
        System.out.println("Estou colidindo");
    }

    protected abstract void atirar();
    protected abstract void mover();
}
