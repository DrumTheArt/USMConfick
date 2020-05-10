package view;

import Models.SingleBoardElementModel;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SingleBoardElementView extends StackPane {

    //Single Size of a SingleBoardElementView in Pxl
    private SingleBoardElementModel singleBoardElementModel;
    private Rectangle drawnElement;

    public void setWidth(int newWidth){

        singleBoardElementModel.setBoardElementWidth(newWidth);
    }

    public void setHeigth(int newHeigth){

        singleBoardElementModel.setBoardElementHeight(newHeigth);
    }

    public void setDepth(int newDepth){

        singleBoardElementModel.setBoardElementDepth(newDepth);
    }

    private boolean isBoardElementActive = false;

    public SingleBoardElementView(int xposition, int yposition) {

        //X und Y Standard setzen
        this.singleBoardElementModel = new SingleBoardElementModel(xposition,yposition);
        drawSingleBoardElementWithDefaultValues();

        getChildren().addAll(drawnElement);

        setTranslateX(xposition);
        setTranslateY(yposition);

        //activate or deactive tile
        this.setOnMouseClicked(e -> changeActivateStatusOfSingleBoardElement());

        //changeSizeInView
        this.setOnKeyPressed((final KeyEvent keyEvent) -> {
            if (keyEvent.getCode() == KeyCode.H) {
                changeHeightOfSingleElement(singleBoardElementModel.getHeight() + 1);
            } else if (keyEvent.getCode() == KeyCode.W) {
                changeWidthOfSingleElement(singleBoardElementModel.getWidth() + 1);
            } else if (keyEvent.getCode() == KeyCode.D) {
                changeDepthOfSingleElement(singleBoardElementModel.getDepth() + 1);
            }
        });

    }


    private void drawSingleBoardElementWithDefaultValues() {

        drawnElement = new Rectangle(singleBoardElementModel.getWidth() -2, singleBoardElementModel.getHeight()-2);
        drawnElement.setStroke(Color.BLACK);
        drawnElement.setFill(Color.LIGHTGRAY);
    }

    public void changeActivateStatusOfSingleBoardElement(){

        if(this.drawnElement.getFill() == Color.BLACK) {

            this.drawnElement.setFill(Color.LIGHTGRAY);
            isBoardElementActive = false;

        } else {

            this.drawnElement.setFill(Color.BLACK);
            isBoardElementActive = true;

        }
    }

    //6 Steps on height as long it is smaller than 5 times as the smallest tile
    public void changeHeightOfSingleElement(int newHeight){

        if(newHeight<(6* singleBoardElementModel.getHeight())) {
            drawnElement.setWidth(newHeight*2);
        }
    }

    public void changeWidthOfSingleElement(int newWidth){

        if(newWidth<(5* singleBoardElementModel.getWidth())) {
            drawnElement.setWidth(newWidth * 2);

    }}

        public void changeDepthOfSingleElement(int newDepth) {

            if (newDepth < (2 * singleBoardElementModel.getDepth())) {

                drawnElement.setFill(Color.AQUA);
            } else if (newDepth < (3 * singleBoardElementModel.getDepth())) {

                drawnElement.setFill(Color.AZURE);
            }
        }

        public SingleBoardElementModel getSingleBoardElementModel(){

            return this.singleBoardElementModel;
        }

    public void setColor(Color color){

        drawnElement.setFill(color);

    }
}