package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    //----------------------------------------------------
    public static char player = '@';
    public static char coin = '$';
    public static char enemy = 'E';

    //-----------------------------------------------------
    public static int playerHP = 100;
    public static int playerSTR = 15;
    public static int PlayerCoins = 0;
    public static int playerScore ;
    public static int playerExp = 0;
    public static int playerY ;
    public static int playerX ;

    public static final int playerMUp =8;
    public static final int  playerMDown =2;
    public static final int playerMRight =6;
    public static final int playerMLeft =4;
    //-----------------------------------------------------
    public static int mapHeight;
    public static int mapWidth;
    public static char[][] map;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 7;
    public static char emptyCell = '_';
    //---------------------------------------------------
    public static int enemyHP;
    public static int enemySTR;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 40;
    public static int enemiesCount;
    //-------------------------------------------------------
    public static int coinsCount;
    public static int coinsPosX;
    public static int coinsPosY;
    //-----------------------------------------------------
    public static int gameLevel = 0;

//-----------------------------------------------------


    public static void main(String[] args){
        LevelCycle();
        while (isPlayerAlive()){
            ++gameLevel;
            System.out.println("Start Game Level");
            LevelCycle();
        }
        System.out.println("Game Over! Play Score" + gameLevel);
    }
    //----------------------------------------------------
    public static void LevelCycle(){
        createMap();
        createPlayer();
        printCoin();
        spawnEnemies();

        while (true){
            printMap();
            playersWay();
            if (isPlayerAlive()){
                System.out.println("Player dead. Game Over");
                break;}
            if (isEnemyExist()){
                System.out.println("Player win. Player Score" + playerScore + "Level finish");
            }
            break;

        }


        printMap();
        System.out.println("Game over!");
    }
    //----------------------------------------------------
    public static void createMap(){
        mapWidth = randomValue(mapSizeMin,mapSizeMax);
        mapHeight = randomValue(mapSizeMin,mapSizeMax);
        map = new char [mapHeight][mapWidth];
        for (int x = 0; x < mapHeight; x++){
            for (int y = 0; y < mapWidth; y++){
                map[x][y] = emptyCell;
            }
        }
        System.out.println("MAP" + mapWidth + "x" + mapHeight + "HAS BEEN CREATED");

    }
    //----------------------------------------------------
    public static void createPlayer(){
        playerX = randomValue(0, mapWidth - 1);
        playerY = randomValue(0, mapHeight -1);
        map[playerY][playerX] = player;
        System.out.println("PLAYER HAS BEEN CREATED IN [" +(playerX +1) + ":" + (playerY+1) + "]"  );
    }
    //-----------------------------------------------------
    public static void playersWay(){
        int playerLstX = playerX;
        int playerLastY = playerY;

        int playerDestination;

        do {
            System.out.print("Choose your destinantion: UP(" + playerMUp +
                    ") | DOWN(" + playerMDown + ") | RIGHT(" +
                    playerMRight + ") | LEFT("+ playerMLeft + ") >" );

            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case playerMUp:
                    playerY -= 1;
                    break;
                case playerMDown:
                    playerY += 1;
                case playerMLeft:
                    playerX -= 1;
                    break;
                case playerMRight:
                    playerX += 1;
            }} while (isValidPlayerMNextcell(playerX,playerY,playerLstX,playerLastY));

        playerNextCheck();

        map [playerLastY][playerLstX] =emptyCell;
        map [playerY][playerX] = player;
    }
    //-----------------------------------------------------
    public static void playerNextCheck(){
        if (map[playerY][playerX] ==enemy) {
            playerHP -= enemySTR;
            playerScore ++;
            enemiesCount--;
            System.out.println("Player has been attacked on" + enemySTR + ".PlayerHp now is" + playerHP);
        }
    }
    //-------------------------------------------------------
    public static boolean isEnemyExist(){
        return enemiesCount > 0;
    }
    //-------------------------------------------------------
    public static void printMap(){
        for (int y = 0; y < mapHeight; y++) {
            for (int i = 0; i < mapWidth; i++) {
                System.out.print(map[y][i] + "|");
            }
            System.out.println();
        }
    }
    //------------------------------------------------------
    public static boolean isPlayerAlive(){
        return playerHP>0;
    }
    //-----------------------------------------------------
    public static boolean isValidCell(int x, int y){

        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight ;
    }
    //---------------------------------------------------
    public static boolean isValidPlayerMNextcell(int nextCellX,int nextCellY,int lastCellX,int lastCellY){
        if (isValidCell(nextCellX,nextCellY)) {
            System.out.println("Player move to [" + (nextCellX + 1) + ":" + (nextCellY + 1) + "]");
            return true; }
        else {
            System.out.println("Invalid move");
            playerX = lastCellX;
            playerY = lastCellY;
            return false;}

    }
    //------------------------------------------------------
    public static void spawnEnemies(){
        enemiesCount = (mapWidth + mapHeight) /3;

        enemyHP = randomValue(enemyValueMin,enemyValueMax);

        int enemyPosY;
        int enemyPosX;

        for (int i = 1; i<= enemiesCount; i++){

            do {
                enemyPosX = random.nextInt(mapWidth);
                enemyPosY = random.nextInt(mapHeight);}

            while (!isEmptyCell(enemyPosX,enemyPosY));
            map[enemyPosY][enemyPosX] = enemy;}
    }
    //------------------------------------------------------
    public static void printCoin() {
        coinsPosX = randomValue(0, mapWidth - 1);
        coinsPosX = randomValue(0, mapWidth - 1);
        map[coinsPosY][coinsPosX] = coin;

        for (int i = 3; i<= coinsCount; i++){

            do {
                coinsPosY = random.nextInt(mapWidth);
                coinsPosX = random.nextInt(mapHeight);}

            while (!isEmptyCell(coinsPosY,coinsPosX));
            map[coinsPosY][coinsPosX] = coin;}

        coinsCount = (mapWidth + mapHeight) *6;
    }


    //------------------------------------------------------
    public static boolean isEmptyCell(int i, int y){

        return map[y][i] ==emptyCell;
    }






    //-----------------------------------------------------
    public static int randomValue(int min, int max){
        return min + random.nextInt(max - min + 1);
    }

}
