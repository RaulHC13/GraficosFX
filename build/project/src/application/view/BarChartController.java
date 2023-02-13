package application.view;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class BarChartController {

	@FXML
	private Pane paneview;
	
	@FXML
	private void initialize() {
		load();
	}
	
	private void load() {
		
		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		
		xAxis.setLabel("Country");
		yAxis.setLabel("Value");
		
		final BarChart<String, Number> bc = new BarChart<>(xAxis, yAxis);
		bc.setTitle("Country summary");
		
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("2003");
		series1.getData().add(new XYChart.Data("austria", 25601.34));
		series1.getData().add(new XYChart.Data("brazil", 20148.82));
        series1.getData().add(new XYChart.Data("spain", 10000));
        series1.getData().add(new XYChart.Data("italy", 35407.15));
		
		
        XYChart.Series series2 = new XYChart.Series<>();
        series2.setName("2004");
        series2.getData().add(new XYChart.Data("austria", 57401.85));
        series2.getData().add(new XYChart.Data("brazil", 41941.19));
        series2.getData().add(new XYChart.Data("spain", 45263.37));
        series2.getData().add(new XYChart.Data("italy", 117320.16));
        
		bc.getData().addAll(series1, series2);
		paneview.getChildren().add(bc);
	}
}