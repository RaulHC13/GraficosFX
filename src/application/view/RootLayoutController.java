/**
 * JavaFX2_charts_statistics_HerreriasCorralRaul - application.view - RootLayoutController.java
 * 9 feb 2023 - 13:17:03
 * @author Raúl Herrerías Corral
 */
package application.view;

import application.MainApp;
import javafx.fxml.FXML;

public class RootLayoutController {
	
	private MainApp mainApp;
	
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void handleshowInitCenter() {
		mainApp.initCentro();
	}
	
	@FXML
	private void handleshowInitArea() {
		mainApp.initArea();
	}
	
	@FXML
	private void handleshowInitBarChart() {
		mainApp.initBarChart();
	}
	
	@FXML
	private void handleShowInitBubbleChart() {
		mainApp.initBubbleChart();
	}
	
	@FXML
	private void handleShowInitLineChart() {
		mainApp.initLineChart();
	}
	
	@FXML
	private void handleShowInitPieChart() {
		mainApp.initPieChart();
	}
	
	@FXML
	private void handleShowInitScatterChart() {
		mainApp.initScatterChart();
	}
}