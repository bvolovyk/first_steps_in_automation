package model;

import java.util.Arrays;

/**
 * Created by Kengoroo_a on 01.04.2017.
 */
public class Board {

    public static final int SIZE_FIELD = 3;

    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public void initArray(){
        figures[0] = new Figure("O");
        figures[2] = new Figure("X");
    }

    public void showBoard(){
        System.out.println(Arrays.toString(this.figures));
    }

//    public static final String GAME_NAME = "XO";
//
//    private Figure figure11 = new Figure(" ");
//
//    private Figure figure12 = new Figure(" ");
//
//    private Figure figure13 = new Figure(" ");
//
//    private Figure figure21 = new Figure(" ");
//
//    private Figure figure22 = new Figure(" ");
//
//    private Figure figure23 = new Figure(" ");
//
//    private Figure figure31 = new Figure(" ");
//
//    private Figure figure32 = new Figure(" ");
//
//    private Figure figure33 = new Figure(" ");
//
//    public static void getGameName() {
//        System.out.println(model.Board.GAME_NAME);
//    }
//
//    public void printBoard() {
//        System.out.println("%s|%s|%s\n", figure11.getFigure(), figure12.getFigure(), figure13.getFigure());
//        System.out.println("-----");
//        System.out.println("%s|%s|%s\n", figure21.getFigure(), figure22.getFigure(), figure23.getFigure());
//        System.out.println("-----");
//        System.out.println("%s|%s|%s\n", figure31.getFigure(), figure32.getFigure(), figure33.getFigure());
//    }
}
