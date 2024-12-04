package A22.Receivers;

import A22.PixelGui;

public class Movement {

    private int row;
    private int column;
    private final int PIXELS;
    private final PixelGui gui;
    private final int[][] matrix;

    public Movement(PixelGui gui, int row, int column, int pixels){
        this.gui = gui;
        this.row = row;
        this.column = column;
        this.PIXELS = pixels;
        this.matrix = new int[PIXELS][PIXELS];
        for (int i = 0; i < PIXELS; i++) {
            for (int j = 0; j < PIXELS; j++) {
                matrix[i][j] = 0;
            }
        }
    }


    public void moveLeft(){
        if (column > 0){
            column -= 1;
            gui.moveCursor(column, row);
        }
    }

    public void moveUp(){
        if (row > 0){
            row -= 1;
            gui.moveCursor(column, row);
        }
    }

    public void moveRight(){
        if (column < PIXELS - 1){
            column++;
            gui.moveCursor(column, row);
        }
    }

    public void moveDown(){
        if (row < PIXELS - 1){
            row += 1;
            gui.moveCursor(column, row);
        }
    }

    public void togglePixel(){
        matrix[row][column] = matrix[row][column] == 0 ? 1 : 0;
        gui.togglePixel();
    }

    public void generateCode(){
        StringBuilder stringBuilder = new StringBuilder("int[][] pixelArt = {\n");
        for (int i = 0; i < PIXELS; i++){
            stringBuilder.append("{");
            for (int j = 0; j < PIXELS; j++){
                stringBuilder.append(matrix[i][j]);
                stringBuilder.append(", ");
            }
            stringBuilder.append("},\n");
        }
        stringBuilder.append("};");
        System.out.println(stringBuilder);
    }
}
