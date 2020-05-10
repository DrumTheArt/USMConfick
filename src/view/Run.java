package view;

import Entities.SingleBoardElement;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Run extends Application {

    //10x10 SingleBoardElementViews
    private SingleBoardElementView[][] allBoardElements =  new SingleBoardElementView[ViewSizes.NUMBERS_OF_POSSIBLE_X_ELEMENTS][ViewSizes.NUMBERS_OF_POSSIBLE_Y_ELEMENTS];
    private Pane root = new Pane();

    private void createSingleBoardElements(){

/**
        for (int xElement = 0; xElement <ViewSizes.NUMBERS_OF_POSSIBLE_X_ELEMENTS; xElement++) {

            for(int yElement = 0; yElement<ViewSizes.NUMBERS_OF_POSSIBLE_Y_ELEMENTS; yElement++){

                SingleBoardElementView view = new SingleBoardElementView(xElement, yElement);
                allBoardElements[xElement][yElement] = view;
                root.getChildren().add(view);
            }
        }


        for (int xElement = 0; xElement <10; xElement++) {

            SingleBoardElementView view = new SingleBoardElementView(1, xElement);
            allBoardElements[xElement] = view;
            root.getChildren().add(view);
        }

         **/
        SingleBoardElementView a = new SingleBoardElementView(1,0);
        a.setColor(Color.BLUE);
        SingleBoardElementView b = new SingleBoardElementView(80*1,0);
        b.setColor(Color.GREEN);
        SingleBoardElementView c = new SingleBoardElementView(80*2,0);
        b.setColor(Color.RED);

        root.getChildren().addAll(a,b,c);

    }

    private Parent createContent(){

        root.setPrefSize(ViewSizes.SETUPVIEW_HEIGHT, ViewSizes.SETUPVIEW_WIDE);

        createSingleBoardElements();

        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}