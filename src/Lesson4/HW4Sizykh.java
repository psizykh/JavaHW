package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HW4Sizykh {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static int gameLvlCount = 1;

    public static char player = 'X';
    public static int playerPosX;
    public static int playerPosY;
    public static int hpPlayer = 100;
    public static int playerStepsScore = 1;
    public static boolean configurationRandomFirstPos = false;

    public static final int moveUp = 1;
    public static final int moveDown = 2;
    public static final int moveLeft = 3;
    public static final int moveRight = 4;

    public static char emptyCell = '-';
    public static char readyCell = '*';


    public static char enemy = 'E';
    public static int enemyDamage;
    public static int enemyDamageMin = 10;
    public static int enemyDamageMax = 20;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 2;
    public static int mapSizeMax = 4;


    public static void main(String[] args) {

        while   (isAlivePlayer()){
            System.out.println(">>> Console Game === Start! Level "+ gameLvlCount + " <<<<<");
            gameCycle();
            gameLvlCount++;
        }
        scanner.close();
        System.out.println("Console Game === Game over! Count Level: " + gameLvlCount + "Count steps" + playerStepsScore);
    }

    public static void gameCycle( ){
        initMap();
        createPlayer(configurationRandomFirstPos);
        createEnemies();

    while (true) {
        printMap();
        System.out.println("[Player info] >Step:" + playerStepsScore + "Health" + hpPlayer);
        movePlayer();

        if (isFullMap()) {
            System.out.println("Map is Full");
            break;
        }
        if (isAlivePlayer()) {
            System.out.println("Player is dead");
            printMap();
            break;

        }
    }


    }

    public static void initMap() {
        mapHeight = randomRange(mapSizeMin, mapSizeMax);
        mapWidth = randomRange(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyCell;


            }

        }
        System.out.println("Create map > size" + mapWidth + "x" + mapHeight + " <");

    }


    public static void createPlayer(boolean isRandom) {
        if (isRandom) {
        playerPosX = randomRange(0, mapWidth - 1);
        playerPosX = randomRange(0, mapHeight - 1);}
        else {
            playerPosX=mapWidth /2;
            playerPosY=mapHeight/2;
        }
        map[playerPosY][playerPosX] = player;

    }

    public static void createEnemies() {
        enemyDamage = randomRange(enemyDamageMin, enemyDamageMax);

        int x;
        int y;

        int countEnemies = (mapHeight + mapWidth) / 4;

        for (int i = 0; i < countEnemies; i++) {
            do {
                x = random.nextInt(mapWidth);
                y = random.nextInt(mapHeight);

            } while (x == playerPosX && y == playerPosY);


            invisibleMap[y][x] = enemy;
        }
        System.out.println("Enemies count: " + countEnemies + ". Enemy damage: " + enemyDamage);
    }

    public static void movePlayer() {
        int curx = playerPosX;
        int cury = playerPosY;
        int playerDest;

        do {

            System.out.println("Enter your move (UP = " + moveUp + ",DOWN" + moveDown + ", LEFT = " + moveLeft + ", RIGHT = " + moveRight);
            playerDest = scanner.nextInt();

            switch (playerDest) {
                case moveUp:
                    playerPosY -= 1;
                    break;
                case moveDown:
                    playerPosY += 1;
                    break;
                case moveLeft:
                    playerPosX -= 1;
                    break;
                case moveRight:
                    playerPosX += 1;
                    break;
            }
        } while (!isValidNextMove(cury, curx, playerPosY, playerPosX));

        playerNextMoveAction(curx, cury, playerPosX, playerPosY);
        ++playerStepsScore;
    }


    public static boolean isFullMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == emptyCell) return false;

            }

        }
        return true;
    }




    public static void playerNextMoveAction(int curx,int cury,int nextx,int nexy){
        if (invisibleMap[nexy][nextx] == enemy){
            hpPlayer -=enemyDamage;
            System.out.println("Enemy damage" + enemyDamage+ "Player HP " + hpPlayer);
        }

        map[curx][cury] =readyCell;
        map[playerPosY][playerPosX] = player;
        invisibleMap[playerPosY][playerPosX] = readyCell;
        if (randomBuff()){
            healPlayer((randomRange(10,20)));
        }
    }

    public static boolean isValidNextMove(int curx, int cury, int nextY, int nextX) {
            if(nextY >= 0 && nextY<mapHeight && nextX >=0 && nextX < mapWidth) {
            System.out.println("Player move to [" + (nextY+ 1)+ ":"+ (nextX+1)+"] success");
            return true;
        }
            else {
                playerPosX = curx;
                playerPosY = cury;
            System.out.println("Ivalid move");
            return false;
        }

    }

    public static boolean randomBuff(){
        return random.nextInt(100   ) < 30;

    }

    public static void healPlayer (int value){
        hpPlayer += value;
        System.out.println("Player healed on" + value);
    }

    public static void printMap(){
        System.out.println("=ACTUAL MAP=");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");

            }
            System.out.println();
        }
        System.out.println("----------------------");


    }

    public static boolean isAlivePlayer () {
        return hpPlayer > 0;
    }


    public static int randomRange (int min, int max) {
        return random.nextInt(max-min+1)+min;
    }

}