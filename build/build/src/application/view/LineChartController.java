package application.view;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class LineChartController {

	@FXML
	private Pane paneview;
	
	@FXML
	private void initialize() {
		load();
	}
	
	private void load() {
		final NumberAxis xAxis = new NumberAxis();
		final NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Number of month");
		
		final LineChart<Number, Number> lc = new LineChart<>(xAxis, yAxis);
		lc.setTitle("Stock Monitoring");
		
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        
        lc.getData().add(series);
        paneview.getChildren().add(lc);
	}
}