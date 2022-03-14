package proxy.advanced;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() throws InterruptedException {
        Thread.sleep(1000L);
        System.out.println("Game Start!");
    }
}
