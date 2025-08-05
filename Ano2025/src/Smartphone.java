public  class Smartphone implements VideoPlayer, MusicaPlayer{

    @Override
    public void playMusica() {
        System.out.println("celular play musica");
    }

    @Override
    public void pauseMusica() {
        System.out.println("celular pause musica");
    }

    @Override
    public void stopMusica() {
        System.out.println("celular stop musica");
    }

    @Override
    public void playVideo() {
        System.out.println("celular play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("celular pause video");
    }

    @Override
    public void stopVideo() {
        System.out.println("celular stop video");
    }
}
