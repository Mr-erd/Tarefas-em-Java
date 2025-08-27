public class MusicaBox  implements MusicaPlayer{
    @Override
    public void playMusica() {
        System.out.println("caixa play musica");
    }

    @Override
    public void pauseMusica() {
        System.out.println("caixa  pause musica");
    }

    @Override
    public void stopMusica() {
        System.out.println("caixa  stop musica");
    }
}
