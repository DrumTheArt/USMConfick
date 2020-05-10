package Entities;

public class SingleBoardElement {

    private int boardElementHeigth;
    private int boardElementWidth;
    private int boardElementDepth;

    public SingleBoardElement(){

      setInitialDefaultValues();
    }

    private void setInitialDefaultValues() {

        this.boardElementHeigth = 40;
        this.boardElementWidth = 80;
        this.boardElementDepth = 0;
    }

    public int getBoardElementWidth(){

        return this.boardElementWidth;
    }

    public int getBoardElementHeight(){

        return this.boardElementHeigth;
    }

    public int getBoardElementDepth(){

        return this.boardElementDepth;
    }

    public void setBoardElementWidth(int newWidth){

        this.boardElementWidth = newWidth;
    }

    public void setBoardElementHeight(int newHeight){

        this.boardElementHeigth = newHeight;
    }

    public void setBoardElementDepth(int newDepth){

        this.boardElementDepth = newDepth;
    }

    @Override
    public String toString(){

        return "Depth: " + this.boardElementDepth + ", Height: " + this.boardElementHeigth + ", Width: " + this.boardElementWidth;

    }
}