package application.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;

public class PieChartController {

	@FXML
	private Pane paneview;

	@FXML
	private void initialize() {
		load();
	}

	private void load() {
		ObservableList<PieChart.Data> pieChartData = 
				FXCollections.observableArrayList(new PieChart.Data("Grapefruit", 13), new PieChart.Data("Oranges", 25),
						new PieChart.Data("Plums", 10),new PieChart.Data("Pears", 22), new PieChart.Data("Apples", 30));
		
		final PieChart chart = new PieChart(pieChartData);
		chart.setTitle("Imported Fruits");
		
		paneview.getChildren().add(chart);
	}
}