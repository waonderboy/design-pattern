package proxy.advanced;

public class GameServiceProxy implements GameService{

    //데코레이터 처럼
    private GameService gameService;

//    public GameServiceProxy(GameService gameService) {
//        this.gameService = gameService;
//    }

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (this.gameService == null ) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
