package application;

import java.io.IOException;

import application.view.RootLayoutController;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Charts");

		initRootLayout();
		initCentro();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);

			// Give the controller access to the main app.
			RootLayoutController controller = loader.getController();
			controller.setMainApp(this);

			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initCentro() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/CentroLayout.fxml"));
			AnchorPane borderpane = (AnchorPane) loader.load();

			rootLayout.setCenter(borderpane);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initArea() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AreaChart.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();

			rootLayout.setCenter(layout);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initBarChart() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/BarChart.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();

			rootLayout.setCenter(layout);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initBubbleChart() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/BubbleChart.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();

			rootLayout.setCenter(layout);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initLineChart() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/LineChart.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();

			rootLayout.setCenter(layout);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initPieChart() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PieChart.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();

			rootLayout.setCenter(layout);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initScatterChart() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ScatterChart.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();

			rootLayout.setCenter(layout);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showWebView() {
		Stage stage = new Stage();
		
		// Create the WebView
		WebView webView = new WebView();

		// Create the WebEngine
		final WebEngine webEngine = webView.getEngine();

		// LOad the Start-Page
		webEngine.load(getClass().getResource("resources/Ayuda.html").toString());

		// Create the VBox
		VBox root = new VBox();
		// Add the WebView to the VBox
		root.getChildren().add(webView);

		// Set the Style-properties of the VBox
		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");

		// Create the Scene
		Scene scene = new Scene(root);
		// Add the Scene to the Stage
		stage.setScene(scene);
		// Display the Stage
		stage.show();
	}
	
	public void showWebBrowserView() {
		HostServices hs =  getHostServices();
        hs.showDocument(getClass().getResource("resources/ayuda.html").toString());
	}
	
	public void showPdfView() {
		HostServices hs =  getHostServices();
        hs.showDocument(getClass().getResource("resources/ayuda.pdf").toString());
	}
}