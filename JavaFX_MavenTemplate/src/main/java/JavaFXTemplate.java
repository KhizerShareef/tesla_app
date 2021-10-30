import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;

public class JavaFXTemplate extends Application {

	private static HashMap<String, Scene> sceneMap;
	private EventHandler<ActionEvent> usEvent;
	private EventHandler<ActionEvent> ukEvent;
	private EventHandler<ActionEvent> welcomeEvent;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);


	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Tesla");

		welcomeEvent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Scene mainscreen = WelcomeScreen();
				primaryStage.setScene(mainscreen);
				primaryStage.show();
			}
		};

		usEvent = new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene(sceneMap.get("us screen"));
			}

		};

		ukEvent = new EventHandler<ActionEvent>() {
			@Override
			public void handle (ActionEvent actionEvent) {
				primaryStage.setScene(sceneMap.get("uk screen"));
			}
		};


		sceneMap = new HashMap<String,Scene>();
		sceneMap.put("Welcome screen", WelcomeScreen());
		sceneMap.put("us screen", createScene("US"));
		sceneMap.put("uk screen", createScene("UK"));
		primaryStage.setScene(sceneMap.get("Welcome screen"));
		primaryStage.show();
	}



	private Scene WelcomeScreen () {
		BorderPane initRoot = new BorderPane();
		initRoot.setStyle("-fx-background-image: url(welcome.jpg)");

		Button usbutton = new Button ( "US" );
		usbutton.setOnAction(usEvent);
		usbutton.setStyle("-fx-font-family: sans-serif;-fx-font-size:24");

		Button ukbutton = new Button( "UK" );
		ukbutton.setOnAction(ukEvent);
		ukbutton.setStyle("-fx-font-family: sans-serif;-fx-font-size:24");

		Button exitbttn = new Button("exit");
		exitbttn.setOnAction(e->System.exit(0));
		exitbttn.setStyle("-fx-font-family: sans-serif;-fx-font-size:24");

		HBox v1 = new HBox();
		v1.getChildren().addAll(usbutton, ukbutton, exitbttn);
		v1.setAlignment(Pos.CENTER);
		v1.setPadding(new Insets(10));
		v1.setSpacing(10);

		initRoot.setBottom(v1);
		return new Scene(initRoot, 1920, 980);

	}

	private Scene createScene ( String country ) {
		BorderPane root = new BorderPane();
		root.setStyle("-fx-background-image: url(bckgrnd.jpg)");

		//Images
		HBox v1 = new HBox ( add_imgs("modelS.jpg"), add_imgs("model3.jpg"), add_imgs("modelX.jpg"), add_imgs("modelY.jpg"));
		v1.setAlignment(Pos.BOTTOM_CENTER);
		root.setCenter(v1);

		//textfields models info
		HBox v2 = new HBox(200);
		if ( country == "UK") {
			UKclient n_client = new UKclient();
			v2.getChildren().addAll(modelInfo(n_client.modelSinfo()), modelInfo(n_client.model3info()),
					modelInfo(n_client.modelXinfo()), modelInfo(n_client.modelYinfo()));
		}
		else {
			USclient n_client = new USclient();
			v2.getChildren().addAll(modelInfo(n_client.modelSinfo()), modelInfo(n_client.model3info()),
					modelInfo(n_client.modelXinfo()), modelInfo(n_client.modelYinfo()));
		}

		v2.setAlignment(Pos.CENTER);
		v2.setPadding(new Insets(100));
		root.setBottom(v2);

		//Back button to home & exit button to terminate
		Button bck = new Button( "back");
		bck.setOnAction(welcomeEvent);
		bck.setStyle("-fx-font-family: sans-serif;-fx-font-size:24");

		Button exitbttn = new Button("exit");
		exitbttn.setOnAction(e->System.exit(0));
		exitbttn.setStyle("-fx-font-family: sans-serif;-fx-font-size:24");

		HBox v3 = new HBox(20, bck, exitbttn );
		v3.setPadding(new Insets(10));
		v3.setAlignment(Pos.CENTER_LEFT);

		root.setTop(v3);
		return new Scene( root, 1920, 980 );

	}

	private ImageView add_imgs ( String s) {
		Image m_s = new Image(s);
		ImageView view_m_s = new ImageView(m_s);
		view_m_s.setFitWidth(475);
		view_m_s.setFitHeight(250);
		return view_m_s;
	}

	private Text modelInfo ( String s ) {
		Text info_s = new Text( );
		info_s.setText( s );
		info_s.setStyle("-fx-font-family: sans-serif;-fx-font-size:24");
		return info_s;
	}

}


