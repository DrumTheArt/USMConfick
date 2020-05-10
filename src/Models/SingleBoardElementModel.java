package Models;

import Entities.SingleBoardElement;

public class SingleBoardElementModel {

    private SingleBoardElement singleBoardElement;

    private int xPosition;
    private int yPosition;

    public SingleBoardElementModel(int xPosition, int yPosition){

        singleBoardElement = new SingleBoardElement();
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getWidth(){

        return singleBoardElement.getBoardElementWidth();
    }

    public int getDepth(){

        return singleBoardElement.getBoardElementDepth();
    }

    public int getHeight(){

        return singleBoardElement.getBoardElementHeight();
    }

    public int getxPosition(){

        return this.xPosition;
    }

    public int getyPosition(){

        return this.xPosition;
    }

    public void setxPosition(int newXPosition){

        this.xPosition = newXPosition;
    }

    public void setyPosition(int newYPosition){

        this.yPosition = newYPosition;
    }

    public void setBoardElementWidth(int newWidth){

        singleBoardElement.setBoardElementWidth(newWidth);
    }

    public void setBoardElementHeight(int newHeight){

        this.setBoardElementHeight(newHeight);
    }

    public void setBoardElementDepth(int newDepth){

        this.setBoardElementDepth(newDepth);
    }

    @Override
    public String toString(){

        return "Depth: " + this.getDepth() + ", Height: " + this.getHeight() + ", Width: " + this.getWidth() + ", XPosition: " + getxPosition() + ", YPosition: " + getyPosition();

    }
}