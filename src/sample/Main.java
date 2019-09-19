package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    public static Stage primaryStage;

    private static Scene menu;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxmlfiles/login.fxml"));
        primaryStage.setTitle("Liceo del Caribe");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }

    public  static void changeScene(String scene) throws IOException {


        if(scene == "menu"){
            primaryStage.setScene(menu);
        }

        try{
            primaryStage.setScene(new Scene(FXMLLoader.load(getFXMLURL(scene))));
            //primaryStage.sizeToScene();
            //primaryStage.setMaximized(true);
        }catch(Exception e){e.printStackTrace();}
    }


    //get the adress for a fxml
    public static URL getFXMLURL(String name)throws Exception{

        URL menuurl = new File("src/sample/fxmlfiles"+name+".fxml").toURL();
        return menuurl;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
