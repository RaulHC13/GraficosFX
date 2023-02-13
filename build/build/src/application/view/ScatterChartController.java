package application.view;

import javafx.fxml.FXML;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class ScatterChartController {

	@FXML
	private Pane paneview;

	@FXML
	private void initialize() {
		load();
	}

	private void load() {
		final NumberAxis xAxis = new NumberAxis(0, 10, 1);
		final NumberAxis yAxis = new NumberAxis(-100, 500, 100);
		xAxis.setLabel("Age (years)");
		yAxis.setLabel("Returns to date");

		final ScatterChart<Number, Number> sc = new ScatterChart<>(xAxis, yAxis);
		sc.setTitle("Investment Overview");

		XYChart.Series series1 = new XYChart.Series();
		series1.setName("Equities");
		series1.getData().add(new XYChart.Data(4.2, 193.2));
		series1.getData().add(new XYChart.Data(2.8, 33.6));
		series1.getData().add(new XYChart.Data(6.2, 24.8));
		series1.getData().add(new XYChart.Data(1, 14));
		
		XYChart.Series series2 = new XYChart.Series();
        series2.setName("Mutual funds");
        series2.getData().add(new XYChart.Data(5.2, 229.2));
        series2.getData().add(new XYChart.Data(2.4, 37.6));
        series2.getData().add(new XYChart.Data(3.2, 49.8));
        series2.getData().add(new XYChart.Data(1.8, 134));
        
        sc.getData().addAll(series1, series2);
        paneview.getChildren().add(sc);
	}
}