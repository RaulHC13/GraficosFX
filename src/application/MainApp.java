package application;

import java.io.IOException;

import application.view.RootLayoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
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
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void initLineChart() {
		 try {
			 
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(MainApp.class.getResource("view/LineChart.fxml"));
			 AnchorPane layout = (AnchorPane) loader.load();
			 
			 rootLayout.setCenter(layout);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void initPieChart() {
		 try {
			 
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(MainApp.class.getResource("view/PieChart.fxml"));
			 AnchorPane layout = (AnchorPane) loader.load();
			 
			 rootLayout.setCenter(layout);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void initScatterChart() {
		 try {
			 
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(MainApp.class.getResource("view/ScatterChart.fxml"));
			 AnchorPane layout = (AnchorPane) loader.load();
			 
			 rootLayout.setCenter(layout);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}