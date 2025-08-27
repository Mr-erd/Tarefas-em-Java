public class Computer implements VideoPlayer, MusicaPlayer {

    @Override
    public void playMusica() {
        System.out.println("computador play musica");
    }

    @Override
    public void pauseMusica() {
        System.out.println("computador pause musica");
    }

    @Override
    public void stopMusica() {
        System.out.println("computador stop musica");
    }

    @Override
    public void playVideo() {
        System.out.println("computador play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("computador pause video");
    }

    @Override
    public void stopVideo() {
        System.out.println("computador stop video");
    }
}
